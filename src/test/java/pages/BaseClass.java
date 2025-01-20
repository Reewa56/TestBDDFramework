package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

    public WebDriver driver;

    public WebDriver Initializedriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");  // Run Chrome in headless mode
        options.addArguments("--no-sandbox");  // Disable sandboxing (important for CI environments)
        options.addArguments("--disable-gpu");  // Disable GPU hardware acceleration
       // options.addArguments("--disable-dev-shm-usage");  // Avoid issues with shared memory
      //  options.addArguments("--remote-debugging-port=9222");
        driver = new ChromeDriver(options);
        return driver;
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}
