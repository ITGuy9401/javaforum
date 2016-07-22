package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;
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
@Table(name = "THREAD")
public class Thread implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = -5014929886250293423L;

	private Long threadId;

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Long getThreadId() {
		return this.threadId;
	}

	public void setThreadId(Long threadId) {
		this.threadId = threadId;
	}

	private EnumThreadStatus status;

	/**
	 * 
	 */
	@Column(name = "STATUS")
	public EnumThreadStatus getStatus() {
		return this.status;
	}

	public void setStatus(EnumThreadStatus status) {
		this.status = status;
	}

	private String title;

	/**
	 * 
	 */
	@Column(name = "TITLE")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Section section;
	
	/**
	 * 
	 */
	@Column(name = "SECTION_ID")
	@ManyToOne(optional = false, targetEntity = Section.class)
	public Section getSection() {
		return section;
	}
	
	public void setSection(Section section) {
		this.section = section;
	}
	
	private Set<Post> posts = new HashSet<Post>();

	/**
	 * 
	 */
	@OneToMany(mappedBy = "thread")
	public Set<Post> getPosts() {
		return this.posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	/**
	 * Returns <code>true</code> if the argument is an Thread instance and all
	 * identifiers for this entity equal the identifiers of the argument entity.
	 * Returns <code>false</code> otherwise.
	 */
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (!(object instanceof Thread)) {
			return false;
		}
		final Thread that = (Thread) object;
		if (this.threadId == null || that.getThreadId() == null || !this.threadId.equals(that.getThreadId())) {
			return false;
		}
		return true;
	}

	/**
	 * Returns a hash code based on this entity's identifiers.
	 */
	public int hashCode() {
		int hashCode = 0;
		hashCode = 29 * hashCode + (threadId == null ? 0 : threadId.hashCode());

		return hashCode;
	}

	/**
	 * Constructs new instances of {@link Thread}.
	 */
	public static final class Factory {
		/**
		 * Constructs a new instance of {@link Thread}.
		 */
		public static Thread newInstance() {
			return new Thread();
		}

		/**
		 * Constructs a new instance of {@link Thread}, taking all required
		 * and/or read-only properties as arguments.
		 */
		public static Thread newInstance(EnumThreadStatus status, String title) {
			final Thread entity = new Thread();
			entity.setStatus(status);
			entity.setTitle(title);
			return entity;
		}

		/**
		 * Constructs a new instance of {@link Thread}, taking all possible
		 * properties (except the identifier(s))as arguments.
		 */
		public static Thread newInstance(EnumThreadStatus status, String title, Set<Post> posts) {
			final Thread entity = new Thread();
			entity.setStatus(status);
			entity.setTitle(title);
			entity.setPosts(posts);
			return entity;
		}
	}

	// HibernateEntity.vsl merge-point
}