package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import factory.WebDriverFactory;
import org.junit.Assert;
import pageobject.Formularios;

public class TestsAccenture extends WebDriverFactory {

    Hooks hs = new Hooks();
    @Dado("que entro no site para realizar a cotação do seguro")
    public void queEntroNoSiteParaRealizarACotaçãoDoSeguro() {
        hs.setUp();
    }

    @Quando("preencho o formulario da aba “Enter Vehicle Data”")
    public void preenchoOFormularioDaAbaEnterVehicleData() {
        //Selecionar a make do veiculo.
        page.GetInstance(Formularios.class).selectMake();
        //Selecionar o model do veiculo.
        page.GetInstance(Formularios.class).selectModel();
        //Preencher o campo  Cylinder Capacity.
        page.GetInstance(Formularios.class).inputCylinder();
        //Preencher o campo Engine Performance.
        page.GetInstance(Formularios.class).inputEnginePerformance();
        //Preencher a  Data Of Manufacture .
        page.GetInstance(Formularios.class).inputDateOfManufacture();
        //Selecionar Number of Seats.
        page.GetInstance(Formularios.class).selectNumberOfSeatsMotocycle();
        page.GetInstance(Formularios.class).selectNumberOfSeats();
        //Selecionar Fuel type.
        page.GetInstance(Formularios.class).selectFuelType();
        //Preencher pay load
        page.GetInstance(Formularios.class).inputPayLoad();
        //Preencher com yes
        page.GetInstance(Formularios.class).clickRadioRand();
        ///Preencher TotalWeight
        page.GetInstance(Formularios.class).inputTotalWeight();
        //Preencher ListPrice
        page.GetInstance(Formularios.class).inputListPrice();
        //Preencher licensePlatenumber
        page.GetInstance(Formularios.class).inputlicensePlatenumber();
        //Preencher annualMileage
        page.GetInstance(Formularios.class).inputannualMileage();
        //Clicar no botão next
        page.GetInstance(Formularios.class).NextFormulario();
    }

    @Quando("preencho o formulario da aba Enter Insurant Data")
    public void preenchoOFormularioDaAbaEnterInsurantData() {
        //Preencher o campo  First Name.
        page.GetInstance(Formularios.class).firstName();
        //Preencher o campo  lasstName.
        page.GetInstance(Formularios.class).lasstName();
        //Preencher o campo  data.
        page.GetInstance(Formularios.class).dateOfBirth();
        //Escolher genero.
        page.GetInstance(Formularios.class).clickRadioGenero();
        //Preencher o campo  de endereço.
        page.GetInstance(Formularios.class).streetAdress();
        //Preencher o campo  bairro.
        page.GetInstance(Formularios.class).selectCountry();
        //Preencher o campo  cep.
        page.GetInstance(Formularios.class).zipCode();
        //Preencher o campo  city.
        page.GetInstance(Formularios.class).city();
        //Preencher o campo  ocupattion.
        page.GetInstance(Formularios.class).selectOccupation();
        //Preencher o campo  hobbies.
        page.GetInstance(Formularios.class).clickRadioHobbies();
        //clicar  no botão  btnNextEnterProductData.
        page.GetInstance(Formularios.class).btnNextEnterProductData();
    }

    @Quando("preencho o formulario da aba Enter Product Data")
    public void preenchoOFormularioDaAbaEnterProductData() {
        //Preencher o campo   data.
        page.GetInstance(Formularios.class).inputStartData();
        //Selecionar o  insuranmcesum.
        page.GetInstance(Formularios.class).selectInsurancesum();
        //Selecionar o  Meritrating.
        page.GetInstance(Formularios.class).selectMeritrating();
        //Selecionar o  Damageinsurance.
        page.GetInstance(Formularios.class).selectDamageinsurance();
        //escolher um produto opcional.
        page.GetInstance(Formularios.class).clickRadioOptionalProduct();
        //Selecionar o  Courtesycar.
        page.GetInstance(Formularios.class).selectCourtesycar();
        //Clicar  no botão  btnNextselectpriceoption.
        page.GetInstance(Formularios.class).btnNextselectpriceoption();
    }

    @Quando("preencho o formulario da aba Select Price Option")
    public void preenchoOFormularioDaAbaSelectPriceOption() {
        //Selecionar o  selectRadioUltimate.
        page.GetInstance(Formularios.class).selectRadioUltimate();
        //Clicar  no botão  btnNextSendQuote.
        page.GetInstance(Formularios.class).btnNextSendQuote();
    }

    @Quando("preencho o formulario da aba Send Quote")
    public void preenchoOFormularioDaAbaSendQuote() {
        //Preencher o campo   email.
        page.GetInstance(Formularios.class).inputemail();
        //Preencher o campo   phone.
        page.GetInstance(Formularios.class).inputphone();
        //Preencher o campo   username.
        page.GetInstance(Formularios.class).inputusername();
        //Preencher o campo   password.
        page.GetInstance(Formularios.class).inputpassword();
        //Preencher o campo   confirmpassword.
        page.GetInstance(Formularios.class).inputconfirmpassword();
        //Preencher o campo   Comments.
        page.GetInstance(Formularios.class).inputComments();
        //Clicar  no botão  btnCickSendEmail.
        page.GetInstance(Formularios.class).btnCickSendEmail();
    }

    @Entao("verifico a mensagem “Sending e-mail success!” na tela")
    public void verificoAMensagemSendingEMailSuccessNaTela() {
        //Validar a mensagem de envio de email com sucesso !.
        String TextoAlert = page.GetInstance(Formularios.class).validaMensagem();
        Assert.assertEquals("Sending e-mail success!",TextoAlert);
        // Fechar o drive.
        hs.tearDown();
    }
}
