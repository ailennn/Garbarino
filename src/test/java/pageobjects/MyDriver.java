package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {

    private WebDriver driver;

    public MyDriver(){
        System.setProperty("webdriver.chrome.driver", "/");
        driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
