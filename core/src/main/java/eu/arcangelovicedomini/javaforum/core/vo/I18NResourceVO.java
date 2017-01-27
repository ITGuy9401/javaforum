package eu.arcangelovicedomini.javaforum.core.vo;

import java.io.Serializable;

/**
 * 
 */
public class I18NResourceVO implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	private String resourceKey;
	
	public String getResourceKey() {
		return resourceKey;
	}
	
	public void setResourceKey(String resourceKey) {
		this.resourceKey = resourceKey;
	}
	
	private String resourceValue;
	
	public String getResourceValue() {
		return resourceValue;
	}
	
	public void setResourceValue(String resourceValue) {
		this.resourceValue = resourceValue;
	}
}