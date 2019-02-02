package testHome;

import home.SportsEvent;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SportsEventTest extends SportsEvent {
    SportsEvent sportsEvent;

    @BeforeMethod
    public void initElements() {
        sportsEvent = PageFactory.initElements(ad, SportsEvent.class);
    }
    @Test
    public void testSportsEvent() throws InterruptedException {
        sportsEvent.checkSportsEvent();
    }
}