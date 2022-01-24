package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase{

        public MyAccountPage(WebDriver driver) {
            super(driver);
        }
            @FindBy(linkText = "Change password")
            @CacheLookup
            public WebElement ChangePasswordLink;

            public void openChangePasswordPage ()
            {
                clickButton(ChangePasswordLink);
            }

            @FindBy(id = "OldPassword")
            @CacheLookup
            WebElement oldpassword_txtbox;

            @FindBy(id = "NewPassword")
            @CacheLookup
            WebElement newpassword_txtbox;

            @FindBy(id = "ConfirmNewPassword")
            @CacheLookup
            WebElement confirmpassword_txtbox;

            @FindBy(css = "button.button-1.change-password-button")
            @CacheLookup
            WebElement changePassword_btn;

            @FindBy(css = "div.bar-notification.success")
            @CacheLookup
            public   WebElement resultLblOfChangePass;


            @FindBy(css = "span.close")
            @CacheLookup
            public   WebElement closeLabel;

            public void closeLabelOfChangedPass ()
            {
                clickButton(closeLabel);
            }


            public void changePassword(  String password , String newPassword )
            {
                setElementText(oldpassword_txtbox,password);
                setElementText(newpassword_txtbox,newPassword);
                setElementText(confirmpassword_txtbox,newPassword);
                clickButton(changePassword_btn);
            }


}
