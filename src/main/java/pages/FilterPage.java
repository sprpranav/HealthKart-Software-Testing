package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterPage extends BasePage {

    public FilterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='sortByVariants']/option[2]") // Update XPath based on actual site
    WebElement firstFilter;

    public void applyFilter() {
        firstFilter.click();
    }
}
