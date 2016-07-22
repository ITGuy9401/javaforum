package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;

/**
 * 
 */
public class UserConfiguration implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = 1786281281815671002L;

	private java.lang.Long userConfigurationId;

	/**
	 * 
	 */
	public java.lang.Long getUserConfigurationId() {
		return this.userConfigurationId;
	}

	public void setUserConfigurationId(java.lang.Long userConfigurationId) {
		this.userConfigurationId = userConfigurationId;
	}

	private EnumAccessType accessType;

	/**
	 * 
	 */
	public EnumAccessType getAccessType() {
		return this.accessType;
	}

	public void setAccessType(EnumAccessType accessType) {
		this.accessType = accessType;
	}

	private java.lang.String attribute;

	/**
	 * 
	 */
	public java.lang.String getAttribute() {
		return this.attribute;
	}

	public void setAttribute(java.lang.String attribute) {
		this.attribute = attribute;
	}

	private EnumVisibilityType visibility;

	/**
	 * 
	 */
	public EnumVisibilityType getVisibility() {
		return this.visibility;
	}

	public void setVisibility(EnumVisibilityType visibility) {
		this.visibility = visibility;
	}

	private User user;

	/**
	 * 
	 */
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
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
		if (!(object instanceof UserConfiguration)) {
			return false;
		}
		final UserConfiguration that = (UserConfiguration) object;
		if (this.userConfigurationId == null || that.getUserConfigurationId() == null
				|| !this.userConfigurationId.equals(that.getUserConfigurationId())) {
			return false;
		}
		return true;
	}

	/**
	 * Returns a hash code based on this entity's identifiers.
	 */
	public int hashCode() {
		int hashCode = 0;
		hashCode = 29 * hashCode + (userConfigurationId == null ? 0 : userConfigurationId.hashCode());

		return hashCode;
	}

	/**
	 * Constructs new instances of
	 * {@link UserConfiguration}.
	 */
	public static final class Factory {
		/**
		 * Constructs a new instance of
		 * {@link UserConfiguration}
		 * .
		 */
		public static UserConfiguration newInstance() {
			return new UserConfiguration();
		}

		/**
		 * Constructs a new instance of
		 * {@link UserConfiguration}
		 * , taking all possible properties (except the identifier(s))as
		 * arguments.
		 */
		public static UserConfiguration newInstance(
				EnumAccessType accessType, java.lang.String attribute,
				EnumVisibilityType visibility,
				User user) {
			final UserConfiguration entity = new UserConfiguration();
			entity.setAccessType(accessType);
			entity.setAttribute(attribute);
			entity.setVisibility(visibility);
			entity.setUser(user);
			return entity;
		}
	}

	// HibernateEntity.vsl merge-point
}