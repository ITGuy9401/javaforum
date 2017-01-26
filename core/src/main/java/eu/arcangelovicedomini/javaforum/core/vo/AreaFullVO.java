package eu.arcangelovicedomini.javaforum.core.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class AreaFullVO extends AreaVO implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = 1;

	private Collection<SectionVO> sections = new ArrayList<SectionVO>();

	public Collection<SectionVO> getSections() {
		return this.sections;
	}

	public void setSections(Collection<SectionVO> sections) {
		this.sections = sections;
	}
}
