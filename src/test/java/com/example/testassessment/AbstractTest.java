package com.example.testassessment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class AbstractTest {
  protected WebDriver driver;
  protected String path;
  protected boolean headless = true;

  @BeforeEach
  public void connectBrowser() {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    if (headless) {
      options.addArguments("--headless=new");
    }
    driver = new ChromeDriver(options);

    path = getClass().getClassLoader().getResource("QE-index.html").toString();
  }

  @AfterEach
  public void closeConnection() {
    driver.quit();
  }
}
