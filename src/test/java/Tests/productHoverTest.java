package Tests;

import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class productHoverTest extends TestBase{

    HomePage homePage_object;

        @Test
        public void productHovering()
        {
            homePage_object=new HomePage(driver);
            homePage_object.selectNotebooksMenu();
            Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
            System.out.println("URL Is : - " + driver.getCurrentUrl());
            Assert.assertTrue(homePage_object.successmsg.getText().contains("Notebooks"));
            System.out.println( "Title is : -  "+homePage_object.successmsg.getText());
        }


}
