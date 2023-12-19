package test;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
  @Test(dataProvider = "dataproviderMethod")
  public void testcase(Integer n, String s) {
	  System.out.println("N: " +n);
	  System.out.println("S: " +s);
  }

  @DataProvider
  public Object[][] dataproviderMethod() {
	  
	  Object[][] data = new Object[2][2];
	  
	  data[0][0] = 10;
	  data[0][1] = "Java";
	  
	  data[1][0] = 20;
	  data[1][1] = "Selenium";
	  
	  return data;
   
  }
}
