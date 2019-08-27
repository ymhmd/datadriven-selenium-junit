package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Login;
import utilities.TestDataUtils;

public class SampleTests {

    private WebDriver driver = null;
    private TestDataUtils testDataUtils = new TestDataUtils();

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void sampleTestCase() {
        Login l = new Login(driver);

        l.navigateToLoginPage();

        String email = testDataUtils.getValue("email");
        String password = testDataUtils.getValue("password");

        l.login(email, password);
    }
}
