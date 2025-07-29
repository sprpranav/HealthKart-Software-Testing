package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    // First product card or link
    @FindBy(css = "a.variant-img-container.relative.variantBoxDesktopLayoutLoyal_variant-img-container__1ZE7P")
    WebElement firstProduct;

    // Entire "Add To Cart" button
    @FindBy(css = "button.track-add-to-cart.addToCart.tr-addPackToCart.AddToCartnew.cart-cta-vwo")
    WebElement addToCartButton;


    public void openProductDetails() {
        firstProduct.click();
    }

    public boolean isAddToCartVisible() {
        return addToCartButton.isDisplayed();    }


    public void addToCart() {
        addToCartButton.click();
    }
}
