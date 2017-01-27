package eu.arcangelovicedomini.javaforum.core.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 */
public class SectionFullVO extends SectionAreaVO implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = 1;

	private Collection<ThreadVO> threads = new ArrayList<ThreadVO>();

	/**
	 * 
	 */
	public Collection<ThreadVO> getThreads() {
		return this.threads;
	}

	public void setThreads(Collection<ThreadVO> threads) {
		this.threads = threads;
	}

	private Collection<SectionVO> childSections = new ArrayList<SectionVO>();

	/**
	 * 
	 */
	public Collection<SectionVO> getChildSections() {
		return this.childSections;
	}

	public void setChildSections(Collection<SectionVO> childSections) {
		this.childSections = childSections;
	}

	private SectionVO fatherSection;

	/**
	 * 
	 */
	public SectionVO getFatherSection() {
		return this.fatherSection;
	}

	public void setFatherSection(SectionVO fatherSection) {
		this.fatherSection = fatherSection;
	}
}