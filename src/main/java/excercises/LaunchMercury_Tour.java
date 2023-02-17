package excercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchMercury_Tour {
    public static void main(String[] args) {
        // creating a Webdriver object
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ("/src/main/resources/chromedriver.exe"));

        // Instanciating new Chrome driver
        driver = new ChromeDriver();

        String base_url = "https://demo.guru99.com/test/newtours/";
        driver.get(base_url);
        driver.close();
    }
}