package eu.arcangelovicedomini.javaforum.core.vo;

import java.io.Serializable;

/**
 * 
 */
public class I18NLanguageVO implements Serializable {
	
	private static final long serialVersionUID = -1L;
	
	private Long languageId;
	
	public Long getLanguageId() {
		return languageId;
	}
	
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}
	
	private String languageCode;
	
	public String getLanguageCode() {
		return languageCode;
	}
	
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	
}