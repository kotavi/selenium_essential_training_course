import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class ConformationPage {

    static void waitForAlertBanner(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));
    }

    static String getAlertBannerText(WebDriver driver) {
        return driver.findElement(By.cssSelector(".alert.alert-success")).getText();
    }
}
