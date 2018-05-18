package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserManager;

public class LogInOrSignUpFacebookPage {

    @FindBy(css = "label[id*='loginbutton']")
    WebElement loginButtonRecentLogins;

    public LogIntoFacebookPage clickLoginButtonFromSinUpPage() {
        loginButtonRecentLogins.click();
        return PageFactory.initElements(BrowserManager.browser.get(), LogIntoFacebookPage.class);
    }
}
