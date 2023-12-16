package test;

import org.testng.annotations.Test;

public class GroupsClass {
	
	  @Test (groups = {"smoke"})
	  public void testCaseOne() {
		  System.out.println("smoke");
	  }
	  
	  @Test (groups = {"smoke"})
	  public void testCaseTwo() {
		  System.out.println("smoke");
	  }
	  
	  @Test (groups = {"smoke"})
	  public void testCaseThree() {
		  System.out.println("smoke");
	  }
	  
	  @Test (groups = {"regression", "smoke"})
	  public void testCaseFour() {
		  System.out.println("regression & smoke");
	  }
	  
	  @Test (groups = {"regression"})
	  public void testCaseFive() {
		  System.out.println("regression");
	  }
	  
	  @Test (groups = {"regression"})
	  public void testCaseSix() {
		  System.out.println("regression");
	  }
	  
}
