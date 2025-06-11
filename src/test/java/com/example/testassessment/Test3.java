package com.example.testassessment;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;

public class Test3 extends AbstractTest {
  @Test
  /*
   * Tests that "Option 1" is the default selected value.
   * Selects "Option 3" from the list and verifies that the selection is reflected
   * by the button.
   */
  public void runTest() {
    driver.get(path);

    // Check that default value is "Option 1"
    WebElement dropdownButton = driver.findElement(By.cssSelector("#test-3-div #dropdownMenuButton"));
    Assertions.assertEquals("Option 1", dropdownButton.getText());

    // Select "Option 3"
    dropdownButton.click();
    WebElement optionItem3 = driver.findElement(By.xpath("//a[@class='dropdown-item' and text()='Option 3']"));
    optionItem3.click();

    // Check that value has updated
    Assertions.assertEquals("Option 3", dropdownButton.getText());
  }
}