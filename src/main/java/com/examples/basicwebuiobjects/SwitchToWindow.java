package com.examples.basicwebuiobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class SwitchToWindow {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/switch-window");


        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        List<String> listOfWindowIds = new ArrayList<String>();
        String originalHandle = driver.getWindowHandle(); //the handle of the page the webDriver is currently controlling
        for(String handle: driver.getWindowHandles()) { //all the handles for all the pages that the web driver understands are open
            driver.switchTo().window(handle);
            listOfWindowIds.add(handle);
        }

        driver.switchTo().window(listOfWindowIds.get(0));
        Thread.sleep(1000);
        driver.switchTo().window(listOfWindowIds.get(1));
        Thread.sleep(1000);
        driver.switchTo().window(originalHandle);

        System.out.println("Original handle: " + originalHandle);
        System.out.println("First opened window: " + listOfWindowIds.get(0));
        System.out.println("Second opened window: " + listOfWindowIds.get(1));

        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();
    }
}
