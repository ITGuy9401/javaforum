package eu.arcangelovicedomini.javaforum.core.domain;

/**
 * 
 */
public enum EnumVisibilityType
    implements java.io.Serializable
{
    PRIVATE, FRIENDS, REGISTERED_USERS, PUBLIC;


    /**
     * The default constructor allowing
     * super classes to access it.
     */
    private EnumVisibilityType()
    {
    }


	/**
     * Retrieves an instance of EnumVisibilityType from <code>its name</code>.
     *
     * @param name the name to create the EnumVisibilityType from.
     * @return The enumeration literal named after the 'name' argument
     */
    public static EnumVisibilityType fromString(String name)
    {
		return EnumVisibilityType.valueOf(name);
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
