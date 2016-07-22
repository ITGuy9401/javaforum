package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;

/**
 * 
 */
public class Profile implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = -3599278869713075896L;

	private java.lang.Long profileId;

	/**
	 * 
	 */
	public java.lang.Long getProfileId() {
		return this.profileId;
	}

	public void setProfileId(java.lang.Long profileId) {
		this.profileId = profileId;
	}

	private java.lang.String name;

	/**
	 * 
	 */
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	private java.lang.String surname;

	/**
	 * 
	 */
	public java.lang.String getSurname() {
		return this.surname;
	}

	public void setSurname(java.lang.String surname) {
		this.surname = surname;
	}

	private java.lang.String prefix;

	/**
	 * 
	 */
	public java.lang.String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(java.lang.String prefix) {
		this.prefix = prefix;
	}

	private java.lang.String suffix;

	/**
	 * 
	 */
	public java.lang.String getSuffix() {
		return this.suffix;
	}

	public void setSuffix(java.lang.String suffix) {
		this.suffix = suffix;
	}

	private java.util.Date birthDate;

	/**
	 * 
	 */
	public java.util.Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(java.util.Date birthDate) {
		this.birthDate = birthDate;
	}

	private java.util.Set<Post> posts = new java.util.HashSet<Post>();

	/**
	 * 
	 */
	public java.util.Set<Post> getPosts() {
		return this.posts;
	}

	public void setPosts(java.util.Set<Post> posts) {
		this.posts = posts;
	}

	private java.util.Set<Post> postVersionsCommitted = new java.util.HashSet<Post>();

	/**
	 * 
	 */
	public java.util.Set<Post> getPostVersionsCommitted() {
		return this.postVersionsCommitted;
	}

	public void setPostVersionsCommitted(
			java.util.Set<Post> postVersionsCommitted) {
		this.postVersionsCommitted = postVersionsCommitted;
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
	 * Returns <code>true</code> if the argument is an Profile instance and all
	 * identifiers for this entity equal the identifiers of the argument entity.
	 * Returns <code>false</code> otherwise.
	 */
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (!(object instanceof Profile)) {
			return false;
		}
		final Profile that = (Profile) object;
		if (this.profileId == null || that.getProfileId() == null || !this.profileId.equals(that.getProfileId())) {
			return false;
		}
		return true;
	}

	/**
	 * Returns a hash code based on this entity's identifiers.
	 */
	public int hashCode() {
		int hashCode = 0;
		hashCode = 29 * hashCode + (profileId == null ? 0 : profileId.hashCode());

		return hashCode;
	}

	/**
	 * Constructs new instances of
	 * {@link Profile}.
	 */
	public static final class Factory {
		/**
		 * Constructs a new instance of
		 * {@link Profile}.
		 */
		public static Profile newInstance() {
			return new Profile();
		}

		/**
		 * Constructs a new instance of
		 * {@link Profile}, taking
		 * all required and/or read-only properties as arguments.
		 */
		public static Profile newInstance(java.lang.String name,
				java.lang.String surname, java.lang.String prefix, java.lang.String suffix, java.util.Date birthDate,
				User user) {
			final Profile entity = new Profile();
			entity.setName(name);
			entity.setSurname(surname);
			entity.setPrefix(prefix);
			entity.setSuffix(suffix);
			entity.setBirthDate(birthDate);
			entity.setUser(user);
			return entity;
		}

		/**
		 * Constructs a new instance of
		 * {@link Profile}, taking
		 * all possible properties (except the identifier(s))as arguments.
		 */
		public static Profile newInstance(java.lang.String name,
				java.lang.String surname, java.lang.String prefix, java.lang.String suffix, java.util.Date birthDate,
				java.util.Set<Post> posts,
				java.util.Set<Post> postVersionsCommitted,
				User user) {
			final Profile entity = new Profile();
			entity.setName(name);
			entity.setSurname(surname);
			entity.setPrefix(prefix);
			entity.setSuffix(suffix);
			entity.setBirthDate(birthDate);
			entity.setPosts(posts);
			entity.setPostVersionsCommitted(postVersionsCommitted);
			entity.setUser(user);
			return entity;
		}
	}

	// HibernateEntity.vsl merge-point
}