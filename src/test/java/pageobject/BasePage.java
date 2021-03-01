package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
 
public class BasePage extends PageGenerator  {
 
    public BasePage(WebDriver driver) {
        super(driver);
    }
 
    

    WebDriverWait wait = new WebDriverWait(this.driver,20);
 

    public <T> void click (T elementAttr) {
        if(elementAttr.getClass().getName().contains("By")) {
            driver.findElement((By) elementAttr).click();
        } else {
            ((WebElement) elementAttr).click();
        }
    }
    
    public <T> void clear (T elementAttr) {
        if(elementAttr.getClass().getName().contains("By")) {
            driver.findElement((By) elementAttr).clear();
        } else {
            ((WebElement) elementAttr).clear();
        }
    }
 

    public <T> void escrever (T elementAttr, String text) {
        if(elementAttr.getClass().getName().contains("By")) {
            driver.findElement((By) elementAttr).sendKeys(text);
        } else {
            ((WebElement) elementAttr).sendKeys(text);
        }
    }
 

    public <T> String pegarTexto (T elementAttr) {
        if(elementAttr.getClass().getName().contains("By")) {
            return driver.findElement((By) elementAttr).getText();
        } else {
            return ((WebElement) elementAttr).getText();
        }
    }
 

    public void popup (By by) throws InterruptedException {
        List<WebElement> popup = driver.findElements(by);
        if(!popup.isEmpty()){
            popup.get(0).click();
            Thread.sleep(200);
        }
    }
    public <T> void SelectDropDown(T elementAttr,String texto) {
    	if(elementAttr.getClass().getName().contains("By")) {
    		Select dropDown = new Select(driver.findElement((By) elementAttr));
    		dropDown.selectByValue(texto);
    	}else {
    		return;
    		
    	}
    	
    }
    public <T> void Doubleclick (T elementAttr) {
        if(elementAttr.getClass().getName().contains("By")) {
        	WebElement dub =  driver.findElement((By) elementAttr);
        	Actions action = new Actions(driver);
        	action.doubleClick(dub).build().perform();
        } else {
        	WebElement dub = ((WebElement) elementAttr);
        	Actions action = new Actions(driver);
        	action.doubleClick(dub).build().perform();
        }
		
    }
    
}