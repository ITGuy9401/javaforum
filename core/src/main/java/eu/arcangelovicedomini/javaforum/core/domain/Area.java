package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class Area implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = -8058752111642518049L;

	private Long areaId;

	/**
	 * 
	 */
	public Long getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
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

	private Forum forum;

	/**
	 * 
	 */
	public Forum getForum() {
		return this.forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}

	private Set<Section> sections = new HashSet<Section>();

	/**
	 * 
	 */
	public Set<Section> getSections() {
		return this.sections;
	}

	public void setSections(Set<Section> sections) {
		this.sections = sections;
	}

	/**
	 * Returns <code>true</code> if the argument is an Area instance and all
	 * identifiers for this entity equal the identifiers of the argument entity.
	 * Returns <code>false</code> otherwise.
	 */
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (!(object instanceof Area)) {
			return false;
		}
		final Area that = (Area) object;
		if (this.areaId == null || that.getAreaId() == null || !this.areaId.equals(that.getAreaId())) {
			return false;
		}
		return true;
	}

	/**
	 * Returns a hash code based on this entity's identifiers.
	 */
	public int hashCode() {
		int hashCode = 0;
		hashCode = 29 * hashCode + (areaId == null ? 0 : areaId.hashCode());

		return hashCode;
	}

	/**
	 * Constructs new instances of {@link Area}.
	 */
	public static final class Factory {
		/**
		 * Constructs a new instance of {@link Area}.
		 */
		public static Area newInstance() {
			return new Area();
		}

		/**
		 * Constructs a new instance of {@link Area}, taking all required and/or
		 * read-only properties as arguments.
		 */
		public static Area newInstance(String title, Forum forum) {
			final Area entity = new Area();
			entity.setTitle(title);
			entity.setForum(forum);
			return entity;
		}

		/**
		 * Constructs a new instance of {@link Area}, taking all possible
		 * properties (except the identifier(s))as arguments.
		 */
		public static Area newInstance(String title, Forum forum, Set<Section> sections) {
			final Area entity = new Area();
			entity.setTitle(title);
			entity.setForum(forum);
			entity.setSections(sections);
			return entity;
		}
	}

	// HibernateEntity.vsl merge-point
}