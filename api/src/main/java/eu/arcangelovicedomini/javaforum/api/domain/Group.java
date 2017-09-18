package eu.arcangelovicedomini.javaforum.api.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "GROUP")
public class Group extends BaseEntity {
    private Long groupId;
    private String groupName;
    private String groupDescription;
    private Forum forum;
    private Boolean globalPrivileges;
    private Boolean isAdmin;
    private Boolean isModerator;
    private Section ownerSection;
    private List<UserGroups> users;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GROUP_ID")
    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @Column(name = "GROUP_NAME")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Column(name = "GROUP_DESC")
    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    @ManyToOne
    @JoinColumn(name = "FORUM_ID")
    public Forum getForum() {
        return forum;
    }

    public void setForum(Forum forum) {
        this.forum = forum;
    }

    @Column(name = "GLOBAL_PRIVILEGES")
    public Boolean getGlobalPrivileges() {
        return globalPrivileges;
    }

    public void setGlobalPrivileges(Boolean globalPrivileges) {
        this.globalPrivileges = globalPrivileges;
    }

    @Column(name = "IS_ADMIN")
    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    @Column(name = "IS_MODERATOR")
    public Boolean getModerator() {
        return isModerator;
    }

    public void setModerator(Boolean moderator) {
        isModerator = moderator;
    }

    @ManyToOne
    @JoinColumn(name = "SECTION_UUID")
    public Section getOwnerSection() {
        return ownerSection;
    }

    public void setOwnerSection(Section ownerSection) {
        this.ownerSection = ownerSection;
    }

    @OneToMany(mappedBy = "GROUP_ID")
    @OrderBy("username ASC")
    public List<UserGroups> getUsers() {
        return users;
    }

    public void setUsers(List<UserGroups> users) {
        this.users = users;
    }
}
