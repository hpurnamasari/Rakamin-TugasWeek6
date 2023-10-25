package Saucedemo;

import org.junit.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class webautomation {
    @Test
    public void success_login_case() {
        String baseUrl = "https://www.saucedemo.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.id("user-name")).sendKeys(new CharSequence[]{"standard_user"});
        driver.findElement(By.id("password")).sendKeys(new CharSequence[]{"secret_sauce"});
        driver.findElement(By.id("login-button")).click();
    }

    @Test
    public void failed_login_case1() {
        String baseUrl = "https://www.saucedemo.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.id("user-name")).sendKeys(new CharSequence[]{"standard_user123"});
        driver.findElement(By.id("password")).sendKeys(new CharSequence[]{"secret_sauce"});
        driver.findElement(By.id("login-button")).click();
        String ErrorLogin = driver.findElement(By.xpath("//div[@role='alert']")).getText();
        Assert.assertEquals(ErrorLogin, "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void failed_login_case2() {
        String baseUrl = "https://www.saucedemo.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.id("user-name")).sendKeys(new CharSequence[]{"standard_user"});
        driver.findElement(By.id("password")).sendKeys(new CharSequence[]{"secret123_sauce"});
        driver.findElement(By.id("login-button")).click();
        String ErrorLogin = driver.findElement(By.xpath("//div[@role='alert']")).getText();
        Assert.assertEquals(ErrorLogin, "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void addtochart() {
        String baseUrl = "https://www.saucedemo.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.id("user-name")).sendKeys(new CharSequence[]{"standard_user"});
        driver.findElement(By.id("password")).sendKeys(new CharSequence[]{"secret_sauce"});
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @Test
    public void removeproduct() {
        String baseUrl = "https://www.saucedemo.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.id("user-name")).sendKeys(new CharSequence[]{"standard_user"});
        driver.findElement(By.id("password")).sendKeys(new CharSequence[]{"secret_sauce"});
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
    }

    @Test
    public void kliktogglemenu() {
        String baseUrl = "https://www.saucedemo.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.id("user-name")).sendKeys(new CharSequence[]{"standard_user"});
        driver.findElement(By.id("password")).sendKeys(new CharSequence[]{"secret_sauce"});
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("react-burger-menu-btn")).click();
    }
}
