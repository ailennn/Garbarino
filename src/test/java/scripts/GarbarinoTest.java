package scripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import pageobjects.GarbarinoHome;
import pageobjects.Product;
import pageobjects.ProductDetail;
import pageobjects.SearchResults;

import java.util.List;
import java.util.Optional;

import static io.github.bonigarcia.wdm.WebDriverManager.*;
import static org.testng.Assert.assertEquals;

public class GarbarinoTest {

    public static void main(String[] args) throws InterruptedException {
        chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(3000);

        SearchResults product = new GarbarinoHome(driver)
                .enterProduct("samsung")
                .search();

        String priceBefore = driver.findElement(By.cssSelector("li:nth-child(1) span.value-item.value-item--full-price")).getText();
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("li:nth-child(1) span.value-item.value-item--full-price")).click();

        String priceAfter = driver.findElement(By.cssSelector(".gb-main-detail-info  .value-item")).getText();

        assertEquals(priceBefore, priceAfter);


    }
}
