package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.UserRegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserLoginTest extends TestBase{

        HomePage home_object;
        UserRegistrationPage userRegistrationPage_object;
        LoginPage loginPage_object;


        String email="m@m.com";
        String password="1234567";

        @Test(priority = 1)
        public void login_success()
        {
            home_object=new HomePage(driver) ;
            userRegistrationPage_object=new UserRegistrationPage(driver) ;
            home_object.openloginPage();
            loginPage_object=new LoginPage(driver);
            loginPage_object.userLogin(email,password);
            Assert.assertTrue(userRegistrationPage_object.log_out.getText().contains("Log out"));
            System.out.println("this is profile page as   " +userRegistrationPage_object.log_out.getText() + "   link is exist");
        }




}
