package com.examples.basicwebuiobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/fileupload");

        String js_file = "drag_and_drop_helper.js";
        String working_dir = System.getProperty("user.dir");

        String full_path = working_dir + "/src/main/java/com/examples/basicwebuiobjects/" + js_file;

        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys(full_path);
        fileUploadField.sendKeys(Keys.RETURN);
        assert driver.findElement(By.className("rails-default-error-page")).isDisplayed();
        driver.navigate().back();

        Thread.sleep(1000);
        WebElement resetButton = driver.findElement(By.className("btn-reset"));
        resetButton.click();
        Thread.sleep(1000);
        driver.quit();
    }
}
