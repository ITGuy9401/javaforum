package eu.arcangelovicedomini.javaforum.core.vo;

import java.io.Serializable;

/**
 * 
 */
public class SectionAreaVO extends SectionVO implements Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = 1;

	private AreaVO area;

	/**
	 * 
	 */
	public AreaVO getArea() {
		return this.area;
	}

	public void setArea(AreaVO area) {
		this.area = area;
	}
}