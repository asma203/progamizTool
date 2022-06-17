package programiz.automation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addCodePage extends pageBase {

	public addCodePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "#editor .ace_content")
	public WebElement textArea;
	
	@FindBy(css = "#editor > .ace_text-input")
	WebElement addtextArea;

	@FindBy(css =".desktop-run-button")
	WebElement runbtn;
	
	public void clearText() {
		textArea.click();
		textArea.clear();
		textArea.sendKeys(Keys.CONTROL + "a");
		textArea.sendKeys(Keys.DELETE);
		
		
	}
	
	public void addText(String newText) {
		addtextArea.sendKeys(newText);
	}
	
	public void runCode() {
		runbtn.click();
	}
	
}
