import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AllSongsPage extends BasePage {
    public AllSongsPage(WebDriver givenDriver){
        super(givenDriver);
    }

    By firstSong = By.cssSelector("#songResultsWrapper > div > div > div.item-container > table > tr > td.title");
    By playSong = By.cssSelector("li.playback");

    By soundBar = By.cssSelector("#mainFooter > div.media-info-wrap > div.other-controls > div > button:nth-child(2) > div");
    public void contextClickFirstSong(){
        contextClick(firstSong);
    }

    public void choosePlayOption(){
        findElement(playSong).click();
    }

    public boolean isSongPlaying(){
        return findElement(soundBar).isDisplayed();
    }
}
