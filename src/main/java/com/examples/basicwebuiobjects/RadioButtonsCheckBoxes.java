package com.examples.basicwebuiobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsCheckBoxes {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1 = driver.findElement(By.cssSelector("input[value=option1]"));
        radioButton1.click();
        Thread.sleep(1000);
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value=option2]"));
        radioButton2.click();
        Thread.sleep(1000);
        WebElement radioButton3 = driver.findElement(By.cssSelector("input[value=option3]"));
        radioButton3.click();
        Thread.sleep(1000);


        driver.get("http://formy-project.herokuapp.com/checkbox");
        WebElement checkBox1 = driver.findElement(By.cssSelector("#checkbox-1"));
        checkBox1.click();
        Thread.sleep(1000);
        checkBox1.click();
        Thread.sleep(1000);
        WebElement checkBox2 = driver.findElement(By.cssSelector("#checkbox-2"));
        checkBox2.click();
        Thread.sleep(1000);
        WebElement checkBox3 = driver.findElement(By.cssSelector("#checkbox-3"));
        checkBox3.click();
        Thread.sleep(1000);
        driver.quit();
    }
}
