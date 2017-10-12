package eu.arcangelovicedomini.javaforum.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.http.MediaType;

@Entity
@Table(name = "UPLOADED_MEDIA")
public class UploadedMedia extends BaseEntity {
    private String uuid;
    private String title;
    private String filename;
    private Long filesize;
    private MediaType mediaType;
    private User author;
  private String pathOnServer;
    private Post post;

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

    @Column(name = "FILE_NAME")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Column(name = "FILE_SIZE")
    public Long getFilesize() {
        return filesize;
    }

    public void setFilesize(Long filesize) {
        this.filesize = filesize;
    }

    @Column(name = "MEDIA_TYPE")
    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    @ManyToOne
    @JoinColumn(name = "AUTHOR_USER_ID")
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

  @Column(name = "PATH_ON_SERVER")
  public String getPathOnServer() {
    return pathOnServer;
    }

  public void setPathOnServer(String pathOnServer) {
    this.pathOnServer = pathOnServer;
    }

    @ManyToOne
    @JoinColumn(name = "POST_UUID")
    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
