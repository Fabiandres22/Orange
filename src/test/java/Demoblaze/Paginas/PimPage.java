package Demoblaze.Paginas;

import Demoblaze.Steps.ButtonPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

    private ButtonPages buttonPages;


    @FindBy(how = How.ID, using = "firstName")
    private WebElement inputFirstName;

    @FindBy(how = How.ID, using = "lastName")
    private WebElement inputLastName;

    @FindBy(how = How.ID, using = "employeeId")
    private WebElement inputEmployesId;

    public PimPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
    }

    public void llegarAddEmployee() {
        buttonPages.btnPIM();
        buttonPages.btnAdd();

    }

    public void diligenciarEmpleyee(String PrimerNombre, String Apellido) {
        inputFirstName.sendKeys(PrimerNombre);
        inputLastName.sendKeys(Apellido);
        buttonPages.btnSave();


    }
}
