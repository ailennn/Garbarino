package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SamsungProducts extends BasePage {

    @FindBy(css = ".gb-list-grid .gb-list-cluster")
    private List<Product> products;

    public SamsungProducts(WebDriver driver) {
        super(driver);
    }

    public List<Product> getProducts() {
        return products;
    }
}
