import org.testng.Assert;
import org.testng.annotations.Test;

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
    public void PlaySong(String email, String password){
        enterEmail("victor.flores@testpro.io");
        enterPassword("te$t$tudent");
        clickSubmit();

        chooseAllSongsList();
        contextClickFirstSong();
        choosePlayOption();

        Assert.assertTrue(validateSongPlaying());

    }
}

