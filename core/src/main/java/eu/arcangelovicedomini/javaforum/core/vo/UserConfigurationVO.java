package eu.arcangelovicedomini.javaforum.core.vo;

import java.io.Serializable;

import eu.arcangelovicedomini.javaforum.core.domain.EnumAccessType;
import eu.arcangelovicedomini.javaforum.core.domain.EnumVisibilityType;

/**
 * 
 */
public class UserConfigurationVO implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = 1;

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