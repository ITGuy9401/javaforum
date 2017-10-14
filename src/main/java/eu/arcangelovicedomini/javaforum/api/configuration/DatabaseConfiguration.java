package eu.arcangelovicedomini.javaforum.api.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class DatabaseConfiguration {

    @Autowired
    private Environment env;
    @Autowired
    private DataSource dataSource;
    @Autowired
    private LocalContainerEntityManagerFactoryBean entityManagerFactory;

    /**
     * DataSource definition for database connection. Settings are read from
     * the application.properties file (using the env object).
     */
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        driverManagerDataSource.setUrl(env.getProperty("spring.datasource.url"));
        driverManagerDataSource.setUsername(env.getProperty("spring.datasource.username"));
        driverManagerDataSource.setPassword(env.getProperty("spring.datasource.password"));
        return driverManagerDataSource;
    }

    // Private fields

    /**
     * Declare the JPA entity manager factory.
     */
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactory =
                new LocalContainerEntityManagerFactoryBean();

        localContainerEntityManagerFactory.setDataSource(dataSource);

        // Classpath scanning of @Component, @Service, etc annotated class
        localContainerEntityManagerFactory.setPackagesToScan("eu.arcangelovicedomini.javaforum.api.*");

        // Vendor adapter
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        localContainerEntityManagerFactory.setJpaVendorAdapter(vendorAdapter);

        // Hibernate properties
        Properties additionalProperties = new Properties();
        additionalProperties.put(
                "hibernate.dialect",
                env.getProperty("hibernate.dialect"));
        additionalProperties.put(
                "hibernate.show_sql",
                env.getProperty("hibernate.show_sql"));
        additionalProperties.put(
                "hibernate.hbm2ddl.auto",
                env.getProperty("hibernate.hbm2ddl.auto"));
        localContainerEntityManagerFactory.setJpaProperties(additionalProperties);

        return localContainerEntityManagerFactory;
    }

    /**
     * Declare the transaction manager.
     */
    @Bean
    public JpaTransactionManager transactionManager() {
        JpaTransactionManager jpaTransactionManager =
                new JpaTransactionManager();
        jpaTransactionManager.setEntityManagerFactory(
                entityManagerFactory.getObject());
        return jpaTransactionManager;
    }

    /**
     * PersistenceExceptionTranslationPostProcessor is a bean post processor
     * which adds an advisor to any bean annotated with Repository so that any
     * platform-specific exceptions are caught and then rethrown as one
     * Spring's unchecked data access exceptions (i.e. a subclass of
     * DataAccessException).
     */
    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

}
