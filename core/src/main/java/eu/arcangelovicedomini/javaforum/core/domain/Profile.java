package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 */
@Table(name = "PROFILE")
public class Profile implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = -3599278869713075896L;

	private Long profileId;

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Long getProfileId() {
		return this.profileId;
	}

	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	private String name;

	/**
	 * 
	 */
	@Column(name = "NAME")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String surname;

	/**
	 * 
	 */
	@Column(name = "SURNAME")
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	private EnumNamePrefix prefix;

	/**
	 * 
	 */
	@Column(name = "PREFIX")
	public EnumNamePrefix getPrefix() {
		return this.prefix;
	}

	public void setPrefix(EnumNamePrefix prefix) {
		this.prefix = prefix;
	}

	private String suffix;

	/**
	 * 
	 */
	@Column(name = "SUFFIX")
	public String getSuffix() {
		return this.suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	private Date birthDate;

	/**
	 * 
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "BIRTH_DATE")
	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@OneToMany(mappedBy = "author", targetEntity = Post.class)
	private Set<Post> posts = new HashSet<Post>();

	/**
	 * 
	 */
	public Set<Post> getPosts() {
		return this.posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	private Set<Post> postVersionsCommitted = new HashSet<Post>();

	/**
	 * 
	 */
	@OneToMany(mappedBy = "editor", targetEntity = Post.class)
	public Set<Post> getPostVersionsCommitted() {
		return this.postVersionsCommitted;
	}

	public void setPostVersionsCommitted(Set<Post> postVersionsCommitted) {
		this.postVersionsCommitted = postVersionsCommitted;
	}

	private User user;

	/**
	 * 
	 */
	@Column (name = "USER_ID", nullable = false)
	@OneToOne(mappedBy = "profile", targetEntity = User.class)
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
	 * Constructs new instances of {@link Profile}.
	 */
	public static final class Factory {
		/**
		 * Constructs a new instance of {@link Profile}.
		 */
		public static Profile newInstance() {
			return new Profile();
		}

		/**
		 * Constructs a new instance of {@link Profile}, taking all required
		 * and/or read-only properties as arguments.
		 */
		public static Profile newInstance(String name, String surname, EnumNamePrefix prefix, String suffix, Date birthDate,
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
		 * Constructs a new instance of {@link Profile}, taking all possible
		 * properties (except the identifier(s))as arguments.
		 */
		public static Profile newInstance(String name, String surname, EnumNamePrefix prefix, String suffix, Date birthDate,
				Set<Post> posts, Set<Post> postVersionsCommitted, User user) {
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