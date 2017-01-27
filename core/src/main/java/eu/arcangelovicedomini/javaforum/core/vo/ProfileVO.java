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

}