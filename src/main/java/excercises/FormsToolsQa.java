package excercises;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FormsToolsQa {
    public static void main(String[] args) throws InterruptedException {
        // creating a Webdriver object
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ("/src/main/resources/chromedriver.exe"));

        // Instantiating new Chrome driver
        driver = new ChromeDriver();
        //Maximizes the browser window
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // assigning base url to a string variable
        String base_url = "https://demoqa.com/automation-practice-form";

        // using chrome driver to get base url
        driver.get(base_url);
//
        // creating a first name variable to hold the input field located web element
        WebElement fname = driver.findElement(By.id("firstName"));
        fname.sendKeys("Amani");


        // creating a last name variable to hold the input field  located web element
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Kashema");

        // creating a last name variable to hold the input field  located web element
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("akashema@gmail.com");
//
        Thread.sleep(2000);
        // Locate Gender radio button Web element and select Male gender radio button
        WebElement maleRadioBtn = driver.findElement(By.id("gender-radio-1"));
        maleRadioBtn.click();
        System.out.println(maleRadioBtn.isSelected());

//
        // creating a mobile Number variable to hold the input field  located web element
        WebElement mobileNumber = driver.findElement(By.id("userNumber"));
        mobileNumber.sendKeys("0736533832");

        // creating a subject variable to hold the input field  located web element
        WebElement subject = driver.findElement(By.id("subjectsInput"));
        subject.sendKeys("Hello World !!!!!");

        // creating Address variable to hold the input field  located web element
        WebElement address = driver.findElement(By.id("currentAddress"));
        address.sendKeys("67 Beacon Valley Street Cape Town");

////        driver.close();


    }
}
