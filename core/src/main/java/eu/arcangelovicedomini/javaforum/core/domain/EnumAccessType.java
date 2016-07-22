package eu.arcangelovicedomini.javaforum.core.domain;

/**
 * 
 */
public enum EnumAccessType
    implements java.io.Serializable
{
	AUTHUSER;


    /**
     * The default constructor allowing
     * super classes to access it.
     */
    private EnumAccessType()
    {
    }


	/**
     * Retrieves an instance of EnumAccessType from <code>its name</code>.
     *
     * @param name the name to create the EnumAccessType from.
     * @return The enumeration literal named after the 'name' argument
     */
    public static EnumAccessType fromString(String name)
    {
		return EnumAccessType.valueOf(name);
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
