package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.LocatorUtils;
import utilities.TestDataUtils;

public class Login {

    private WebDriver driver;
    private LocatorUtils locatorUtils = new LocatorUtils(getClass().getSimpleName());
    private TestDataUtils testDataUtils = new TestDataUtils();

    public Login (WebDriver driver) {
        this.driver = driver;
    }

    private By emailField = By.xpath(locatorUtils.getLocator("emailFieldXpath"));
    private By passwordField = By.xpath(locatorUtils.getLocator("passwordFieldXpath"));
    private By loginButton = By.xpath(locatorUtils.getLocator("loginButtonXpath"));

    public void login (String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public void navigateToLoginPage () {
        driver.navigate().to(testDataUtils.getValue("appUrl"));
    }

}
