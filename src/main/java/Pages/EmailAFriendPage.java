package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class EmailAFriendPage extends PageBase{
            public EmailAFriendPage(WebDriver driver) {
                super(driver);
            }


            @FindBy(id = "FriendEmail")
            @CacheLookup
            WebElement friendEmailtbox;

//            @FindBy(id = "YourEmailAddress")
//            @CacheLookup
//            WebElement youremailTxtBox;

            @FindBy(id = "PersonalMessage")
            @CacheLookup
            WebElement messageTxtBox;

            @FindBy(css = "button.button-1.send-email-a-friend-button")
            @CacheLookup
            WebElement sendEmail_btn;

            @FindBy(css = "div.result")
            @CacheLookup
            public WebElement successMessage;




            public void sendEmail(String friendEmail,String message)
            {
                setElementText(friendEmailtbox,friendEmail);
              //  setElementText(youremailTxtBox,yourEmail);
                setElementText(messageTxtBox,message);
                clickButton(sendEmail_btn);

            }




}
