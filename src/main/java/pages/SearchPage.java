package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='searchInput']")
    WebElement searchInput;

    public void searchProduct(String productName) {
        searchInput.sendKeys(productName + "\n");
    }
}
