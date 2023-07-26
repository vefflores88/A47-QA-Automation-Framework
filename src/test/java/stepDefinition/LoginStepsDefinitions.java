package stepDefinition;

import java.time.Duration;

public class LoginStepsDefinitions {
    WebDriver driver;
    WebDriverWait wait:

    @Given ("I open browser")
    public void openBroswer(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}
