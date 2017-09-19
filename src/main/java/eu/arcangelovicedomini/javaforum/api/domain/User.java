package eu.arcangelovicedomini.javaforum.api.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Blob;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Table(name = "USER")
public class User extends BaseEntity {
    private String uuid;
    private String username;
    private String email;
    private String password;
    private Blob profilePic;
    private Boolean isMasterAdmin;
    private ZonedDateTime birthDate;
    private ZonedDateTime registrationDate;
    private List<UserGroups> userGroups;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "UUID")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Column(name = "USERNAME", unique = true, nullable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "EMAIL", unique = true, nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "PASSWORD", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Lob
    @Column(name = "PROFILE_PIC")
    public Blob getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(Blob profilePic) {
        this.profilePic = profilePic;
    }

    @Column(name = "BIRTH_DATE")
    public ZonedDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(ZonedDateTime birthDate) {
        this.birthDate = birthDate;
    }

    @Column(name = "REGISTRATION_DATE")
    public ZonedDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(ZonedDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Column(name = "IS_MASTER_ADMIN", nullable = false)
    public Boolean getMasterAdmin() {
        return isMasterAdmin;
    }

    public void setMasterAdmin(Boolean masterAdmin) {
        isMasterAdmin = masterAdmin;
    }

    @OneToMany(mappedBy = "user")
    public List<UserGroups> getUserGroups() {
        return userGroups;
    }

    public void setUserGroups(List<UserGroups> userGroups) {
        this.userGroups = userGroups;
    }
}
