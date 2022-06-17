package programiz.automation;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class addCodeTest extends testBase{
	
	 addCodePage addCodeObject;
	public String text = "class HelloWorld {\r\n"
	 		+ "    public static void main(String[] args) {\r\n"
	 		+ "        System.out.println(\"Hello, World!\"); \r\n"
	 		+ "    }\r\n"
	 		+ "}";
	 
	 @Test(priority=1)
	 public void clearDefaultArea() throws InterruptedException {
			Thread.sleep(2000);
			 addCodeObject = new addCodePage(driver);
			 Thread.sleep(2000);
			 addCodeObject.addText(text);
			 addCodeObject.clearText();
			 Thread.sleep(2000);
			 addCodeObject.runCode();
		 }
	 
	 @Test(priority=2)
	 public void verifyCode(String code) {
		 code = "NEw data";
		assertTrue(text.contains("Hello Worls"));
		
	 }


}
