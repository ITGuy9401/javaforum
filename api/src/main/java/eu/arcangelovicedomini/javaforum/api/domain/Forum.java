package eu.arcangelovicedomini.javaforum.api.domain;

import javax.persistence.*;
import java.sql.Blob;
import java.util.List;

@Entity
@Table(name = "FORUM")
public class Forum extends BaseEntity {
    private Long forumId;
    private String name;
    private String description;
    private Boolean maintenanceMode;
    private String maintenancePassword;
    private Blob logo;
    private User owner;
    private List<Area> areas;
    private List<Group> groups;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FORUM_ID")
    public Long getForumId() {
        return forumId;
    }

    public void setForumId(Long forumId) {
        this.forumId = forumId;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "IS_MAINTENANCE_MODE")
    public Boolean getMaintenanceMode() {
        return maintenanceMode;
    }

    public void setMaintenanceMode(Boolean maintenanceMode) {
        this.maintenanceMode = maintenanceMode;
    }

    @Column(name = "MAINTENANCE_PWD")
    public String getMaintenancePassword() {
        return maintenancePassword;
    }

    public void setMaintenancePassword(String maintenancePassword) {
        this.maintenancePassword = maintenancePassword;
    }

    @Lob
    @Column(name = "LOGO")
    public Blob getLogo() {
        return logo;
    }

    public void setLogo(Blob logo) {
        this.logo = logo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "OWNER_ID")
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @OneToMany(mappedBy = "FORUM_ID", fetch = FetchType.EAGER)
    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    @OneToMany(mappedBy = "FORUM_ID", fetch = FetchType.LAZY)
    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
