package excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.lang.Thread;

import java.time.Duration;

public class TakeAlotProject {
    public static void main(String[] args) {
        // creating a Webdriver object
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ("/src/main/resources/chromedriver.exe"));

        // Instanciating new Chrome driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        String base_url = "https://www.takealot.com/";
        driver.get(base_url);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        // Find Search box Web elements
        WebElement searchBox = driver.findElement(By.className("search-field"));
        searchBox.sendKeys("Guitar");

        // Find Search Button Web Element
        WebElement searchBtn = driver.findElement(By.className("search-btn"));
        // Click Search Button
        searchBtn.click();

        // Find Add Cart Button Web Element
        WebElement addCartBtn = driver.findElement(By.className("add-to-cart-button"));
        try {
            Thread.sleep(5000);
            addCartBtn.click();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



//        driver.close();
    }
}