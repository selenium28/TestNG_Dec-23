package test;

import org.testng.annotations.Test;

public class EnableAndDisable {
	
  @Test (enabled = true, priority = 1)
  public void testCaseOne() {
	  System.out.println("testCaseOne");
  }
  
  @Test (enabled = true, priority = 2)
  public void testCaseTwo() {
	  System.out.println("testCaseTwo");
  }
  
  @Test (priority = 3, enabled = false)
  public void testCaseThree() {
	  System.out.println("testCaseThree");
  }
  
  @Test (enabled = true, priority = 4)
  public void testCaseFour() {
	  System.out.println("testCaseFour");
  }
  
  @Test (enabled = false)
  public void testCaseFive() {
	  System.out.println("testCaseFive");
  }
  
}
