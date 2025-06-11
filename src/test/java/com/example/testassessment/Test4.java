package com.example.testassessment;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;

public class Test4 extends AbstractTest {
  @Test
  /*
   * Verifies that the first button is enabled and that the second button is
   * disabled.
   */
  public void runTest() {
    driver.get(path);

    WebElement firstButton = driver.findElement(By.cssSelector("#test-4-div .btn.btn-lg.btn-primary"));
    WebElement secondButton = driver.findElement(By.cssSelector("#test-4-div .btn.btn-lg.btn-secondary"));

    Assertions.assertTrue(firstButton.isEnabled());
    Assertions.assertFalse(secondButton.isEnabled());

  }
}