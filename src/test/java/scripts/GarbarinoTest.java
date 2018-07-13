package scripts;



import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.GarbarinoHome;

public class GarbarinoTest extends BaseTest {


    @Test
    public void verifyPrices() {

        System.setProperty("webdriver.chrome.driver", "/");
        WebDriver driver = new ChromeDriver();
        driver.get("www.google.com");

        GarbarinoHome garbarinoHome = getGarbarinoHome()
                .getTelevisores();



    }
}
