package eu.arcangelovicedomini.javaforum.core.domain;

public enum EnumNamePrefix 
implements java.io.Serializable {
	
	MR, MRS, MISS, ENGINEER, ARCHITECT, DOCTOR;
	
	/**
     * The default constructor allowing
     * super classes to access it.
     */
    private EnumNamePrefix()
    {
    }


	/**
     * Retrieves an instance of EnumAccessType from <code>its name</code>.
     *
     * @param name the name to create the EnumAccessType from.
     * @return The enumeration literal named after the 'name' argument
     */
    public static EnumNamePrefix fromString(String name)
    {
		return EnumNamePrefix.valueOf(name);
	}
	
	/**
	 * This method is necessary to comply with DaoBase implementation.
	 * @return The name of this literal.
	 */
	public Object getValue()
	{
		return this.name();
	}
}
