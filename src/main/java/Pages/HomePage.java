package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase{

        public HomePage(WebDriver driver) {
            super(driver);
            jse=(JavascriptExecutor)driver;
            action=new Actions(driver);
        }

        @FindBy(linkText = "Register")
        @CacheLookup
        WebElement registerLink;

        @FindBy(linkText = "Contact us")
        @CacheLookup
        WebElement contactUsLink;

        @FindBy(id = "customerCurrency")
        @CacheLookup
        WebElement currencyDropDown;

        @FindBy(partialLinkText = "Computers")
         WebElement computerMenu;

        @FindBy(partialLinkText = "Notebooks")
         WebElement noteBooksMenu;


        @FindBy(css = "div.page-title")
        public WebElement successmsg;




        public void openRegisterPage ()
        {
            clickButton(registerLink);
        }

        @FindBy(linkText = "Log in")
        @CacheLookup
        WebElement loginLink;

        public void openloginPage ()
        {
            clickButton(loginLink);
        }

        public void openContactUsPage ()
        {
                scrollToButtom();
                clickButton(contactUsLink);
        }

        public void changeCurrency ()
        {
               select=new Select(currencyDropDown);
               select.selectByVisibleText("Euro");
        }

        public void selectNotebooksMenu ()
        {
                  action
                  .moveToElement(computerMenu).perform();
                  action.moveToElement(noteBooksMenu)
                  .click()
                  .build()
                  .perform();
        }



}
