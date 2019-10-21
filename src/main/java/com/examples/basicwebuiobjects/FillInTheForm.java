package com.examples.basicwebuiobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FillInTheForm {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        identifying all web elements
        WebElement firstNameTextField = driver.findElement(By.id("first-name"));
        WebElement lastNameTextField = driver.findElement(By.id("last-name"));
        WebElement jobTitleTextField = driver.findElement(By.id("job-title"));

        WebElement highSchoolRadioButton = driver.findElement(By.id("radio-button-1"));
        WebElement collegeRadioButton = driver.findElement(By.id("radio-button-2"));
        WebElement gradSchoolRadioButton = driver.findElement(By.id("radio-button-3"));

        WebElement maleCheckBox = driver.findElement(By.id("checkbox-1"));
        WebElement femaleCheckBox = driver.findElement(By.id("checkbox-2"));
        WebElement notSayCheckBox = driver.findElement(By.id("checkbox-3"));

        WebElement yearsOfExperienceMenu = driver.findElement(By.id("select-menu"));
        Select selectMenu = new Select(yearsOfExperienceMenu);

        WebElement datePicker = driver.findElement(By.id("datepicker"));

        WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));

//        entering data to the form
        firstNameTextField.sendKeys("Laura");
        lastNameTextField.sendKeys("Palmer");
        jobTitleTextField.sendKeys("Sales assistant");
        highSchoolRadioButton.click();
        femaleCheckBox.click();
        selectMenu.selectByValue("2");
        datePicker.sendKeys("02/24/1989");
        datePicker.sendKeys(Keys.RETURN);

        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));
        assert alert.getText().equalsIgnoreCase("The form was successfully submitted!");

        driver.quit();
    }
}
