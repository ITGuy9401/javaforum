package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;

/**
 * 
 */
public class Post implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = 4007626275325189842L;

	private java.lang.Long postId;

	/**
	 * 
	 */
	public java.lang.Long getPostId() {
		return this.postId;
	}

	public void setPostId(java.lang.Long postId) {
		this.postId = postId;
	}

	private java.lang.String title;

	/**
	 * 
	 */
	public java.lang.String getTitle() {
		return this.title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	private java.lang.String message;

	/**
	 * 
	 */
	public java.lang.String getMessage() {
		return this.message;
	}

	public void setMessage(java.lang.String message) {
		this.message = message;
	}

	private java.sql.Timestamp createdOn;

	/**
	 * 
	 */
	public java.sql.Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(java.sql.Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	private java.sql.Timestamp editedOn;

	/**
	 * 
	 */
	public java.sql.Timestamp getEditedOn() {
		return this.editedOn;
	}

	public void setEditedOn(java.sql.Timestamp editedOn) {
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

	private Profile author;

	/**
	 * 
	 */
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
		public static Post newInstance(java.lang.String title, java.lang.String message, java.sql.Timestamp createdOn,
				Thread thread, Profile author) {
			final Post entity = new Post();
			entity.setTitle(title);
			entity.setMessage(message);
			entity.setCreatedOn(createdOn);
			entity.setThread(thread);
			entity.setAuthor(author);
			return entity;
		}

		/**
		 * Constructs a new instance of {@link Post}, taking all possible
		 * properties (except the identifier(s))as arguments.
		 */
		public static Post newInstance(java.lang.String title, java.lang.String message, java.sql.Timestamp createdOn,
				java.sql.Timestamp editedOn, Thread thread, Profile author, Profile editor, Post newVersion,
				Post oldVersion) {
			final Post entity = new Post();
			entity.setTitle(title);
			entity.setMessage(message);
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