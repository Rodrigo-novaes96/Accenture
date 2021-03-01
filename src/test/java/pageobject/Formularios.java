package pageobject;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Formularios extends BasePage {

    public Formularios(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "cylindercapacity")
    @CacheLookup
    private WebElement inputCylinder;

    @FindBy(id = "engineperformance")
    @CacheLookup
    private WebElement enginePerformance;

    @FindBy(id = "dateofmanufacture")
    @CacheLookup
    private WebElement dateofManufacture;

    @FindBy(id = "payload")
    @CacheLookup
    private WebElement payLoad;
    @FindBy(id = "totalweight")
    @CacheLookup
    private WebElement totalWeight;
    @FindBy(id = "listprice")
    @CacheLookup
    private WebElement listPrice;
    @FindBy(id = "licenseplatenumber")
    @CacheLookup
    private WebElement licensePlatenumber;

    @FindBy(id = "annualmileage")
    @CacheLookup
    private WebElement annualMileage;

    @FindBy(id = "nextenterinsurantdata")
    @CacheLookup
    private WebElement btnNextInsuranteData;
    @FindBy(id = "firstname")
    @CacheLookup
    private WebElement firstName;
    @FindBy(id = "lastname")
    @CacheLookup
    private WebElement lastName;
    @FindBy(id = "birthdate")
    @CacheLookup
    private WebElement birthDate;

    @FindBy(id = "gendermale")
    @CacheLookup
    private WebElement genderMale;
    @FindBy(id = "righthanddriveyes")
    @CacheLookup
    private WebElement righthandDriveyes;

    @FindBy(id = "streetaddress")
    @CacheLookup
    private WebElement streetAddress;

    @FindBy(id = "zipcode")
    @CacheLookup
    private WebElement zipCode;
    @FindBy(id = "city")
    @CacheLookup
    private WebElement city;

    @FindBy(id = "bungeejumping")
    @CacheLookup
    private WebElement bungeeJumping;
    @FindBy(id = "website")
    @CacheLookup
    private WebElement webSite;

    @FindBy(id = "nextenterproductdata")
    @CacheLookup
    private WebElement nextenterProductdata;

    @FindBy(id = "startdate")
    @CacheLookup
    private WebElement startDate;
    @FindBy(id = "EuroProtection")
    @CacheLookup
    private WebElement EuroProtection;
    @FindBy(id = "nextselectpriceoption")
    @CacheLookup
    private WebElement nextselectPriceoption;

    @FindBy(id = "selectultimate")
    @CacheLookup
    private WebElement selectUltimate;
    @FindBy(id = "nextsendquote")
    @CacheLookup
    private WebElement nextSendQuote;

    @FindBy(id = "email")
    @CacheLookup
    private WebElement email;
    @FindBy(id = "phone")
    @CacheLookup
    private WebElement phone;
    @FindBy(id = "username")
    @CacheLookup
    private WebElement username;
    @FindBy(id = "password")
    @CacheLookup
    private WebElement password;
    @FindBy(id = "confirmpassword")
    @CacheLookup
    private WebElement confirmpassword;
    @FindBy(id = "Comments")
    @CacheLookup
    private WebElement Comments;
    @FindBy(id = "sendemail")
    @CacheLookup
    private WebElement sendemail;

    public Formularios selectMake() {
        WebElement SelectMake = driver.findElement(By.id("make"));
        if (SelectMake.isDisplayed()) {
            Select Cars = new Select(SelectMake);
            Cars.selectByVisibleText("Audi");
        }
        return this;
    }

    public Formularios selectModel() {
        WebElement SelectModel = driver.findElement(By.id("model"));
        if (SelectModel.isDisplayed()) {
            Select Cars = new Select(SelectModel);
            Cars.selectByVisibleText("Motorcycle");
        }
        return this;
    }

    public Formularios inputCylinder() {
        if (inputCylinder.isDisplayed())
            escrever(inputCylinder, "1");
        return this;
    }

    public Formularios inputEnginePerformance() {
        if (enginePerformance.isDisplayed())
            escrever(enginePerformance, "700");
        return this;
    }

    public Formularios inputDateOfManufacture() {
        if (dateofManufacture.isDisplayed())
            escrever(dateofManufacture, "01/20/2021");
        return this;
    }

    public Formularios selectNumberOfSeatsMotocycle() {
        WebElement SelectNumberOfSeats = driver.findElement(By.id("numberofseatsmotorcycle"));
        if (SelectNumberOfSeats.isDisplayed()) {
            Select Cars = new Select(SelectNumberOfSeats);
            Cars.selectByVisibleText("3");
        }
        return this;
    }

    public Formularios selectNumberOfSeats() {
        WebElement SelectNumberOfSeats = driver.findElement(By.id("numberofseats"));
        if (SelectNumberOfSeats.isDisplayed()) {
            Select Cars = new Select(SelectNumberOfSeats);
            Cars.selectByVisibleText("3");
        }
        return this;
    }

    public Formularios selectFuelType() {
        WebElement SelectFuelType = driver.findElement(By.id("fuel"));
        if (SelectFuelType.isDisplayed()) {
            Select Cars = new Select(SelectFuelType);
            Cars.selectByVisibleText("Diesel");
        }
        return this;
    }


    public Formularios inputPayLoad() {
        if (payLoad.isDisplayed())
            escrever(payLoad, "100");
        return this;
    }

    public Formularios inputTotalWeight() {
        if (totalWeight.isDisplayed())
            escrever(totalWeight, "1000");
        return this;
    }

    public Formularios inputListPrice() {
        if (listPrice.isDisplayed())
            escrever(listPrice, "10000");
        return this;
    }

    public Formularios inputlicensePlatenumber() {
        if (licensePlatenumber.isDisplayed())
            escrever(licensePlatenumber, "1985");
        return this;
    }

    public Formularios inputannualMileage() {
        if (annualMileage.isDisplayed())
            escrever(annualMileage, "10000");
        return this;
    }

    public Formularios NextFormulario() {
        if (btnNextInsuranteData.isDisplayed())
            click(btnNextInsuranteData);
        return this;
    }


    // FORMULARIO   ENTER INSURANT DATA (CAMPOS PARA PREENCHER)

    public Formularios firstName() {
        if (firstName.isDisplayed())
            escrever(firstName, "Rodrigo");
        return this;
    }

    public Formularios lasstName() {
        if (lastName.isDisplayed())
            escrever(lastName, "Costa");
        return this;
    }

    public Formularios dateOfBirth() {
        if (birthDate.isDisplayed())
            escrever(birthDate, "02/23/1996");
        return this;
    }

    public Formularios clickRadioGenero() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(genderMale));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        return this;
    }

    public Formularios clickRadioRand() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(righthandDriveyes));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        return this;
    }

    public Formularios streetAdress() {
        if (streetAddress.isDisplayed())
            escrever(streetAddress, "Rua peregrim");
        return this;
    }

    public Formularios zipCode() {
        if (zipCode.isDisplayed())
            escrever(zipCode, "06730000");
        return this;
    }

    public Formularios city() {
        if (city.isDisplayed())
            escrever(city, "Vargem Grande Paulista");
        return this;
    }

    public Formularios selectCountry() {
        WebElement SelectNumberOfSeats = driver.findElement(By.id("country"));
        if (SelectNumberOfSeats.isDisplayed()) {
            Select Cars = new Select(SelectNumberOfSeats);
            Cars.selectByVisibleText("Brazil");
        }
        return this;
    }

    public Formularios selectOccupation() {
        WebElement SelectNumberOfSeats = driver.findElement(By.id("occupation"));
        if (SelectNumberOfSeats.isDisplayed()) {
            Select Cars = new Select(SelectNumberOfSeats);
            Cars.selectByVisibleText("Employee");
        }
        return this;
    }

    public Formularios clickRadioHobbies() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(bungeeJumping));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        return this;
    }


    public Formularios btnNextEnterProductData() {
        click(nextenterProductdata);
        return this;
    }


    // FORMULARIO ENTER PRODUCT DATA - CAMPOS PARA PREENCHER


    public Formularios inputStartData() {
        if (startDate.isDisplayed())
            escrever(startDate, "02/23/2023");
        return this;
    }

    public Formularios selectInsurancesum() {
        WebElement selectInsurancesum = driver.findElement(By.id("insurancesum"));
        if (selectInsurancesum.isDisplayed()) {
            Select Cars = new Select(selectInsurancesum);
            Cars.selectByVisibleText(" 3.000.000,00");
        }
        return this;
    }

    public Formularios selectMeritrating() {
        WebElement selectMeritrating = driver.findElement(By.id("meritrating"));
        if (selectMeritrating.isDisplayed()) {
            Select Cars = new Select(selectMeritrating);
            Cars.selectByVisibleText("Bonus 1");
        }
        return this;
    }

    public Formularios selectDamageinsurance() {
        WebElement selectDamageinsurance = driver.findElement(By.id("damageinsurance"));
        if (selectDamageinsurance.isDisplayed()) {
            Select Cars = new Select(selectDamageinsurance);
            Cars.selectByVisibleText("Full Coverage");
        }
        return this;
    }

    public Formularios clickRadioOptionalProduct() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(EuroProtection));
        if (element.isDisplayed())
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        return this;
    }

    public Formularios selectCourtesycar() {
        WebElement SelectNumberOfSeats = driver.findElement(By.id("courtesycar"));
        if (SelectNumberOfSeats.isDisplayed()) {
            Select Cars = new Select(SelectNumberOfSeats);
            Cars.selectByVisibleText(" No");
        }
        return this;
    }

    public Formularios btnNextselectpriceoption() {
        if (nextselectPriceoption.isDisplayed())
            click(nextselectPriceoption);
        return this;
    }

    // SELECT PRICE OPTION

    public Formularios selectRadioUltimate() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selectUltimate));
        if (element.isDisplayed())
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        return this;
    }

    public Formularios btnNextSendQuote() {
        if (nextSendQuote.isDisplayed())
            click(nextSendQuote);
        return this;
    }


    // FORMULARIO SEND QUOTE


    public Formularios inputemail() {
        if (email.isDisplayed())
            escrever(email, "rodrigoxx96@gmail.com");
        return this;
    }

    public Formularios inputphone() {
        if (phone.isDisplayed())
            escrever(phone, "943856190");
        return this;
    }

    public Formularios inputusername() {
        if (username.isDisplayed())
            escrever(username, "rodrigocosta");
        return this;
    }

    public Formularios inputpassword() {
        if (password.isDisplayed())
            escrever(password, "Digao@123456789");
        return this;
    }

    public Formularios inputconfirmpassword() {
        if (confirmpassword.isDisplayed())
            escrever(confirmpassword, "Digao@123456789");
        return this;
    }

    public Formularios inputComments() {
        if (Comments.isDisplayed())
            escrever(Comments, "gostaria que enviasse a cotação o mais rapido possivel por favor !");
        return this;
    }

    public Formularios btnCickSendEmail() {
        if (sendemail.isDisplayed())
            click(sendemail);
        return this;
    }

    public String validaMensagem() {
        WebElement message = driver.findElement(By.xpath("//div[contains(@class,'sweet-alert showSweetAlert visible')]"));
        driver.switchTo();
        if (message.isDisplayed()){
        // Obtém o texto do Alert.
        WebElement textoDoAlert = driver.findElement(By.xpath("//h2[contains(.,'Sending e-mail success!')]"));
            return textoDoAlert.getText();
        }
        return null;
}}
