package edu.asu;
/**
 * 
 * @author Kellie
 *
 * To demonstrate ability to push and pull from github.
 * 
 */
public class HelloDeimos {

	private String firstName, lastName;
	
	public HelloDeimos(String first, String last)
	{
		firstName = "Kellie ";
		lastName = "Watson";
		
	}
	
	public String toString()
	{
		String result;
		
		result = firstName + lastName;
		
		return result;
		
	}
}
