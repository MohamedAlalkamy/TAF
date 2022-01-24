package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ReviewPage extends PageBase{
        public ReviewPage(WebDriver driver) {
            super(driver);
            jse=(JavascriptExecutor)driver;
        }


        @FindBy(id = "AddProductReview_Title")
        @CacheLookup
        WebElement reviewTitle;

        @FindBy(id = "AddProductReview_ReviewText")
        @CacheLookup
         WebElement reviewText;

        @FindBy(css = "button.button-1.write-product-review-button")
        @CacheLookup
         WebElement submitReviewBtn;

        @FindBy(id = "addproductrating_4")
        @CacheLookup
        WebElement ratingRdoBtns;

        @FindBy(css = "div.result")
        @CacheLookup
        public WebElement successMessage;

        @FindBy(id = "vote-yes-109")
        @CacheLookup
         WebElement helpfullReview;

          public void addingReview(String title,String reviewBody)
          {
              setElementText(reviewTitle,title);
              setElementText(reviewText,reviewBody);
              clickButton(ratingRdoBtns);
              clickButton(submitReviewBtn);



          }

          public void helpfullReview()
          {
              scrollToButtom();
              clickButton(helpfullReview);
          }


}
