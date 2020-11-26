import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ItsForFarmers {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://itsforfarmers.com:10000/session_login.cgi?logout=1");

        driver.findElement(By.id("body")).click();
        driver.findElement(By.id("final-paragraph")).click();

        driver.findElement(By.name("user")).sendKeys("Sagar");
        Thread.sleep(4000);

        driver.findElement(By.className("form-control session_login use_input_warning_caps")).sendKeys("Qwerty@123");
        Thread.sleep(4000);

        driver.findElement(By.className("btn btn-primary")).click();
        Thread.sleep(4000);

        driver.quit();
    }
}
