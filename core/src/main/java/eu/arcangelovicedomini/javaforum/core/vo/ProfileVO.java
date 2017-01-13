package eu.arcangelovicedomini.javaforum.core.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import eu.arcangelovicedomini.javaforum.core.domain.EnumNamePrefix;

/**
 * 
 */
public class ProfileVO implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = 1;

	private Long profileId;

	/**
	 * 
	 */
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
	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	private Set<PostVO> posts = new HashSet<PostVO>();

	/**
	 * 
	 */
	public Set<PostVO> getPosts() {
		return this.posts;
	}

	public void setPosts(Set<PostVO> posts) {
		this.posts = posts;
	}

	private Set<PostVO> postVersionsCommitted = new HashSet<PostVO>();

	/**
	 * 
	 */
	public Set<PostVO> getPostVersionsCommitted() {
		return this.postVersionsCommitted;
	}

	public void setPostVersionsCommitted(Set<PostVO> postVersionsCommitted) {
		this.postVersionsCommitted = postVersionsCommitted;
	}

	private UserVO user;

	/**
	 * 
	 */
	public UserVO getUser() {
		return this.user;
	}

	public void setUser(UserVO user) {
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
		if (!(object instanceof ProfileVO)) {
			return false;
		}
		final ProfileVO that = (ProfileVO) object;
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
}