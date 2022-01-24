package Tests;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReviewTest extends TestBase{

    ProductDetailsPage productDetailsPage_object;
    SearchPage searchPage_object;
    LoginPage loginPage_object;
    HomePage homePage_object;
    ReviewPage reviewPage_object;

        @Test(priority = 1)
        public void review()
        {
            homePage_object=new HomePage(driver);
            homePage_object.openloginPage();
            loginPage_object=new LoginPage(driver);
            loginPage_object.userLogin("m@m.com","123456");
            searchPage_object =new SearchPage(driver);
            searchPage_object.productSearchUseAutoSuggest("mac");
            productDetailsPage_object=new ProductDetailsPage(driver);
            productDetailsPage_object.addingReview();
            reviewPage_object=new ReviewPage(driver);
            reviewPage_object.addingReview("Hello","This product is good");
            Assert.assertTrue(reviewPage_object.successMessage.getText().equalsIgnoreCase("Product review is successfully added."));
            System.out.println(reviewPage_object.successMessage.getText());
        }

        @Test(priority = 2)
        public void helpfullReview()
        {
            reviewPage_object=new ReviewPage(driver);
            reviewPage_object.helpfullReview();
        }



}
