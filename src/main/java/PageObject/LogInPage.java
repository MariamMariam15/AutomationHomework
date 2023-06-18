package PageObject;

import org.openqa.selenium.By;


public class LogInPage {
    protected By

            SignInButton = By.className("login-btn"),
            Email = By.id("UserName"),
            Password = By.id("Password"),
            Login = By.className("login_btn"),
            ValidationMessage = By.className("text-danger");



}
