package utils;

import org.openqa.selenium.support.PageFactory;
import pages.LogInOrSignUpFacebookPage;

public class Navigation {

    public static String baseURL = "https://www.facebook.com/";

    public static LogInOrSignUpFacebookPage goToFacebook() {
        BrowserManager.browser.get().get(baseURL);
        return PageFactory.initElements(BrowserManager.browser.get(), LogInOrSignUpFacebookPage.class);
    }

}