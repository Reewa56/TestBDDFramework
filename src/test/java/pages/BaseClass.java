package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

    public WebDriver driver;

    public WebDriver Initializedriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver();
        return driver;
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}
