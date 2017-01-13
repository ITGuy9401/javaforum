package eu.arcangelovicedomini.javaforum.core.vo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import eu.arcangelovicedomini.javaforum.core.domain.EnumThreadStatus;

/**
 * 
 */
public class ThreadVO implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = 1;

	private Long threadId;

	/**
	 * 
	 */
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
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public SectionVO section;
	
	/**
	 * 
	 */
	public SectionVO getSection() {
		return section;
	}
	
	public void setSection(SectionVO section) {
		this.section = section;
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

	/**
	 * Returns <code>true</code> if the argument is an Thread instance and all
	 * identifiers for this entity equal the identifiers of the argument entity.
	 * Returns <code>false</code> otherwise.
	 */
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (!(object instanceof ThreadVO)) {
			return false;
		}
		final ThreadVO that = (ThreadVO) object;
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
}