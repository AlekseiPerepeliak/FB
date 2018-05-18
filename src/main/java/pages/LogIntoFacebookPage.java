package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserManager;
import utils.Utils;

public class LogIntoFacebookPage {

    @FindBy(xpath = "//form[@id='login_form']//input[@name='email']")
    WebElement usenameId;

    @FindBy(xpath = "//form[@id='login_form']//input[@name='pass']")
    WebElement passwordId;

    @FindBy(css = "button[id*='loginbutton']")
    WebElement loginButtonSignIn;

    public LogIntoFacebookPage enterUsersCredentials(String username, String password) {
        usenameId.sendKeys(username);
        passwordId.sendKeys(password);
        return PageFactory.initElements(BrowserManager.browser.get(), LogIntoFacebookPage.class);
    }

    public FacebookUsersHomePage clickLoginButton() {
        Utils.waitForElementIsVisible(loginButtonSignIn);
        Utils.clickWithJS(loginButtonSignIn);
        return PageFactory.initElements(BrowserManager.browser.get(), FacebookUsersHomePage.class);

    }
}