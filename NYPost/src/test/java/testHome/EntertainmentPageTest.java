package testHome;

import home.EntertainmentPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EntertainmentPageTest extends EntertainmentPage {
    EntertainmentPage entertainment;
    @BeforeMethod
    public void initElements(){
        entertainment = PageFactory.initElements(ad, EntertainmentPage.class);
    }
    @Test
    public void testEntertainment() throws InterruptedException {
        entertainment.checkEntertainment();
    }
}