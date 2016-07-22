package eu.arcangelovicedomini.javaforum.core.domain;

/**
 * 
 */
public enum EnumThreadStatus
    implements java.io.Serializable
{
	OPEN, CLOSED, SUSPENDED;


    /**
     * The default constructor allowing
     * super classes to access it.
     */
    private EnumThreadStatus()
    {
    }


	/**
     * Retrieves an instance of EnumThreadStatus from <code>its name</code>.
     *
     * @param name the name to create the EnumThreadStatus from.
     * @return The enumeration literal named after the 'name' argument
     */
    public static EnumThreadStatus fromString(String name)
    {
		return EnumThreadStatus.valueOf(name);
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
