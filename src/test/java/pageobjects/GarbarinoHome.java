package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GarbarinoHome extends BasePage {

    @FindBy(className = "gb-search-input")
    private WebElement searchInput;

    @FindBy(css = ".gb-search .gb-search-button")
    private WebElement searchButton;

    public GarbarinoHome(WebDriver driver) {
        super(driver);
        driver.get("https://www.garbarino.com");
    }

    public GarbarinoHome enterProduct(String product){
        searchInput.sendKeys(product);
        return this;
    }

    public SearchResults search(){
        searchButton.click();
        return new SearchResults(getDriver());
    }


}
