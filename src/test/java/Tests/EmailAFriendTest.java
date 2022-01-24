package Tests;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailAFriendTest extends TestBase{

    ProductDetailsPage productDetailsPage_object;
    EmailAFriendPage emailAFriendPage_object;
    SearchPage searchPage_object;
    LoginPage loginPage_object;
    HomePage homePage_object;

    String friendEmail="mohamedsamer44444@gmail.com";
  //  String yourEmail="m@m.com";
    String message="Hello This Item Suitable For You";


    @Test
    public void emailAFriend()
    {
        homePage_object=new HomePage(driver);
        homePage_object.openloginPage();
        loginPage_object=new LoginPage(driver);
        loginPage_object.userLogin("m@m.com","123456");
        searchPage_object=new SearchPage(driver);
        searchPage_object.productSearchUseAutoSuggest("mac");
       productDetailsPage_object=new ProductDetailsPage(driver);
       productDetailsPage_object.sendFriendEmailbtn();
       emailAFriendPage_object=new EmailAFriendPage(driver);
       emailAFriendPage_object.sendEmail(friendEmail,message);
        Assert.assertTrue(emailAFriendPage_object.successMessage.getText().equalsIgnoreCase("Your message has been sent."));
        System.out.println(emailAFriendPage_object.successMessage.getText());

    }



}
