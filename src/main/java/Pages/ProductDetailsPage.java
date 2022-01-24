package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase{
            public ProductDetailsPage(WebDriver driver) {
                super(driver);
                jse=(JavascriptExecutor)driver;
            }

                @FindBy(css = "div.product-name")
                @CacheLookup
                public WebElement productNameBread;

                @FindBy(id = "price-value-4")
                @CacheLookup
                public WebElement productPriceLbl;

                @FindBy(linkText = "Add your review")
                @CacheLookup
                public WebElement addReviewLink;

                @FindBy(id = "add-to-wishlist-button-4")
                @CacheLookup
                WebElement addToWishList_Link;

                @FindBy(linkText = "Compare products list")
                @CacheLookup
                WebElement comparePage_link;

                @FindBy(css = "button.button-2.add-to-compare-list-button")
                @CacheLookup
                WebElement addToCompare_Link;

                @FindBy(id = "add-to-cart-button-4")
                @CacheLookup
                public WebElement addToCart_btn;

                @FindBy(css = "button.button-2.email-a-friend-button")
                @CacheLookup
                public  WebElement emailAFriend;

                public void addingItemToCart ()
    {
        clickButton(addToCart_btn);
    }

                public void sendFriendEmailbtn ()
                {
                    clickButton(emailAFriend);
                }

                public void addingReview ()
                {
                    clickButton(addReviewLink);
                }

                public void addingToWishList ()
    {
        clickButton(addToWishList_Link);
    }

                public void addingToCompareList ()
    {
        clickButton(addToCompare_Link);
    }

               public void openingComparePage ()
                    {
                        scrollToButtom();
                        clickButton(comparePage_link);
                    }

//                @FindBy(css = "span.close")
//                @CacheLookup
//                public   WebElement closeLabelofcart;

//                public void closeLabelOfAddingItemSuccessfully()
//                {
//                    clickButton(closeLabelofcart);
//                }


//                @FindBy(css = "div.bar-notification.success")
//                @CacheLookup
//                public   WebElement resultLblOfAddingItem;



}
