import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
public class Homework20 extends BaseTest {
    //@Test
    //public void deletePlaylist()throws InterruptedException{

        String deletedMessageText = "Deleted playlist";

        //Put the email field inside the web page
        //enterEmail("victor.flores@testpro.io");

        // Put the password inside the web app
        //enterPassword("te$t$tudent");

        //Click on the submit button
        //clickSubmit();

        //click on playlist
        //clickPlaylist();

        //click delete playlist(X Playlist)
        //clickDeletePlaylist();

        //verify playlist is deleted
        //Assert.assertTrue(getDeletedDisplay().contains(deletedMessageText));
    //}

    @Test (dataProvider = "CorrectLoginProviders", dataProviderClass = BaseTest.class)
    public void PlaySong(String email, String password) {
        enterEmail("victor.flores@testpro.io");
        enterPassword("te$t$tudent");
        clickSubmit();

        chooseAllSongsList();
        contextClickFirstSong();
        choosePlayOption();

        Assert.assertTrue(validateSongPlaying());
    }
    @Test (dataProvider = "CorrectLoginProviders", dataProviderClass = BaseTest.class)
    public void HoverPlayButton(String email, String password){
        enterEmail("victor.flores@testpro.io");
        enterPassword("te$t$tudent");
        clickSubmit();
        chooseAllSongsList();
        hoverPlay();
        Assert.assertTrue(hoverPlay().isDisplayed());

    }
    //@Test(dataProvider = "CorrectLoginProviders", dataProviderClass = BaseTest.class)
//    public void countSongsInPlaylist(String email, String password) {
//        // Put the email field inside the web page
//        enterEmail(email);
//        // Put the password inside the web app
//        enterPassword(password);
//        // Click on the submit button
//        clickSubmit();
//
//        choosePlaylistByName("B");
//        displayAllSongs();
//        Assert.assertTrue(getPlaylistDetails().contains(String.valueOf(countSongs())));
    //}

    @Test(dataProvider = "CorrectLoginProviders", dataProviderClass = BaseTest.class)
    public void renamePlaylist(String email, String password) {
        // Put the email field inside the web page
        enterEmail("victor.flores@testpro.io");
        // Put the password inside the web app
        enterPassword("te$t$tudent");
        clickSubmit();
        // Click on the submit button
        clickSubmit();

        doubleClickPlaylist();
        enterNewPlaylistName();
        Assert.assertTrue(doesPlaylistExist());
    }
    }

