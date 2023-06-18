package Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public  class GooglechromeRunner {
    public static WebDriver driver = new ChromeDriver();


    @BeforeMethod
    public void  openChrome (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://ss.ge/ka/udzravi-qoneba?utm_source=saqme.ge&utm_medium=redirect");

    }

    @AfterMethod
    public void closeChrome(){
        driver.close();


    }

}


