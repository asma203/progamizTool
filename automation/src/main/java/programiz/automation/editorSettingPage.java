package programiz.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class editorSettingPage extends pageBase{

	public editorSettingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="toggle-dark-mode-desktop")
	WebElement darkbtn;
	
	@FindBy(id="toggle-expanded-mode-desktop")
	WebElement fullscreebtn;

	public void changeDarkMode() {
		darkbtn.click();
	}
	
	public void fullScreenMode() {
		fullscreebtn.click();
	}
	
}
