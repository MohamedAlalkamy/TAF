package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends PageBase{
            public WishListPage(WebDriver driver) {
                super(driver);
            }

            @FindBy(css = "a.ico-wishlist")
            @CacheLookup
            WebElement WishList_Link;

            @FindBy(css = "td.remove-from-cart")
            @CacheLookup
            WebElement removeFromWishList_Link;

            @FindBy(css = "div.page-title")
            public WebElement successmsg;

            @FindBy(css = "div.no-data")
            public WebElement successDeletedmsg;

            public void openWishListPage()
            {
                clickButton(WishList_Link);
            }
            public void deleteItemFromWishList()
            {
                clickButton(removeFromWishList_Link);
            }




}
