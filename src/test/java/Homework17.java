import org.testng.annotations.Test;

public class Homework17 extends BsTest{
    @Test
    public static void addSongToPlaylist() throws InterruptedException {

        // Open the URL for the web page on the chrome browser
        openLoginUrl();

        //Put the email field inside the web page
        enterEmail("victor.flores@testpro.io");

        // Put the password inside the web app
        enterPassword("te$t$tudent");

        //Click on the submit button
        clickSubmit();

        //Search for a song in search field
        searchSong("Beautiful");

        clickViewAll();

        Thread.sleep(5000);

    }


}

