package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager {

    public static ThreadLocal<WebDriver> browser = new ThreadLocal<WebDriver>();

    public static WebDriver getBrowser() {
        return browser.get();
    }

    public static void openBrowser() {
        String browserType = System.getProperty("browser");
        if ("firefox".equals(browserType)) {
            System.setProperty("webdriver.gecko.driver", "./target/classes/geckodriver.exe");
            browser.set(new FirefoxDriver());

        } else if ("chrome".equals(browserType)) {
            System.setProperty("webdriver.chrome.driver", "./target/classes/chromedriver.exe");
            browser.set(new ChromeDriver());

        } else {
            System.setProperty("webdriver.gecko.driver", "./target/classes/geckodriver.exe");
            browser.set(new FirefoxDriver());
            System.out.println("FireFox is browser by default!");
        }

        browser.get().manage().window().maximize();
        browser.get().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public static void closeBrowser() {
        browser.get().quit();
    }
}
