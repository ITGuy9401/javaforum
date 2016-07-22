package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 */
@Table(name = "SECTION")
public class Section implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = -1832735461772371565L;

	private Long sectionId;

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Long getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(Long sectionId) {
		this.sectionId = sectionId;
	}

	private String title;

	/**
	 * <p>
	 * Title of the section
	 * </p>
	 */
	@Column(name = "TITLE")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private String description;

	/**
	 * <p>
	 * Description of the section.
	 * </p>
	 */
	public String getDescription() {
		return this.description;
	}

	@Column(name = "DESCRIPTION")
	public void setDescription(String description) {
		this.description = description;
	}

	private Area area;

	/**
	 * 
	 */
	@Column(name = "AREA_ID")
	@ManyToOne(optional = false, targetEntity = Area.class)
	public Area getArea() {
		return this.area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	private Set<Thread> threads = new HashSet<Thread>();

	/**
	 * 
	 */
	@OneToMany(mappedBy = "section", targetEntity = Thread.class)
	public Set<Thread> getThreads() {
		return this.threads;
	}

	public void setThreads(Set<Thread> threads) {
		this.threads = threads;
	}

	private Set<Section> childSections = new HashSet<Section>();

	/**
	 * 
	 */
	@OneToMany(mappedBy = "fatherSection", targetEntity = Section.class)
	public Set<Section> getChildSections() {
		return this.childSections;
	}

	public void setChildSections(Set<Section> childSections) {
		this.childSections = childSections;
	}

	private Section fatherSection;

	/**
	 * 
	 */
	@Column(name = "FATHER_ID")
	@ManyToOne(targetEntity = Section.class)
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
	 * Constructs new instances of {@link Section}.
	 */
	public static final class Factory {
		/**
		 * Constructs a new instance of {@link Section}.
		 */
		public static Section newInstance() {
			return new Section();
		}

		/**
		 * Constructs a new instance of {@link Section}, taking all required
		 * and/or read-only properties as arguments.
		 */
		public static Section newInstance(String title, String description) {
			final Section entity = new Section();
			entity.setTitle(title);
			entity.setDescription(description);
			return entity;
		}

		/**
		 * Constructs a new instance of {@link Section}, taking all possible
		 * properties (except the identifier(s))as arguments.
		 */
		public static Section newInstance(String title, String description, Area area, Set<Thread> threads,
				Set<Section> childSections, Section fatherSection) {
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