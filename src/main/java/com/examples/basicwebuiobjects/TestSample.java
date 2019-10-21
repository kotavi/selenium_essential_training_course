package com.examples.basicwebuiobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample {

    public static void main(String[] args) {

//        System.setProperty("", "");

        WebDriver driver= new ChromeDriver();
        driver.get("http:/ww.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();
        driver.quit();
    }
}
