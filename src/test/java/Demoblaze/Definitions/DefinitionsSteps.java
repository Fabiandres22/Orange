package Demoblaze.Definitions;

import Demoblaze.Paginas.LoginPagge;
import Demoblaze.Paginas.PimPage;
import org.openqa.selenium.WebDriver;
import Demoblaze.Steps.Connection;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DefinitionsSteps {

    private WebDriver driver;
    private Connection conexion = new Connection();
    private LoginPagge loginPagge;
    private PimPage pimPage;


    @Given("^open browser$")
    public void open_browser() {

        this.conexion = new Connection();
        this.driver = this.conexion.abrirNavegador();

    }

    @And("^diligenciar user (.*) y contrasena (.*)$")
    public void diligenciarformulario(String user, String pass){
        this.loginPagge = new LoginPagge(driver);
        this.loginPagge.diligenciarformulario(user,pass);

    }

    @And("^al hacer click en el boton pim y add a visualizar formularios$")
    public void llegarAddEmployee() {
        this.pimPage = new PimPage(driver);
        this.pimPage.llegarAddEmployee();

    }

    @When("^nombre (.*) y apellido (.*)$")
    public void diligenciarEmpleyee(String PrimerNombre, String Apellido) {
        this.pimPage = new PimPage(driver);
        this.pimPage.diligenciarEmpleyee(PrimerNombre, Apellido);
    }
}