package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;

/**
 * 
 */
public class User implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = -7401272637454675684L;

	private java.lang.Long userId;

	/**
	 * 
	 */
	public java.lang.Long getUserId() {
		return this.userId;
	}

	public void setUserId(java.lang.Long userId) {
		this.userId = userId;
	}

	private java.lang.String userName;

	/**
	 * 
	 */
	public java.lang.String getUserName() {
		return this.userName;
	}

	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}

	private java.lang.String password;

	/**
	 * 
	 */
	public java.lang.String getPassword() {
		return this.password;
	}

	public void setPassword(java.lang.String password) {
		this.password = password;
	}

	private Profile profile;

	/**
	 * 
	 */
	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	private java.util.Set<UserConfiguration> configurations = new java.util.HashSet<UserConfiguration>();

	/**
	 * 
	 */
	public java.util.Set<UserConfiguration> getConfigurations() {
		return this.configurations;
	}

	public void setConfigurations(java.util.Set<UserConfiguration> configurations) {
		this.configurations = configurations;
	}

	/**
	 * Returns <code>true</code> if the argument is an User instance and all
	 * identifiers for this entity equal the identifiers of the argument entity.
	 * Returns <code>false</code> otherwise.
	 */
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (!(object instanceof User)) {
			return false;
		}
		final User that = (User) object;
		if (this.userId == null || that.getUserId() == null || !this.userId.equals(that.getUserId())) {
			return false;
		}
		return true;
	}

	/**
	 * Returns a hash code based on this entity's identifiers.
	 */
	public int hashCode() {
		int hashCode = 0;
		hashCode = 29 * hashCode + (userId == null ? 0 : userId.hashCode());

		return hashCode;
	}

	/**
	 * Constructs new instances of {@link User}.
	 */
	public static final class Factory {
		/**
		 * Constructs a new instance of {@link User}.
		 */
		public static User newInstance() {
			return new User();
		}

		/**
		 * Constructs a new instance of {@link User}, taking all possible
		 * properties (except the identifier(s))as arguments.
		 */
		public static User newInstance(java.lang.String userName, java.lang.String password, Profile profile,
				java.util.Set<UserConfiguration> configurations) {
			final User entity = new User();
			entity.setUserName(userName);
			entity.setPassword(password);
			entity.setProfile(profile);
			entity.setConfigurations(configurations);
			return entity;
		}
	}

	// HibernateEntity.vsl merge-point
}