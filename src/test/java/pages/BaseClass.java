package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public WebDriver driver;

    public WebDriver Initializedriver(){
        driver = new ChromeDriver();
        return driver;
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}
