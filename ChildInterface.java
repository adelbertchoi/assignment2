
/* @author: Adelbert Choi
 * created: May 5, 2018
 * 
 * = ChildInterface.java
 * 
 * This is a child interface class. 
 * Classes child and young child need to implement these methods
 * This is because, their object instantiation requires parents
 * Which are Adult type users. 
 * 
 * */

public interface ChildInterface {

	public void configureParents(Adult parentOne, Adult parentTwo);
	public void setParentOne(Adult parentOne);
	public void setParentTwo(Adult parentTwo);
	public Adult getParentOne();
	public Adult getParentTwo();
	
}