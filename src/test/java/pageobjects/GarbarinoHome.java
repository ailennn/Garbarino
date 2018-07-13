package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GarbarinoHome extends BasePage {

    @FindBy(css = ".gb-menu-n1")
    private List<WebElement> categories;

    @FindBy(css = ".gb-category-submenu-list-items [href*='samsung']")
    private WebElement samsungCategory;

    public GarbarinoHome(WebDriver driver) {
        super(driver);
        driver.get("https://www.garbarino.com");
    }

    public GarbarinoHome getTelevisores(){
        categories.get(Categories.TELEVISORES.ordinal()).click();
        return this;
    }

    public SamsungProducts getSamsung(){
        samsungCategory.click();
        return new SamsungProducts(getDriver());
    }

    public enum Categories {
        TELEVISORES, CELULARES, TECNOLOGIA, ELECTRODOMESTICOS, CASA_Y_JARDIN, SALUD_Y_BELLEZA, BEBES, DEPORTES, MAS_CATEGORIAS
    }
}
