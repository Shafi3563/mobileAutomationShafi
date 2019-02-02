package testHome;

import home.Fashion;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FashionTest extends Fashion {
    Fashion fashion;
    @BeforeMethod
    public void initElements(){
        fashion = PageFactory.initElements(ad, Fashion.class);
    }
    @Test
    public void testFashion() throws InterruptedException {
        fashion.checkFashion();
    }
}