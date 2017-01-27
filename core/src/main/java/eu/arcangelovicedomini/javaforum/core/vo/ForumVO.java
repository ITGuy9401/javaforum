package eu.arcangelovicedomini.javaforum.core.vo;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;

public class ForumVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	private Long forumId;

	/**
	 * 
	 */
	public Long getForumId() {
		return this.forumId;
	}

	public void setForumId(Long forumId) {
		this.forumId = forumId;
	}

	private String title;

	/**
	 * <p>
	 * Title of the forum
	 * </p>
	 */
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private String description;

	/**
	 * <p>
	 * Short description of the forum
	 * </p>
	 */
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String url;

	/**
	 * <p>
	 * Relative or Absolute URL of the forum.
	 * </p>
	 */
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) throws MalformedURLException {
		this.url = new URL(url).toString(); // Needed for validation of the URI
	}
}
