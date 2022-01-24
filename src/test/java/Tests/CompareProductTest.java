package Tests;

import Pages.CompareProductPage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;
import Pages.WishListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareProductTest extends TestBase{

    ProductDetailsPage productDetailsPage_object;
    SearchPage searchPage_object;
    CompareProductPage compareProductPage_object;

    @Test(priority = 1)
    public void userCanAddProducttoCompareList() throws InterruptedException {
        searchPage_object=new SearchPage(driver);
        searchPage_object.productSearchUseAutoSuggest("mac");
        // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        productDetailsPage_object=new ProductDetailsPage(driver);
        productDetailsPage_object.addingToCompareList();
        Thread.sleep(3000);
        searchPage_object=new SearchPage(driver);
        searchPage_object.productSearchUseAutoSuggest("len");
        productDetailsPage_object=new ProductDetailsPage(driver);
        productDetailsPage_object.addingToCompareList();
        Thread.sleep(4000);




    }

  @Test(priority = 2)
    public void openComparePage() throws InterruptedException
    {
        productDetailsPage_object=new ProductDetailsPage(driver);
        productDetailsPage_object.openingComparePage();
        Thread.sleep(2000);
        compareProductPage_object=new CompareProductPage(driver);
        Assert.assertTrue(compareProductPage_object.successmsg.getText().contains("Compare products"));
        System.out.println("This Is : - "+compareProductPage_object.successmsg.getText());

        compareProductPage_object=new CompareProductPage(driver);
        compareProductPage_object.deleteItemFromCompareList();
        Thread.sleep(2000);
        compareProductPage_object.deleteCompareProductList();
        Assert.assertTrue(compareProductPage_object.successDeletedmsg.getText().contains("You have no items to compare."));
        System.out.println(compareProductPage_object.successDeletedmsg.getText());
    }



}
