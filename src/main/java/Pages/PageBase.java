package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PageBase {

         public JavascriptExecutor jse;
         public Select select;
         public Actions action;

            public   PageBase(WebDriver driver)
            {
                PageFactory.initElements(driver,this);

            }


            protected static void clickButton(WebElement button)
            {
                button.click();
            }


            protected static void setElementText(WebElement txtElelment,String value)
            {
                txtElelment.sendKeys(value);
            }

            public void scrollToButtom()
            {
              jse.executeScript("scrollBy(0,2500)");
            }








}
