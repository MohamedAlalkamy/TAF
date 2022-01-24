package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactUsPage extends PageBase{
            public ContactUsPage(WebDriver driver) {
                super(driver);
            }

            @FindBy(id = "FullName")
            @CacheLookup
            WebElement fullNametxtbox;

            @FindBy(id = "Email")
            @CacheLookup
            WebElement emailTxtBox;

            @FindBy(id = "Enquiry")
            @CacheLookup
            WebElement enquiryTxtBox;

            @FindBy(css = "button.button-1.contact-us-button")
            @CacheLookup
            WebElement submit_btn;

            @FindBy(css = "div.result")
            @CacheLookup
            public WebElement successMessage;




            public void contactUs(String fullName,String email,String message)
            {
                setElementText(fullNametxtbox,fullName);
                setElementText(emailTxtBox,email);
                setElementText(enquiryTxtBox,message);
                clickButton(submit_btn);

            }



}
