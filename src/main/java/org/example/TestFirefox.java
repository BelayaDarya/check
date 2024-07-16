package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefox {
    public static void main(String[] args)
    {
        // Set the path of the geckodriver executable
        System.setProperty(
                "webdriver.gecko.driver",
                "D:/geckodriver-v0.34.0-win-aarch64/geckodriver.exe");

        // Create an instance of FirefoxDriver class
        WebDriver driver = new FirefoxDriver();

        // Navigate to a web page
        driver.get("https://www.google.com/");

        // Find the search box element by its name
        WebElement element
                = driver.findElement(By.name("q"));

        // Enter a search query
        element.sendKeys("GeeksforGeeks");

        // Submit the form
        element.submit();


    }
}