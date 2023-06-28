import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Homework17 extends BaseTest{

    public void addSongToPlaylist(){
        navigateToPage();
        provideEmail("victor.flores@testpro.io");
        providePasswork("te$t$tudent");
        clickSubmit();


    }




}
