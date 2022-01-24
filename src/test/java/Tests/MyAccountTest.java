package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.UserRegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountTest extends TestBase{


        HomePage home_object;
        UserRegistrationPage userRegistrationPage_object;
        LoginPage loginPage_object;
        MyAccountPage myAccountPage_object;

        String email="a@a.com";
        String oldPassword="123456";
        String newPassword="1234567";



        @Test(priority = 1)
        public void loginToChangePass_success()
        {
            home_object=new HomePage(driver) ;
            userRegistrationPage_object=new UserRegistrationPage(driver) ;
            home_object.openloginPage();
            loginPage_object=new LoginPage(driver);
            loginPage_object.userLogin(email,oldPassword);
            Assert.assertTrue(userRegistrationPage_object.log_out.getText().contains("Log out"));
            System.out.println("this is profile page as   " +userRegistrationPage_object.log_out.getText() + "   link is exist");
        }

        @Test(priority = 2)
        public void changePassword_success()
        {
            loginPage_object=new LoginPage(driver);
            userRegistrationPage_object=new UserRegistrationPage(driver) ;
            myAccountPage_object=new MyAccountPage(driver);
            loginPage_object.openMyAccountPage();
            myAccountPage_object.openChangePasswordPage();
            myAccountPage_object.changePassword(oldPassword,newPassword);
            Assert.assertTrue(myAccountPage_object.resultLblOfChangePass.getText().contains("Password was changed"));
            System.out.println(myAccountPage_object.resultLblOfChangePass.getText() );
              myAccountPage_object.closeLabelOfChangedPass();
            userRegistrationPage_object.userLogout();

        }

            @Test(priority =3)
            public void loginWithNewPass_success()
            {
                home_object=new HomePage(driver) ;
                userRegistrationPage_object=new UserRegistrationPage(driver) ;
                home_object.openloginPage();
                loginPage_object=new LoginPage(driver);
                loginPage_object.userLogin(email,newPassword);
                Assert.assertTrue(userRegistrationPage_object.log_out.getText().contains("Log out"));
                System.out.println("this is profile page as   " +userRegistrationPage_object.log_out.getText() + "   link is exist");
            }






}
