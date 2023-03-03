package excercises;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.awt.*;
import java.lang.Thread;

import java.time.Duration;

// creating main Takealot Project Class
public class TakeAlotProject {

    // declaring a Web driver object as a public variable
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ("/src/main/resources/chromedriver.exe"));

        // Instantiating a new Chrome driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        String base_url = "https://www.takealot.com/";
        driver.get(base_url);

        // Implicitly wait for all elements to appear on the home page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String actualHomepageTitle = driver.getTitle();
        String expectedHomePageTitle = "Takealot.com: Online Shopping | SA's leading online store";
        // Assert home page title
        Assert.assertEquals(actualHomepageTitle,expectedHomePageTitle);

        // Find cookie button element and click cookies button
        WebElement cookieBtn = driver.findElement(By.className("cookies-banner-module_dismiss-button_24Z98"));
        cookieBtn.click();

        // Find Search box Web elements
        WebElement searchBox = driver.findElement(By.className("search-field"));
        searchBox.sendKeys("Guitar");

        // Find Search Button Web Element
        WebElement searchBtn = driver.findElement(By.className("search-btn"));
        // Click Search Button
        searchBtn.click();

        // Wait 20 seconds for add to cart button element to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("add-to-cart-button")));

        //Find Add Cart Button Web Element
        WebElement addCartBtn = driver.findElement(By.className("add-to-cart-button"));
        //Assert if add cart button is displayed on the website
        Assert.assertTrue(addCartBtn.isDisplayed());
        // click add cart button on product
        addCartBtn.click();

        // Wait 20 seconds for mini cart button element to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("mini-cart-button")));

        // find mini cart button Web Element
        WebElement miniCartBtn = driver.findElement(By.className("mini-cart-button"));
        //Assert if cart button is displayed on the website
        Assert.assertTrue(miniCartBtn.isDisplayed());
        // click cart button to open Cart Screen
        miniCartBtn.click();

        // find product count on cart Web element
        WebElement cartProductCount = driver.findElement(By.className("badge-count"));
        String actualProductCount = cartProductCount.getText();
        String expectedProductCount = "1";

        // ensure if product count is displayed on cart assert the number of item on cart
        if(cartProductCount.isDisplayed()){
            Assert.assertEquals(actualProductCount, expectedProductCount);
            System.out.println("Attention You have " + actualProductCount + " Item in the Cart!!!");
        }
        else{
            System.out.println("Cart is Empty");
        }

        // wait 5 seconds before closing windows
        Thread.sleep(5000);
        // close windows
        driver.close();

    }
}