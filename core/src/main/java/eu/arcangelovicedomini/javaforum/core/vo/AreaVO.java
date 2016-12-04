package eu.arcangelovicedomini.javaforum.core.vo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import eu.arcangelovicedomini.javaforum.core.domain.Area;
import eu.arcangelovicedomini.javaforum.core.domain.Forum;
import eu.arcangelovicedomini.javaforum.core.domain.Section;

public class AreaVO implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = -8058752111642518049L;

	private Long areaId;

	public Long getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	private String title;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private String description;
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	private Set<SectionVO> sections = new HashSet<Section>();

	public Set<SectionVO> getSections() {
		return this.sections;
	}

	public void setSections(Set<SectionVO> sections) {
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
}
