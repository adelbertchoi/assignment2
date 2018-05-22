
/**
 * 
 * NoSuchAgeException.java
 * 
 * An exception thrown when age field entered is 0 or 150 
 * These are unlikely age values
 *  
 */


public class NoSuchAgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NoSuchAgeException(String errMsg) {
		super(errMsg);
	}
}
