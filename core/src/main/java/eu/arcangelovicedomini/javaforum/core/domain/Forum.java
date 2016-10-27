package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 */
@Table(name = "FORUM")
public class Forum implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = -1503157004336213098L;

	private Long forumId;

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
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
	@Column(name = "TITLE")
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
	@Column(name = "DESCRIPTION")
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

	private Set<Area> areas = new HashSet<Area>();

	/**
	 * 
	 */
	@OneToMany(mappedBy = "forum", targetEntity = Area.class)
	public Set<Area> getAreas() {
		return this.areas;
	}

	public void setAreas(Set<Area> areas) {
		this.areas = areas;
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

	/**
	 * Constructs new instances of {@link Forum}.
	 */
	public static final class Factory {
		/**
		 * Constructs a new instance of {@link Forum}.
		 */
		public static Forum newInstance() {
			return new Forum();
		}

		/**
		 * Constructs a new instance of {@link Forum}, taking all required
		 * and/or read-only properties as arguments.
		 */
		public static Forum newInstance(String title) {
			final Forum entity = new Forum();
			entity.setTitle(title);
			return entity;
		}

		/**
		 * Constructs a new instance of {@link Forum}, taking all possible
		 * properties (except the identifier(s))as arguments.
		 */
		public static Forum newInstance(String title, String description, Set<Area> areas) {
			final Forum entity = new Forum();
			entity.setTitle(title);
			entity.setDescription(description);
			entity.setAreas(areas);
			return entity;
		}
	}
}