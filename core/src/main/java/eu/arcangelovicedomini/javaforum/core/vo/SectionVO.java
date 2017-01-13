package eu.arcangelovicedomini.javaforum.core.vo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class SectionVO implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = 1;

	private Long sectionId;

	/**
	 * 
	 */
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

	public void setDescription(String description) {
		this.description = description;
	}

	private AreaVO area;

	/**
	 * 
	 */
	public AreaVO getArea() {
		return this.area;
	}

	public void setArea(AreaVO area) {
		this.area = area;
	}

	private Set<ThreadVO> threads = new HashSet<ThreadVO>();

	/**
	 * 
	 */
	public Set<ThreadVO> getThreads() {
		return this.threads;
	}

	public void setThreads(Set<ThreadVO> threads) {
		this.threads = threads;
	}

	private Set<SectionVO> childSections = new HashSet<SectionVO>();

	/**
	 * 
	 */
	public Set<SectionVO> getChildSections() {
		return this.childSections;
	}

	public void setChildSections(Set<SectionVO> childSections) {
		this.childSections = childSections;
	}

	private SectionVO fatherSection;

	/**
	 * 
	 */
	public SectionVO getFatherSection() {
		return this.fatherSection;
	}

	public void setFatherSection(SectionVO fatherSection) {
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
		if (!(object instanceof SectionVO)) {
			return false;
		}
		final SectionVO that = (SectionVO) object;
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
}