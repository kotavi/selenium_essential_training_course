import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

public class FillInTheForm {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        FormPage.submitTheForm(driver);

        ConformationPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", ConformationPage.getAlertBannerText(driver));

        driver.quit();
    }
}
