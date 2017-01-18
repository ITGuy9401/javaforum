package eu.arcangelovicedomini.javaforum.core.domain;

import javax.persistence.Embeddable;

@Embeddable
public class I18NResourcePK {

	private I18NLanguage language;
	
	public I18NLanguage getLanguage() {
		return language;
	}
	
	public void setLanguage(I18NLanguage language) {
		this.language = language;
	}
	
	private String resourceKey;
	
	public String getResourceKey() {
		return resourceKey;
	}
	
	public void setResourceKey(String resourceKey) {
		this.resourceKey = resourceKey;
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
		if (!(object instanceof I18NResourcePK)) {
			return false;
		}
		final I18NResourcePK that = (I18NResourcePK) object;
		
		return this.language.getLanguageId().equals(that.getLanguage().getLanguageId()) && this.getResourceKey().equals(that.getResourceKey());
	}

	/**
	 * Returns a hash code based on this entity's identifiers.
	 */
	public int hashCode() {
		int hashCode = 0;
		hashCode = 29 * hashCode + (language == null ? 0 : language.hashCode()) + (resourceKey == null ? 0 : resourceKey.hashCode());

		return hashCode;
	}
}
