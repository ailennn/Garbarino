package scripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import pageobjects.GarbarinoHome;
import pageobjects.MyDriver;

public class BaseTest {

    MyDriver myDriver;
    private GarbarinoHome garbarinoHome;

    @BeforeClass(alwaysRun = true)
    public void setBrowser(){
        myDriver = new MyDriver();
        garbarinoHome = new GarbarinoHome(myDriver.getDriver());
    }

    public GarbarinoHome getGarbarinoHome() {
        return garbarinoHome;
    }
}
