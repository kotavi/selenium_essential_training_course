package com.examples.basicwebuiobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/datepicker");

        WebElement datePickerTextField = driver.findElement(By.id("datepicker"));
        datePickerTextField.click();
        assert driver.findElement(By.cssSelector(".datepicker-days")).isDisplayed();

        datePickerTextField.sendKeys("10/18/19");
        datePickerTextField.sendKeys(Keys.RETURN);
        Thread.sleep(1500);
        assert !driver.findElement(By.cssSelector(".datepicker-days")).isDisplayed();

        datePickerTextField.clear();
        datePickerTextField.click();

        Thread.sleep(1500);

        driver.quit();
    }
}
