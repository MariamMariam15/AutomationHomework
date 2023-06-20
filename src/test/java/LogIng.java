import PageStep.LogInStep;
import Utils.GooglechromeRunner;
import org.testng.annotations.Test;
import static DataObject.LogInDate.*;
import static java.lang.Thread.sleep;

public class LogIng extends GooglechromeRunner {


    @Test(priority = 1)
    public void  LoginWithInCorrectData () throws InterruptedException {

        LogInStep step1 = new LogInStep(driver);
        
        step1.SingButton();
        step1.emailInput(CorrectEmail);
        step1.passwordInput(CorrectPassword);
        step1.LogInButton();

        sleep(5000); //"რეალურ ტესტებში არ გამოვიყენებ ლელა და ნათია მასწ:დ"
        

    }
    @Test(priority = 2)
    public void LogInWithCorrectEmailandIncorrectPassword() throws InterruptedException {

        LogInStep step2 = new LogInStep(driver);

        step2.SingButton();
        step2.emailInput(CorrectEmail);
        step2.passwordInput(IncorrectPassword);
        step2.LogInButton();
        step2.ValidationMessage();
        sleep(5000); //"რეალურ ტესტებში არ გამოვიყენებ  ლელა და ნათია მასწ :დ"

    }
}

