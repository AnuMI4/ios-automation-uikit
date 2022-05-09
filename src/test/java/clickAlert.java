import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class clickAlert extends setup {
    @Test
    public void testAlert () {
        String message;
        driver.findElement(By.name("Alert Controller")).click();
        driver.findElement(By.name("Simple")).click();
        message = driver.switchTo().alert().getText();
        System.out.println(message);
        Assert.assertTrue(message.contains("A Short Title is Best"));
    }
}
