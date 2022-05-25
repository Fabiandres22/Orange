package Demoblaze.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {

	private WebDriver driver;

	@FindBy(how = How.ID, using = "btnLogin")
	private WebElement btnLogin;

	//btn PIM
	@FindBy(how = How.ID, using = "menu_pim_viewPimModule")
	private WebElement btnPIM;

	//btn ADD
	@FindBy(how = How.ID, using = "btnAdd")
	private WebElement btnAdd;

	//btn SAVE
	@FindBy(how = How.ID, using = "btnSave")
	private WebElement btnSave;

	public ButtonPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void btnLogin() {
		btnLogin.isDisplayed();
		btnLogin.click();
	}

	public void  btnPIM() {
		btnPIM.click();
	}

	public void  btnAdd() {
		btnAdd.click();
	}

	public void  btnSave() {
		btnSave.click();
	}


}
