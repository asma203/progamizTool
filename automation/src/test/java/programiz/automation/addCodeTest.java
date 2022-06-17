package programiz.automation;

import org.testng.annotations.Test;
import static org.junit.Assert.assertTrue;
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
	 public void verifyCode() {
		assertTrue(text.contains("Hello World"));
		
	 }
	 
	 @Test(priority=3)
	 public void clearOutput() {
		 addCodeObject.clearOutput();
	 }


}
