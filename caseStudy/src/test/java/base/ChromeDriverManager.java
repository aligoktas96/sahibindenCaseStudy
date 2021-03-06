package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager{
    protected static ChromeDriver driver = new ChromeDriver();
    public ChromeDriverManager(){
        if (driver.getSessionId() == null){
            driver = new ChromeDriver();
        }
        Dimension dimension = new Dimension(1440,960);
        driver.manage().window().setSize(dimension);
    }

}