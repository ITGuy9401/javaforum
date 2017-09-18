package eu.arcangelovicedomini.javaforum.api.domain;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.domain.List;

import javax.persistence.*;

@Entity
@Table(name = "THREAD")
public class Thread extends BaseEntity {
    private String uuid;
    private String title;
    private String shortDescription;
    private Section section;
    private List<Post> posts;

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

    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "DESCRIPTION")
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @ManyToOne
    @JoinColumn(name = "SECTION_UUID")
    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    @OneToMany(mappedBy = "THREAD_UUID")
    @OrderBy("creationDate ASC")
    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
