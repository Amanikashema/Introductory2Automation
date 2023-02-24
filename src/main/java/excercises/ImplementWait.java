package excercises;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplementWait {
    public static void main(String[] args) {
        // creating a Webdriver object
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ("/src/main/resources/chromedriver.exe"));

        // Instanciating new Chrome driver
        driver = new ChromeDriver();

        String base_url = "https://demo.guru99.com/test/guru99home/";
        driver.get(base_url);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String pageTitle = driver.getTitle();

        if (pageTitle.contentEquals("Demo Guru99 Page")) {
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test Failed");
        }

        driver.close();
    }
}
