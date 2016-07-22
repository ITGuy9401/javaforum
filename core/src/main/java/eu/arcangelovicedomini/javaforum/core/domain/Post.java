package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 */
@Table(name = "POST")
public class Post implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = 4007626275325189842L;

	private Long postId;

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
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
	@Column(name = "TITLE")
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
	@Column(name = "CONTENT")
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
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_ON")
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
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EDITED_ON")
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
	@Column(name = "THREAD_ID")
	@ManyToOne(optional = false, targetEntity = Thread.class)
	public Thread getThread() {
		return this.thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	private Profile author;

	/**
	 * 
	 */

	@Column(name = "AUTHOR_ID")
	@ManyToOne(optional = false, targetEntity = Profile.class)
	public Profile getAuthor() {
		return this.author;
	}

	public void setAuthor(Profile author) {
		this.author = author;
	}

	private Profile editor;

	/**
	 * 
	 */
	@Column(name = "EDITOR_ID")
	@ManyToOne(optional = false, targetEntity = Profile.class)
	public Profile getEditor() {
		return this.editor;
	}

	public void setEditor(Profile editor) {
		this.editor = editor;
	}

	private Post newVersion;

	/**
	 * 
	 */
	@Column(name = "NEW_VERSION_ID")
	@OneToOne(mappedBy = "oldVersion", targetEntity = Post.class)
	public Post getNewVersion() {
		return this.newVersion;
	}

	public void setNewVersion(Post newVersion) {
		this.newVersion = newVersion;
	}

	private Post oldVersion;

	/**
	 * 
	 */
	@Column(name = "OLD_VERSION_ID")
	@OneToOne(mappedBy = "newVersion", targetEntity = Post.class)
	public Post getOldVersion() {
		return this.oldVersion;
	}

	public void setOldVersion(Post oldVersion) {
		this.oldVersion = oldVersion;
	}

	/**
	 * Returns <code>true</code> if the argument is an Post instance and all
	 * identifiers for this entity equal the identifiers of the argument entity.
	 * Returns <code>false</code> otherwise.
	 */
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (!(object instanceof Post)) {
			return false;
		}
		final Post that = (Post) object;
		if (this.postId == null || that.getPostId() == null || !this.postId.equals(that.getPostId())) {
			return false;
		}
		return true;
	}

	/**
	 * Returns a hash code based on this entity's identifiers.
	 */
	public int hashCode() {
		int hashCode = 0;
		hashCode = 29 * hashCode + (postId == null ? 0 : postId.hashCode());

		return hashCode;
	}

	/**
	 * Constructs new instances of {@link Post}.
	 */
	public static final class Factory {
		/**
		 * Constructs a new instance of {@link Post}.
		 */
		public static Post newInstance() {
			return new Post();
		}

		/**
		 * Constructs a new instance of {@link Post}, taking all required and/or
		 * read-only properties as arguments.
		 */
		public static Post newInstance(String title, String content, Date createdOn, Thread thread, Profile author) {
			final Post entity = new Post();
			entity.setTitle(title);
			entity.setContent(content);
			entity.setCreatedOn(createdOn);
			entity.setThread(thread);
			entity.setAuthor(author);
			return entity;
		}

		/**
		 * Constructs a new instance of {@link Post}, taking all possible
		 * properties (except the identifier(s))as arguments.
		 */
		public static Post newInstance(String title, String content, Date createdOn, Date editedOn, Thread thread,
				Profile author, Profile editor, Post newVersion, Post oldVersion) {
			final Post entity = new Post();
			entity.setTitle(title);
			entity.setContent(content);
			entity.setCreatedOn(createdOn);
			entity.setEditedOn(editedOn);
			entity.setThread(thread);
			entity.setAuthor(author);
			entity.setEditor(editor);
			entity.setNewVersion(newVersion);
			entity.setOldVersion(oldVersion);
			return entity;
		}
	}

	// HibernateEntity.vsl merge-point
}