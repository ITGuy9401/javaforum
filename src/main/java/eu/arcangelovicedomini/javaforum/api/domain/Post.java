package eu.arcangelovicedomini.javaforum.api.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Clob;
import java.util.List;

@Entity
@Table(name = "POST")
public class Post extends BaseEntity {
    private String uuid;
    private String title;
    private User author;
    private Clob message;
    private Thread thread;
    private List<UploadedMedia> uploadedMedia;

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

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne
    @JoinColumn(name = "AUTHOR_USER")
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Lob
    @Column(name = "MESSAGE", nullable = false)
    public Clob getMessage() {
        return message;
    }

    public void setMessage(Clob message) {
        this.message = message;
    }

    @ManyToOne
    @JoinColumn(name = "THREAD_UUID", nullable = false)
    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    @OneToMany(mappedBy = "post")
    public List<UploadedMedia> getUploadedMedia() {
        return uploadedMedia;
    }

    public void setUploadedMedia(List<UploadedMedia> uploadedMedia) {
        this.uploadedMedia = uploadedMedia;
    }
}
