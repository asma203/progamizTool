package programiz.automation;

import org.testng.annotations.Test;

public class editorSettingTest extends testBase{
	
	     editorSettingPage editorSettingObject;
	   
	   
	     
	     @Test
	     public void changeDark() {
	    	  editorSettingObject = new editorSettingPage(driver);
	    	 editorSettingObject.changeDarkMode();
	    	 
	     }
	     
	     public void fullScreen() {
	    	 editorSettingObject.fullScreenMode();
	    	 
	     }
	    
	    

}
