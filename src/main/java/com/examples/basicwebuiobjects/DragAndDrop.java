package com.examples.basicwebuiobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;


public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");

        //Drag 1st control to layout
        String java_script="";
        String text;
        String js_file = "drag_and_drop_helper.js";
        String working_dir = System.getProperty("user.dir");

        BufferedReader input = new BufferedReader(new FileReader(working_dir+"/src/main/java/com/examples/basicwebuiobjects/"+js_file));
        StringBuilder buffer = new StringBuilder();

        while ((text = input.readLine()) != null) {
            buffer.append(text + " ");
        }
        java_script = buffer.toString();
        input.close();

        java_script = java_script+"$('#image').simulateDragDrop({ dropTarget: '#box'});";
        ((JavascriptExecutor)driver).executeScript(java_script);
        Thread.sleep(3000);

        driver.get("http://the-internet.herokuapp.com/drag_and_drop");

        Thread.sleep(3000);
        java_script = java_script+"$('#column-a').simulateDragDrop({ dropTarget: '#column-b'});";
        ((JavascriptExecutor)driver).executeScript(java_script);
        Thread.sleep(3000);

        driver.quit();
    }
}
