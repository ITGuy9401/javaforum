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
@Table(name = "I18N_LANGUAGE")
public class I18NLanguage implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = -1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long languageId;
	
	public Long getLanguageId() {
		return languageId;
	}
	
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}
	
	@Column(name = "LANGUAGE_CODE", nullable = false)
	private String languageCode;
	
	public String getLanguageCode() {
		return languageCode;
	}
	
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
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
		if (!(object instanceof I18NLanguage)) {
			return false;
		}
		final I18NLanguage that = (I18NLanguage) object;
		if (this.languageId == null || that.getLanguageId() == null || !this.languageId.equals(that.getLanguageId())) {
			return false;
		}
		return true;
	}

	/**
	 * Returns a hash code based on this entity's identifiers.
	 */
	public int hashCode() {
		int hashCode = 0;
		hashCode = 29 * hashCode + (languageId == null ? 0 : languageId.hashCode());

		return hashCode;
	}

	/**
	 * Constructs new instances of {@link I18NLanguage}.
	 */
	public static final class Factory {
		/**
		 * Constructs a new instance of {@link I18NLanguage}.
		 */
		public static I18NLanguage newInstance() {
			return new I18NLanguage();
		}

		/**
		 * Constructs a new instance of {@link I18NLanguage}, taking all required and/or
		 * read-only properties as arguments.
		 */
		public static I18NLanguage newInstance(String languageCode) {
			final I18NLanguage entity = new I18NLanguage();
			entity.setLanguageCode(languageCode);
			return entity;
		}

	}

}