package Tests;

import Pages.ContactUsPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends TestBase{
            HomePage homePage_object;
            ContactUsPage contactUsPage_obiect;
            String fullName="mohamed Alalkamy";
            String email="m@m.com";
            String message="Hello Iam mohamed Alalkamy";

            @Test
            public void userCanContactUs()
            {
                contactUsPage_obiect =new ContactUsPage(driver);
                homePage_object=new HomePage(driver);
                homePage_object.openContactUsPage();
                contactUsPage_obiect.contactUs(fullName,email,message);
                Assert.assertTrue(contactUsPage_obiect.successMessage.getText().contains("Your enquiry has been successfully sent to the store owner."));
                System.out.println(contactUsPage_obiect.successMessage.getText());
            }


}
