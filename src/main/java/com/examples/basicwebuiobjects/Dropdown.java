package com.examples.basicwebuiobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenuButton = driver.findElement(By.cssSelector("#dropdownMenuButton"));
        dropDownMenuButton.click();
        assert driver.findElement(By.cssSelector(".dropdown.show")).isDisplayed();
        Thread.sleep(1500);

        //body > div > div > div > a:nth-child(2)
        WebElement dropDownItemAutoComplete = driver.findElement(By.id("autocomplete"));
        dropDownItemAutoComplete.click();
        driver.navigate().back();
        Thread.sleep(1000);

        dropDownMenuButton = driver.findElement(By.cssSelector("#dropdownMenuButton"));
        dropDownMenuButton.click();

//        //Doesn't work when element is defined like this.
//        //Error: org.openqa.basicwebuiobjects.ElementNotInteractableException: element not interactable
//        WebElement dropDownItemCheckBox = driver.findElement(By.cssSelector("a[href$='checkbox']"));
//        dropDownItemCheckBox.click();

        WebElement dropDownItemCheckBox = driver.findElement(By.linkText("Checkbox"));
        assert dropDownItemCheckBox.isDisplayed();
        System.out.println(dropDownItemCheckBox.getAttribute("href"));
        dropDownItemCheckBox.click();
        assert driver.findElement(By.cssSelector("#checkbox-1")).isDisplayed();
        Thread.sleep(1500);

        driver.quit();
    }
}
