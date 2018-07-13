package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product extends BasePage{

    @FindBy(className = "value-item")
    private WebElement price;

    public Product(WebDriver driver) {
        super(driver);
    }

    public String getPrice() {
        return price.getText();
    }

    public ProductDetail seeProductDetails(){
        price.click();
        return new ProductDetail(getDriver());
    }
}
