package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 */
@Table(name = "CUSTOM_ATTRIBUTE")
public class CustomAttribute implements Serializable {

	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = -4904283066091513583L;

	private Long customAttributeId;

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Long getCustomAttributeId() {
		return this.customAttributeId;
	}

	public void setCustomAttributeId(Long customAttributeId) {
		this.customAttributeId = customAttributeId;
	}

	private EnumAccessType defaultAccessType;

	/**
	 * 
	 */
	@Column(name = "DEF_ACCESS_TYPE")
	public EnumAccessType getDefaultAccessType() {
		return this.defaultAccessType;
	}

	public void setDefaultAccessType(EnumAccessType defaultAccessType) {
		this.defaultAccessType = defaultAccessType;
	}

	private String iconClass;

	@Column(name = "ICON_CLASS")
	public String getIconClass() {
		return iconClass;
	}

	public void setIconClass(String iconClass) {
		this.iconClass = iconClass;
	}

	private String title;

	@Column(name = "TITLE", unique = true)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private EnumVisibilityType defaultVisibility;

	/**
	 * 
	 */
	@Column(name = "DEF_VISIBILITY")
	public EnumVisibilityType getDefaultVisibility() {
		return this.defaultVisibility;
	}

	public void setDefaultVisibility(EnumVisibilityType defaultVisibility) {
		this.defaultVisibility = defaultVisibility;
	}

	/**
	 * Returns <code>true</code> if the argument is an UserConfiguration
	 * instance and all identifiers for this entity equal the identifiers of the
	 * argument entity. Returns <code>false</code> otherwise.
	 */
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (!(object instanceof CustomAttribute)) {
			return false;
		}
		final CustomAttribute that = (CustomAttribute) object;
		if (this.customAttributeId == null || that.getCustomAttributeId() == null
				|| !this.customAttributeId.equals(that.getCustomAttributeId())) {
			return false;
		}
		return true;
	}

	/**
	 * Returns a hash code based on this entity's identifiers.
	 */
	public int hashCode() {
		int hashCode = 0;
		hashCode = 29 * hashCode + (customAttributeId == null ? 0 : customAttributeId.hashCode());

		return hashCode;
	}

	/**
	 * Constructs new instances of {@link UserConfiguration}.
	 */
	public static final class Factory {
		/**
		 * Constructs a new instance of {@link UserConfiguration} .
		 */
		public static CustomAttribute newInstance() {
			return new CustomAttribute();
		}

		/**
		 * Constructs a new instance of {@link UserConfiguration} , taking all
		 * possible properties (except the identifier(s))as arguments.
		 */
		public static CustomAttribute newInstance(EnumAccessType defaultAccessType, String title, String iconClass,
				EnumVisibilityType visibility) {
			final CustomAttribute entity = new CustomAttribute();
			entity.setDefaultAccessType(defaultAccessType);
			entity.setIconClass(iconClass);
			entity.setTitle(title);
			entity.setDefaultVisibility(visibility);
			return entity;
		}
	}
}