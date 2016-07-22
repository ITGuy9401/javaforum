package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;

/**
 * 
 */
public class Section implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = -1832735461772371565L;

	private java.lang.Long sectionId;

	/**
	 * 
	 */
	public java.lang.Long getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(java.lang.Long sectionId) {
		this.sectionId = sectionId;
	}

	private java.lang.String title;

	/**
	 * <p>
	 * Title of the section
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
	 * Description of the section.
	 * </p>
	 */
	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	private Area area;

	/**
	 * 
	 */
	public Area getArea() {
		return this.area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	private java.util.Set<Thread> threads = new java.util.HashSet<Thread>();

	/**
	 * 
	 */
	public java.util.Set<Thread> getThreads() {
		return this.threads;
	}

	public void setThreads(java.util.Set<Thread> threads) {
		this.threads = threads;
	}

	private java.util.Set<Section> childSections = new java.util.HashSet<Section>();

	/**
	 * 
	 */
	public java.util.Set<Section> getChildSections() {
		return this.childSections;
	}

	public void setChildSections(java.util.Set<Section> childSections) {
		this.childSections = childSections;
	}

	private Section fatherSection;

	/**
	 * 
	 */
	public Section getFatherSection() {
		return this.fatherSection;
	}

	public void setFatherSection(Section fatherSection) {
		this.fatherSection = fatherSection;
	}

	/**
	 * Returns <code>true</code> if the argument is an Section instance and all
	 * identifiers for this entity equal the identifiers of the argument entity.
	 * Returns <code>false</code> otherwise.
	 */
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (!(object instanceof Section)) {
			return false;
		}
		final Section that = (Section) object;
		if (this.sectionId == null || that.getSectionId() == null || !this.sectionId.equals(that.getSectionId())) {
			return false;
		}
		return true;
	}

	/**
	 * Returns a hash code based on this entity's identifiers.
	 */
	public int hashCode() {
		int hashCode = 0;
		hashCode = 29 * hashCode + (sectionId == null ? 0 : sectionId.hashCode());

		return hashCode;
	}

	/**
	 * Constructs new instances of
	 * {@link Section}.
	 */
	public static final class Factory {
		/**
		 * Constructs a new instance of
		 * {@link Section}.
		 */
		public static Section newInstance() {
			return new Section();
		}

		/**
		 * Constructs a new instance of
		 * {@link Section}, taking
		 * all required and/or read-only properties as arguments.
		 */
		public static Section newInstance(java.lang.String title,
				java.lang.String description) {
			final Section entity = new Section();
			entity.setTitle(title);
			entity.setDescription(description);
			return entity;
		}

		/**
		 * Constructs a new instance of
		 * {@link Section}, taking
		 * all possible properties (except the identifier(s))as arguments.
		 */
		public static Section newInstance(java.lang.String title,
				java.lang.String description, Area area,
				java.util.Set<Thread> threads,
				java.util.Set<Section> childSections,
				Section fatherSection) {
			final Section entity = new Section();
			entity.setTitle(title);
			entity.setDescription(description);
			entity.setArea(area);
			entity.setThreads(threads);
			entity.setChildSections(childSections);
			entity.setFatherSection(fatherSection);
			return entity;
		}
	}

	// HibernateEntity.vsl merge-point
}