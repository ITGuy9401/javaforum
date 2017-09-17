package eu.arcangelovicedomini.javaforum.api.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Blob;

@Entity
@Table(name = "FORUM")
public class Forum {
    private Long forumId;
    private String name;
    private String description;
    private Boolean maintenanceMode;
    private String maintenancePassword;
    private Blob logo;
}
