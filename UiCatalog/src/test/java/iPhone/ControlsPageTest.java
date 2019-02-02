package iPhone;

import iPhone7.Controls;
import iPhone7.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ControlsPageTest extends Controls {
    Controls controls;

    @BeforeMethod
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getButtonPage();
        controls = PageFactory.initElements(ad, Controls.class);
    }
    @Test
    public void testControlsWholePage() throws InterruptedException {
        controls.checkButtonsWholePage();sleep(2);
    }
    @Test
    public void testSwitchOption() throws InterruptedException {
        controls.checkSwitchOption();sleep(2);
    }
    @Test
    public void testStandardSwitch() throws InterruptedException {
        controls.checkStandardSwitch();sleep(2);
    }
    @Test
    public void testSwitchButton() throws InterruptedException {
        controls.checkSwitchButton();sleep(2);
    }
    @Test
    public void testControlsView() throws InterruptedException {
        controls.checkControlsView();sleep(2);
    }
    @Test
    public void testUiSlider() throws InterruptedException {
        controls.checkUiSlider();sleep(2);
    }
    @Test
    public void testStandardSlider() throws InterruptedException {
        controls.checkStandardSlider();sleep(2);
    }
    @Test
    public void testSliderButton() throws InterruptedException {
        controls.checkSliderButton();sleep(2);
    }
    @Test
    public void testCustomSlider() throws InterruptedException {
        controls.checkCustomSlider();sleep(2);
    }
    @Test
    public void testCustomSliderButton() throws InterruptedException {
        controls.checkCustomSliderButton();sleep(2);
    }
}