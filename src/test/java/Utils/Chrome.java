package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static ChromeDriver driver;

    public static void start()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public static void end()
    {
        if (driver != null) {
            driver.quit();
        }
    }
}
