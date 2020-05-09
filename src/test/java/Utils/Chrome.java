package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Chrome {
    public static WebDriver driver;

    public static void start()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        // "--no-sandbox" powinno pomóc ubijać procesy chromedrivera w systemie
        options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);

        // implicitlyWait pozwala globalnie ustawić czekanie na elementy podczas wykonywania sie testów
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static void end()
    {
        if (driver != null) {
            driver.quit();
        }
    }
}
