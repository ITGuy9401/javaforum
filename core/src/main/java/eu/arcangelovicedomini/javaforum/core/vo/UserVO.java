package eu.arcangelovicedomini.javaforum.core.vo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class UserVO implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = 1;

	private Long userId;

	/**
	 * 
	 */
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
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private ProfileVO profile;

	/**
	 * 
	 */
	public ProfileVO getProfile() {
		return this.profile;
	}

	public void setProfile(ProfileVO profile) {
		this.profile = profile;
	}

	private Set<UserConfigurationVO> configurations = new HashSet<UserConfigurationVO>();

	/**
	 * 
	 */
	public Set<UserConfigurationVO> getConfigurations() {
		return this.configurations;
	}

	public void setConfigurations(Set<UserConfigurationVO> configurations) {
		this.configurations = configurations;
	}

}