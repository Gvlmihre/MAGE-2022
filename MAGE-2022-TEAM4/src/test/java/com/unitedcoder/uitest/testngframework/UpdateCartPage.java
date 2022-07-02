package com.unitedcoder.uitest.testngframework;


import com.unitedcoder.frontend.TestBase;
import com.unitedcoder.uitest.pageobjectmodel.CartPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class UpdateCartPage extends TestBase{

    CartPage cartPage;

    @BeforeClass
    public void setUp(){
       browserSetUp();
    }


    @Test
    public void addLinenBlazerProductToCart(){
        cartPage=new CartPage(driver);
        cartPage.addLinenBlazerToCart();
        Assert.assertTrue(cartPage.verifyLinenBlazerSuccessfullyAddedMessage());
    }

    @Test
    public void updateProductSize(){
        cartPage=new CartPage(driver);
        cartPage.changeProductSizeMethod();
        Assert.assertTrue(cartPage.verifyLinenBlazerProductUpdatedSuccessfully());
    }

    @AfterClass
    public void tearDown() {
        closeBrowser();
    }
}


//    @Test
//    public void addMultipleProducts(){
//        cartPage=new CartPage(driver);
//        cartPage.addMultipleProductsToCartMethod();
//        Assert.assertTrue(cartPage.verifyChelseaTeaAdded());
//    }
//
//    @Test
//    public void addProduct(){
//        cartPage=new CartPage(driver);
//        WebElement linenBlazer=driver.findElement(By.xpath("//*[text()=\"Linen Blazer\"]"));
//        cartPage.addProductToCart(linenBlazer,"22","78");
//    }
//





