package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class FacebookUsersHomePage {

    @FindBy(css = "._3qcu._cy7")
    WebElement homeLink;

    @FindBy(css = "._4rbf._53ij")
    WebElement validationErrorMessage;

    public String getUsersHomeLinkText() {
        Utils.waitForElementIsVisible(homeLink);
        return homeLink.getText();
    }

    public String getValidationError() {
        Utils.waitForElementIsVisible(validationErrorMessage);
        return validationErrorMessage.getText();
    }
}