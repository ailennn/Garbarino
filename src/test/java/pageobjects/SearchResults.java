package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResults extends BasePage {

    @FindBy(css = "ul.gb-list-grid > li:nth-child(1)")
    private Product product;

    public SearchResults(WebDriver driver) {
        super(driver);
    }

    public Product getProduct() {
        return product;
    }
}
