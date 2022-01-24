package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends PageBase{
            public SearchPage(WebDriver driver) {
                super(driver);
            }

                @FindBy(id = "small-searchterms")
                @CacheLookup
                WebElement search_txtbox;

                @FindBy(css = "button.button-1.search-box-button")
                @CacheLookup
                WebElement search_btn;

                @FindBy(id = "ui-id-1")
                @CacheLookup
                List<WebElement>  product_list;

                @FindBy(linkText = "Apple MacBook Pro 13-inch")
                @CacheLookup
                WebElement productTitlelink;

                public void openProductDetailsPage ()
                {
                    clickButton(productTitlelink);
                }


                public void searchForProduct(String productName)
                {
                    setElementText(search_txtbox,productName);
                    clickButton(search_btn);
                }

                public void productSearchUseAutoSuggest(String searchtxt)
                {
                    setElementText(search_txtbox,searchtxt);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    product_list.get(0).click();
                }






}
