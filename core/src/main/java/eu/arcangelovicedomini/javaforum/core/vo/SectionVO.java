package eu.arcangelovicedomini.javaforum.core.vo;

import java.io.Serializable;

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