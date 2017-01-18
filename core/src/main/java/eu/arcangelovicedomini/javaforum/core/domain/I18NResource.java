package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 */
@Table(name = "I18N_RESOURCE")
public class I18NResource implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = -1L;
	
	private I18NResourcePK primaryKey;
	
	@EmbeddedId
	public I18NResourcePK getPrimaryKey() {
		return primaryKey;
	}
	
	public void setPrimaryKey(I18NResourcePK primaryKey) {
		this.primaryKey = primaryKey;
	}
	
	
	private String resourceValue;
	
	@Column(name = "RESOURCE_VALUE")
	public String getResourceValue() {
		return resourceValue;
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
		if (!(object instanceof I18NResource)) {
			return false;
		}
		final I18NResource that = (I18NResource) object;
		if (this.primaryKey == null || that.getPrimaryKey() == null || !this.primaryKey.equals(that.getPrimaryKey())) {
			return false;
		}
		return true;
	}

	/**
	 * Returns a hash code based on this entity's identifiers.
	 */
	public int hashCode() {
		int hashCode = 0;
		hashCode = 29 * hashCode + (primaryKey == null ? 0 : primaryKey.hashCode());

		return hashCode;
	}

	/**
	 * Constructs new instances of {@link I18NResource}.
	 */
	public static final class Factory {
		/**
		 * Constructs a new instance of {@link I18NResource}.
		 */
		public static I18NResource newInstance() {
			return new I18NResource();
		}

		/**
		 * Constructs a new instance of {@link I18NResource}, taking all required and/or
		 * read-only properties as arguments.
		 */
		public static I18NResource newInstance(I18NLanguage language, String resourceKey, String resourceValue) {
			final I18NResource entity = new I18NResource();
			// FIXME
			return entity;
		}
	}
}