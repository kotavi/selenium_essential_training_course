package com.examples.basicwebuiobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/autocomplete");

        WebElement addressField = driver.findElement(By.id("autocomplete"));
        addressField.sendKeys("1801 W Parmer Ln, Austin, TX 78727");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement autoCompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
        assert autoCompleteResult.isDisplayed();
        autoCompleteResult.click();
        driver.quit();
    }
}
