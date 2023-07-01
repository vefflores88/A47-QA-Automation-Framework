import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {
    @Test (dataProvider = "CorrectLoginProviders", dataProviderClass = BaseTest.class)
    public void LoginEmptyEmailPasswordTest(String email, String password) {

        enterEmail(email);
        enterEmail(email);
        enterPassword(password);

        clickSubmit();
    }
}
