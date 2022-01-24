package Tests;

import Pages.ProductDetailsPage;
import Pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductSearchUseAutoSuggestTest extends TestBase{

    String productName="Apple MacBook Pro 13-inch";
    SearchPage searchPage_object;
    ProductDetailsPage productDetailsPage_object;


    @Test(priority = 1)
    public  void  userCanSearchForProductUsingAutoSuggest()
    {
        searchPage_object=new SearchPage(driver);
        productDetailsPage_object=new ProductDetailsPage(driver);
        searchPage_object.productSearchUseAutoSuggest("mac");
        Assert.assertTrue(productDetailsPage_object.productNameBread.getText().equalsIgnoreCase(productName));
        Assert.assertEquals(productDetailsPage_object.productNameBread.getText(),productName);
        System.out.println(productDetailsPage_object.productNameBread.getText());
        productDetailsPage_object.addingItemToCart();
//            Assert.assertTrue(productDetailsPage_object.resultLblOfAddingItem.getText().contains("The product has been added to your"));
//            System.out.println(productDetailsPage_object.resultLblOfAddingItem.getText() );
        //  productDetailsPage_object.closeLabelOfAddingItemSuccessfully();
    }

}
