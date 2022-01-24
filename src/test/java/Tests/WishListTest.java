package Tests;

import Pages.ProductDetailsPage;
import Pages.SearchPage;
import Pages.WishListPage;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class WishListTest extends TestBase{

    ProductDetailsPage productDetailsPage_object;
    SearchPage searchPage_object;
    WishListPage wishListPage_object;

    @Test
    public void userCanAddtoWishList() throws InterruptedException {
        searchPage_object=new SearchPage(driver);
        searchPage_object.productSearchUseAutoSuggest("mac");
        Thread.sleep(2000);
       // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        productDetailsPage_object=new ProductDetailsPage(driver);
        productDetailsPage_object.addingToWishList();
        wishListPage_object=new WishListPage(driver);
        wishListPage_object.openWishListPage();
        Thread.sleep(3000);
        Assert.assertTrue(wishListPage_object.successmsg.getText().contains("Wishlist"));
        System.out.println(wishListPage_object.successmsg.getText());
        wishListPage_object.deleteItemFromWishList();
        Assert.assertTrue(wishListPage_object.successDeletedmsg.getText().contains("The wishlist is empty!"));
        System.out.println(wishListPage_object.successDeletedmsg.getText());

    }



}
