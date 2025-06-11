package com.example.testassessment;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Test5 extends AbstractTest {
  @Test
  /*
   * Waits up to 30 seconds for the button to be displayed and then clicks it.
   * Verifies that a success message is displayed and that the button is now
   * disabled.
   */
  public void runTest() {
    driver.get(path);

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // I assume the wait won't be more than 30s
    WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("test5-button")));
    button.click();

    WebElement successAlert = driver.findElement(By.id("test5-alert"));
    Assertions.assertTrue(successAlert.isDisplayed());

    Assertions.assertFalse(button.isEnabled());
  }
}