package Demoblaze.Paginas;

import Demoblaze.Steps.ButtonPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPagge {

    private ButtonPages buttonPages;

    @FindBy(how = How.ID, using = "txtUsername")
    private WebElement txtUser;

    @FindBy(how = How.ID, using = "txtPassword")
    private WebElement txtPass;


    public LoginPagge(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);

    }

    public void diligenciarformulario(String user, String pass) {
        txtUser.sendKeys(user);
        txtPass.sendKeys(pass);
        buttonPages.btnLogin();


    }
}
