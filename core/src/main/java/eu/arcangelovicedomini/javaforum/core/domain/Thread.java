package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;

/**
 * 
 */
public class Thread implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = -5014929886250293423L;

	private java.lang.Long threadId;

	/**
	 * 
	 */
	public java.lang.Long getThreadId() {
		return this.threadId;
	}

	public void setThreadId(java.lang.Long threadId) {
		this.threadId = threadId;
	}

	private EnumThreadStatus status;

	/**
	 * 
	 */
	public EnumThreadStatus getStatus() {
		return this.status;
	}

	public void setStatus(EnumThreadStatus status) {
		this.status = status;
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

	private java.util.Set<Post> posts = new java.util.HashSet<Post>();

	/**
	 * 
	 */
	public java.util.Set<Post> getPosts() {
		return this.posts;
	}

	public void setPosts(java.util.Set<Post> posts) {
		this.posts = posts;
	}

	private Section section;

	/**
	 * 
	 */
	public Section getSection() {
		return this.section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	/**
	 * Returns <code>true</code> if the argument is an Thread instance and all
	 * identifiers for this entity equal the identifiers of the argument entity.
	 * Returns <code>false</code> otherwise.
	 */
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (!(object instanceof Thread)) {
			return false;
		}
		final Thread that = (Thread) object;
		if (this.threadId == null || that.getThreadId() == null || !this.threadId.equals(that.getThreadId())) {
			return false;
		}
		return true;
	}

	/**
	 * Returns a hash code based on this entity's identifiers.
	 */
	public int hashCode() {
		int hashCode = 0;
		hashCode = 29 * hashCode + (threadId == null ? 0 : threadId.hashCode());

		return hashCode;
	}

	/**
	 * Constructs new instances of
	 * {@link Thread}.
	 */
	public static final class Factory {
		/**
		 * Constructs a new instance of
		 * {@link Thread}.
		 */
		public static Thread newInstance() {
			return new Thread();
		}

		/**
		 * Constructs a new instance of
		 * {@link Thread}, taking
		 * all required and/or read-only properties as arguments.
		 */
		public static Thread newInstance(
				EnumThreadStatus status, java.lang.String title,
				Section section) {
			final Thread entity = new Thread();
			entity.setStatus(status);
			entity.setTitle(title);
			entity.setSection(section);
			return entity;
		}

		/**
		 * Constructs a new instance of
		 * {@link Thread}, taking
		 * all possible properties (except the identifier(s))as arguments.
		 */
		public static Thread newInstance(
				EnumThreadStatus status, java.lang.String title,
				java.util.Set<Post> posts,
				Section section) {
			final Thread entity = new Thread();
			entity.setStatus(status);
			entity.setTitle(title);
			entity.setPosts(posts);
			entity.setSection(section);
			return entity;
		}
	}

	// HibernateEntity.vsl merge-point
}