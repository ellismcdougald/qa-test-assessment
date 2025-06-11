package com.example.testassessment;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import java.util.List;

public class Test2 extends AbstractTest {
  @Test
  /*
   * Tests that there are three items in the test-2-div listgroup.
   * Tests that the second list item's value is "List Item 2".
   * Tests that the second list item's badge value is "6".
   */
  public void runTest() {
    driver.get(path);

    List<WebElement> listgroupChildren = driver
        .findElements(By.cssSelector("#test-2-div .list-group .list-group-item"));
    Assertions.assertEquals(listgroupChildren.size(), 3);

    WebElement secondItem = listgroupChildren.get(1);
    WebElement secondItemBadge = secondItem.findElement(By.cssSelector(".badge.badge-pill.badge-primary"));
    // Checking the full text (including the badge) and checking the badge
    // separately ensures that the item value is correct too
    Assertions.assertEquals("List Item 2 6", secondItem.getText());
    Assertions.assertEquals("6", secondItemBadge.getText());
  }
}