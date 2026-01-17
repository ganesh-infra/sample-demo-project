package com.example.sample_project;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleProjectApplicationTests {

    @Test
    public void openBrowserTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080");
        driver.quit();
    }
}
