package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CompareProductPage extends PageBase{
        public CompareProductPage(WebDriver driver) {
            super(driver);
        }


        @FindBy(css = "div.page-title")
        public WebElement successmsg;

        @FindBy(css = "div.no-data")
        public WebElement successDeletedmsg;

        @FindBy(css = "a.clear-list")
        WebElement successDeletedList;

        @FindBy(css = "button.button-2.remove-button")
       WebElement successDeletedOneProduct;


        public void deleteCompareProductList()
        {
            clickButton(successDeletedList);
        }
        public void deleteItemFromCompareList()
        {
            clickButton(successDeletedOneProduct);
        }

}
