package eu.arcangelovicedomini.javaforum.core.vo;

import java.io.Serializable;
import java.util.Date;

import eu.arcangelovicedomini.javaforum.core.domain.Post;

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

	/**
	 * Returns <code>true</code> if the argument is an Post instance and all
	 * identifiers for this entity equal the identifiers of the argument entity.
	 * Returns <code>false</code> otherwise.
	 */
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (!(object instanceof PostVO)) {
			return false;
		}
		final PostVO that = (PostVO) object;
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
		public static PostVO newInstance() {
			return new PostVO();
		}

		/**
		 * Constructs a new instance of {@link Post}, taking all required and/or
		 * read-only properties as arguments.
		 */
		public static PostVO newInstance(String title, String content, Date createdOn, Thread thread, ProfileVO author) {
			final PostVO entity = new PostVO();
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
		public static PostVO newInstance(String title, String content, Date createdOn, Date editedOn, Thread thread,
				ProfileVO author, ProfileVO editor, PostVO newVersion, PostVO oldVersion) {
			final PostVO entity = new PostVO();
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