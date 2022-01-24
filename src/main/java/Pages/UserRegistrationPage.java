package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase
{
            public UserRegistrationPage(WebDriver driver) {
                super(driver);
            }


            @FindBy(id = "gender-male")
            @CacheLookup
            WebElement gender_Rdobtn;

            @FindBy(id = "FirstName")
            @CacheLookup
            WebElement fn_txtbox;

            @FindBy(id = "LastName")
            @CacheLookup
            WebElement ln_txtbox;

            @FindBy(id = "Email")
            @CacheLookup
            WebElement email_txtbox;

            @FindBy(id = "Password")
            @CacheLookup
            WebElement password_txtbox;

            @FindBy(id = "ConfirmPassword")
            @CacheLookup
            WebElement confirmPassword_txtbox;

            @FindBy(id = "register-button")
            @CacheLookup
            WebElement register_btn;

            @FindBy(css = "div.result")
            @CacheLookup
            public   WebElement success_message;

            @FindBy(linkText = "Log out")
            @CacheLookup
            public   WebElement log_out;


            public void userRegistration(String firstname , String lastname , String email , String password  )
            {
                clickButton(gender_Rdobtn);
                setElementText(fn_txtbox,firstname);
                setElementText(ln_txtbox,lastname);
                setElementText(email_txtbox,email);
                setElementText(password_txtbox,password);
                setElementText(confirmPassword_txtbox,password);
                clickButton(register_btn);
            }


           public void userLogout()
           {
               clickButton(log_out);
           }



}
