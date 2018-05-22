/**
 * 
 * NoToBeCoupledException.java
 * 
 * An Exception thrown when user is trying to make two adults partners
 * But on of the adults already has an existing partner. 
 * 
 * 
 */

public class NotToBeCoupledException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NotToBeCoupledException(String errMsg) {
		super(errMsg);
	}
}
