package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//import Hooks.BaseTest;


public class LoginTest  {

    WebDriver driver;

    public LoginTest(WebDriver driver) {
        this.driver = driver;
    }

    @Test
    public void LoginCred() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @Test
    public void Submit() {
        driver.findElement(By.id("login-button")).click();
    }

    @Test
    public String ValidateLogin(){
        WebElement headerEle= driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div"));
        String header = headerEle.getText();
        return header;
    }
}
