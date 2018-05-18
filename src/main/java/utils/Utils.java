package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

    public static void waitForElementIsVisible(WebElement element) {
    WebDriverWait wait = new WebDriverWait(BrowserManager.browser.get(), 10);
    wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void clickWithJS(WebElement id) {
        JavascriptExecutor executor = (JavascriptExecutor) BrowserManager.browser.get();
        executor.executeScript("arguments[0].click();", id);
    }

}


