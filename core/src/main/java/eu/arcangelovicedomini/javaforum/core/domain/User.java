package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 */
@Table(name = "USER")
public class User implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = -7401272637454675684L;

	private Long userId;

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	private String userName;

	/**
	 * 
	 */
	@Column(name = "USER_NAME", nullable = false, unique = true)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	private String password;

	/**
	 * 
	 */
	@Column(name = "PASSWORD", nullable = false)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private Profile profile;

	/**
	 * 
	 */
	@Column(name = "PROFILE_ID")
	@OneToOne(mappedBy = "profile", targetEntity = Profile.class)
	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	private Set<UserConfiguration> configurations = new HashSet<UserConfiguration>();

	/**
	 * 
	 */
	@OneToMany(mappedBy = "user", targetEntity = UserConfiguration.class)
	public Set<UserConfiguration> getConfigurations() {
		return this.configurations;
	}

	public void setConfigurations(Set<UserConfiguration> configurations) {
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
		public static User newInstance(String userName, String password, Profile profile,
				Set<UserConfiguration> configurations) {
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