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
}