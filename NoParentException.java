
/* @author: Adelbert Choi
 * created: May 5, 2018
 * 
 * = NoParentException.java
 * 
 * An exception thrown when a child does not have valid parents. 
 * An exception thrown when deleting a parent user profile but he/she has dependents
 * An exception thrown when deleting friend from a network but he/she is partner to dependents 
 * 
 * */

public class NoParentException extends Exception {

	private static final long serialVersionUID = 1L;

	public NoParentException(String errMsg) {
		super(errMsg);
	}
}