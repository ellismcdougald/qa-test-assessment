package com.example.testassessment;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;

public class Test1 extends AbstractTest {
  @Test
  /*
   * Tests that email input, password input, and login button are present.
   * Enters sample email and password into the appropriate fields.
   */
  public void testInputs() {
    driver.get(path);

    WebElement emailInput = driver.findElement(By.id("inputEmail"));
    Assertions.assertTrue(emailInput.isDisplayed());
    WebElement passwordInput = driver.findElement(By.id("inputPassword"));
    Assertions.assertTrue(passwordInput.isDisplayed());
    WebElement loginButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary.btn-block"));
    Assertions.assertTrue(loginButton.isDisplayed());

    String sampleEmail = "test-email@gmail.com";
    String samplePassword = "password@123";
    emailInput.sendKeys(sampleEmail);
    passwordInput.sendKeys(samplePassword);
    Assertions.assertEquals(sampleEmail, emailInput.getAttribute("value"));
    Assertions.assertEquals(samplePassword, passwordInput.getAttribute("value"));
  }
}