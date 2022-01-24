package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest extends TestBase{

        HomePage home_object;
        UserRegistrationPage userRegistrationPage_object;
        LoginPage loginPage_object;

        String firstName="mohamed";
        String lastName="samir";
        String email="m@m.com";
        String password="123456";


            @Test(priority = 1,alwaysRun = true)
            public void register_success()
            {
                home_object=new HomePage(driver) ;
                home_object.openRegisterPage();
                userRegistrationPage_object=new UserRegistrationPage(driver);
                userRegistrationPage_object.userRegistration(firstName,lastName,email,password);
                Assert.assertTrue(userRegistrationPage_object.success_message.getText().contains("Your registration completed"));
                System.out.println(userRegistrationPage_object.success_message.getText());
            }


            @Test(dependsOnMethods = "register_success")
            public void logout_success()
            {
                userRegistrationPage_object.userLogout();
            }


            @Test(dependsOnMethods = "logout_success")
            public void login_success()
            {
                userRegistrationPage_object=new UserRegistrationPage(driver);
                home_object=new HomePage(driver) ;
                home_object.openloginPage();
                loginPage_object=new LoginPage(driver);
                loginPage_object.userLogin(email,password);
                Assert.assertTrue(userRegistrationPage_object.log_out.getText().contains("Log out"));
                System.out.println("this is profile page as   " +userRegistrationPage_object.log_out.getText() + "   link is exist");
                userRegistrationPage_object.userLogout();
                Assert.assertTrue(loginPage_object.loginLink.getText().contains("Log in"));
                System.out.println("this is home page as   " +loginPage_object.loginLink.getText() + "   link is exist");

            }



}
