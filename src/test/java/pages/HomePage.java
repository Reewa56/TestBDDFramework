package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePage  {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @Test
    public void AddCred(String email, String password){
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
    }

}
