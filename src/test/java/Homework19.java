
import org.testng.annotations.Test;

public class Homework19 extends BaseTest {
    @Test(dataProvider = "IncorrectLoginProviders")
    public void LoginEmptyEmailPasswordTest(String email, String password) {

            //Put the email field inside the web page
            enterEmail("email");
            // Put the password inside the web app
            clickSubmit.enterPassword("password");
            //Click on the submit button
            clickSubmit();

            //Click play button
           // playNextSong();

            //Validate song is playing
            //validateSongPlaying();

            Thread.sleep(10000);

    }
}

