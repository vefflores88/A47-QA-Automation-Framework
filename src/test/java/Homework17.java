import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class Homework17 extends BaseTest {
        @Test
        public void addSongtoPlaylist() throws InterruptedException {

            // Open the URL for the web page on the chrome browser
            openLoginUrl();

            //Put the email field inside the web page
            enterEmail("demo@class.com");

            // Put the password inside the web app
            enterPassword("te$t$tudent");

            //Click on the submit button
            clickSubmit();

            //Check if the user avatar is displaying (Successful Login Check)
            WebElement avatar = driver.findElement(By.cssSelector(".avatar"));
            Assert.assertTrue(avatar.isDisplayed());

        }

        @Test
        public static void LoginEmptyEmailPasswordTest() {

            // Open the URL for the web page on the chrome browser
            openLoginUrl();

            //Put the email field inside the web page
            enterEmail("demo@class.com");

            // Put the password inside the web app
            enterPassword("te$t$tudent");

            //Click on the submit button
            clickSubmit();

            //Check for Incorrect
            Assert.assertEquals(driver.getCurrentUrl(), url);

            //Quit the browser
            driver.quit();

        }

    }

