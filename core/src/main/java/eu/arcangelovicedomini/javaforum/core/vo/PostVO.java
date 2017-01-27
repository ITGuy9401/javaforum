package eu.arcangelovicedomini.javaforum.core.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 */
public class PostVO implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = 1;

	private Long postId;

	/**
	 * 
	 */
	public Long getPostId() {
		return this.postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	private String title;

	/**
	 * 
	 */
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private String content;

	/**
	 * 
	 */
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	private Date createdOn;

	/**
	 * 
	 */
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	private Date editedOn;

	/**
	 * 
	 */
	public Date getEditedOn() {
		return this.editedOn;
	}

	public void setEditedOn(Date editedOn) {
		this.editedOn = editedOn;
	}

	private Thread thread;

	/**
	 * 
	 */
	public Thread getThread() {
		return this.thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	private ProfileVO author;

	/**
	 * 
	 */
	public ProfileVO getAuthor() {
		return this.author;
	}

	public void setAuthor(ProfileVO author) {
		this.author = author;
	}

	private ProfileVO editor;

	/**
	 * 
	 */
	public ProfileVO getEditor() {
		return this.editor;
	}

	public void setEditor(ProfileVO editor) {
		this.editor = editor;
	}

	private PostVO newVersion;

	/**
	 * 
	 */
	public PostVO getNewVersion() {
		return this.newVersion;
	}

	public void setNewVersion(PostVO newVersion) {
		this.newVersion = newVersion;
	}

	private PostVO oldVersion;

	/**
	 * 
	 */
	public PostVO getOldVersion() {
		return this.oldVersion;
	}

	public void setOldVersion(PostVO oldVersion) {
		this.oldVersion = oldVersion;
	}

}