package com.examples.basicwebuiobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class PageScroll {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/scroll");

        WebElement fullNameField = driver.findElement(By.id("name"));

        Actions actions = new Actions(driver);
        actions.moveToElement(fullNameField);
        actions.perform();

        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        fullNameField.sendKeys("Merry De Marco");

        WebElement dateField = driver.findElement(By.id("date"));
        dateField.sendKeys("10/15/2019");

        driver.quit();
    }
}
