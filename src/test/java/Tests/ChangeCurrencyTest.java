package Tests;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeCurrencyTest extends TestBase {


        ProductDetailsPage productDetailsPage_object;
        SearchPage searchPage_object;
        HomePage homePage_object;

        @Test(priority = 1)
        public void changeCurrencyTest()
        {
            homePage_object=new HomePage(driver);
            homePage_object.changeCurrency();
        }

        @Test(priority = 2)
        public  void  userCanSearchForProduct()
        {
            searchPage_object=new SearchPage(driver);
            searchPage_object.productSearchUseAutoSuggest("mac");
            productDetailsPage_object=new ProductDetailsPage(driver);
            Assert.assertTrue(productDetailsPage_object.productPriceLbl.getText().contains("€"));
            System.out.println(productDetailsPage_object.productPriceLbl.getText());


        }



}
