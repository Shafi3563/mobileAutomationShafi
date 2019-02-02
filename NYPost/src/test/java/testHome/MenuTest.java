package testHome;

import home.Menu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuTest extends Menu {
    Menu menuPage;
    @BeforeMethod
    public void initElements(){
        menuPage = PageFactory.initElements(ad, Menu.class);
    }
    @Test
    public void testPageSix() throws InterruptedException {
        menuPage.checkMenuPage();
    }
}