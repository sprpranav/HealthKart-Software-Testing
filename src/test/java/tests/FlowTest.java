package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchPage;
import pages.FilterPage;
import pages.ProductPage;
import utilities.DriverSetup;

public class FlowTest extends DriverSetup {

    @Test(priority = 1)
    public void searchProductTest() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchProduct("whey protein");
    }

    @Test(priority = 2)
    public void applyFilterTest() {
        FilterPage filterPage = new FilterPage(driver);
        filterPage.applyFilter();
    }

    @Test(priority = 3)
    public void viewProductDetailsTest() {
        ProductPage productPage = new ProductPage(driver);
        productPage.openProductDetails();
    }

    @Test(priority = 4)
    public void checkAddToCartVisibilityTest() {
        ProductPage productPage = new ProductPage(driver);
        Assert.assertTrue(productPage.isAddToCartVisible(), "Add To Cart button should be visible");
    }

    @Test(priority = 5)
    public void addToCartTest() {
        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();
    }


}
