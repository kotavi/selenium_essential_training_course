package com.examples.basicwebuiobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Autocomplete {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/autocomplete");

        WebElement addressField = driver.findElement(By.id("autocomplete"));
        addressField.sendKeys("1801 W Parmer Ln, Austin, TX 78727");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement autoCompleteResult = driver.findElement(By.className("pac-item"));
        assert autoCompleteResult.isDisplayed();

//        WebElement autoCompleteResult = driver.findElement(By.xpath("/html/body/div[2]/div"));
        autoCompleteResult.click();
        driver.quit();
    }
}
