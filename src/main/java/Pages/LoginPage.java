package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

            public LoginPage(WebDriver driver) {
                super(driver);
            }

            @FindBy(id = "Email")
            @CacheLookup
            WebElement email_txtbox;

            @FindBy(id = "Password")
            @CacheLookup
            WebElement password_txtbox;

            @FindBy(css = "button.button-1.login-button")
            @CacheLookup
            WebElement login_btn;

            @FindBy(linkText = "Log in")
            @CacheLookup
            public WebElement loginLink;

            @FindBy(linkText = "My account")
            @CacheLookup
            public WebElement MyAccountLink;

            public void openMyAccountPage ()
            {
                clickButton(MyAccountLink);
            }

            public void userLogin( String email , String password  )
            {
                setElementText(email_txtbox,email);
                setElementText(password_txtbox,password);
                clickButton(login_btn);
            }




        }
