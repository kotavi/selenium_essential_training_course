import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

class FormPage {

    static void submitTheForm(WebDriver driver) {
        driver.findElement(By.id("first-name")).sendKeys("Laura");
        driver.findElement(By.id("last-name")).sendKeys("Palmer");
        driver.findElement(By.id("job-title")).sendKeys("Sales assistant");
        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.id("checkbox-2")).click();
        WebElement yearsOfExperienceMenu = driver.findElement(By.id("select-menu"));
        Select selectMenu = new Select(yearsOfExperienceMenu);
        selectMenu.selectByValue("2");

        driver.findElement(By.id("datepicker")).sendKeys("02/24/1989");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}
