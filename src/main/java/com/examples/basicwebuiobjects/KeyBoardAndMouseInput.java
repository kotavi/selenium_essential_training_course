package com.examples.basicwebuiobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardAndMouseInput {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement fullNameField = driver.findElement(By.xpath("//*[@id=\"name\"]"));
//        fullNameField = driver.findElement(By.id("name"));
        WebElement button = driver.findElement(By.id("button"));
//        button = driver.findElement(By.className("btn-primary"));

        fullNameField.sendKeys("Tetiana Korchak");
        button.click();

        driver.quit();
    }
}
