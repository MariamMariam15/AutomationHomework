package PageStep;
import PageObject.LogInPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;



public class LogInStep extends LogInPage {
    WebDriver driver;

    public LogInStep(WebDriver driver1) {

        driver = driver1;

    }

    @Step("Click SingButton")
    public void SingButton() {
        driver.findElement(SignInButton).click();

    }

    @Step("Enter Email")
    public void emailInput(String email) {
        driver.findElement(Email).sendKeys(email);

    }

    @Step("Enter Password")
    public void passwordInput(String password) {
        driver.findElement(Password).sendKeys(password);
    }

    @Step("Clich LogIn Button ")
    public void LogInButton() {

        driver.findElement(Login).click();
    }


    @Step ("Check validation message")
    public void ValidationMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ValidationMessage));
        String ActualResuld = driver.findElement(ValidationMessage).getText();
        String ExpectedResult = "ტელეფონი / ელ-ფოსტა ან პაროლი არასწორია";
        Assert.assertEquals(ActualResuld, ExpectedResult);


    }
}




