package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetail extends BasePage {

    @FindBy(className = "itemBox--price itemBox--price-lg")
    private WebElement finalPrice;

    public ProductDetail(WebDriver driver) {
        super(driver);
    }

    public String getFinalPrice(){
        return finalPrice.getText();
    }


}
