import org.testng.annotations.Test;

public class Homework19 extends BaseTest {
    @Test
    public void deletePlaylist()throws InterruptedException{
        // Open the URL for the web page on the chrome browser
        //openLoginUrl();

        //Put the email field inside the web page
        enterEmail("victor.flores@testpro.io");

        // Put the password inside the web app
        enterPassword("te$t$tudent");

        //Click on the submit button
        clickSubmit();

        //Click play button
        playNextSong();

        //Validate song is playing
        validateSongPlaying();

        Thread.sleep(5000);

    }
}
