package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;

/**
 * 
 */
public class Forum implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = -1503157004336213098L;

	private java.lang.Long forumId;

	/**
	 * 
	 */
	public java.lang.Long getForumId() {
		return this.forumId;
	}

	public void setForumId(java.lang.Long forumId) {
		this.forumId = forumId;
	}

	private java.lang.String title;

	/**
	 * <p>
	 * Title of the forum
	 * </p>
	 */
	public java.lang.String getTitle() {
		return this.title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	private java.lang.String description;

	/**
	 * <p>
	 * Short description of the forum
	 * </p>
	 */
	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	private java.util.Set<Area> areas = new java.util.HashSet<Area>();

	/**
	 * 
	 */
	public java.util.Set<Area> getAreas() {
		return this.areas;
	}

	public void setAreas(java.util.Set<Area> areas) {
		this.areas = areas;
	}

	/**
	 * Returns <code>true</code> if the argument is an Forum instance and all
	 * identifiers for this entity equal the identifiers of the argument entity.
	 * Returns <code>false</code> otherwise.
	 */
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (!(object instanceof Forum)) {
			return false;
		}
		final Forum that = (Forum) object;
		if (this.forumId == null || that.getForumId() == null || !this.forumId.equals(that.getForumId())) {
			return false;
		}
		return true;
	}

	/**
	 * Returns a hash code based on this entity's identifiers.
	 */
	public int hashCode() {
		int hashCode = 0;
		hashCode = 29 * hashCode + (forumId == null ? 0 : forumId.hashCode());

		return hashCode;
	}

	/**
	 * Constructs new instances of {@link Forum}.
	 */
	public static final class Factory {
		/**
		 * Constructs a new instance of {@link Forum}.
		 */
		public static Forum newInstance() {
			return new Forum();
		}

		/**
		 * Constructs a new instance of {@link Forum}, taking all required
		 * and/or read-only properties as arguments.
		 */
		public static Forum newInstance(java.lang.String title) {
			final Forum entity = new Forum();
			entity.setTitle(title);
			return entity;
		}

		/**
		 * Constructs a new instance of {@link Forum}, taking all possible
		 * properties (except the identifier(s))as arguments.
		 */
		public static Forum newInstance(java.lang.String title, java.lang.String description,
				java.util.Set<Area> areas) {
			final Forum entity = new Forum();
			entity.setTitle(title);
			entity.setDescription(description);
			entity.setAreas(areas);
			return entity;
		}
	}

	// HibernateEntity.vsl merge-point
}