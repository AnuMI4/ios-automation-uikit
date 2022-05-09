import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import java.net.MalformedURLException;
import java.net.URL;

public class setup {
    public IOSDriver driver;
    @BeforeSuite
    public void setup () throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "13");
        capabilities.setCapability("deviceName", "iPhone 11");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("udid", "33E78E74-2014-4AC5-A721-BD8A7983B4EC");
        capabilities.setCapability("app", "/Users/anummirza/Desktop/UIKitCatalog.app");

        URL url = null;
        url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new IOSDriver(url, capabilities);
    }
}
