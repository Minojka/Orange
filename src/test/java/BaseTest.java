import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public ChromeDriver openBrowser(){
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//ucitavanje selectora do 10 sec
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));//ucitavanje strane do 10 sec
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");//u base uvek ide url pocetni
        return driver;
    }
}
