package Sigleton_Design_Pattern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class Singleton {
    private static Singleton singleton;
    private static WebDriver driver;


    private Singleton() {
        driver = WebDriverManager.chromiumdriver().create();
        driver.get("https://www.ebay.com");
        driver.close();
    }
    public static Singleton getISingleton() {
        if(singleton == null)
            singleton = new Singleton();
        return singleton;
    }


    public static WebDriver getDriver() {
        return driver;
    }
}
