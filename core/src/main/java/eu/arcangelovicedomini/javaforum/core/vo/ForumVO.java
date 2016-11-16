package eu.arcangelovicedomini.javaforum.core.vo;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;

import eu.arcangelovicedomini.javaforum.core.domain.Forum;

public class ForumVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

	/**
	 * Returns <code>true</code> if the argument is an Forum instance and all
	 * identifiers for this entity equal the identifiers of the argument entity.
	 * Returns <code>false</code> otherwise.
	 */
	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (!(object instanceof Forum)) {
			return false;
		}
		final Forum that = (Forum) object;
		if (this.forumId == null || that.getForumId() == null || !this.forumId.equals(that.getForumId())) {
			return false;
		}
		return true;
	}

	/**
	 * Returns a hash code based on this entity's identifiers.
	 */
	@Override
	public int hashCode() {
		int hashCode = 0;
		hashCode = 29 * hashCode + (forumId == null ? 0 : forumId.hashCode());

		return hashCode;
	}
}
