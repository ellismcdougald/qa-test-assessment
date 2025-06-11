package com.example.testassessment;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;

public class Test6 extends AbstractTest {
  @Test
  /*
   * Tests the value of the table cell at coordinates (2,2).
   */
  public void runTest() {
    driver.get(path);

    WebElement table = driver.findElement(By.cssSelector("#test-6-div .table.table-bordered.table-dark"));
    String cellValue = getCellValue(table, 2, 2);
    Assertions.assertEquals("Ventosanzap", cellValue);
  }

  /*
   * Find the value of a cell in a given table at the given coordinates. Omits
   * headers.
   */
  private String getCellValue(WebElement table, int row, int col) {
    String xpath = String.format(".//tr[%d]/td[%d]", row + 1, col + 1);
    WebElement cell = table.findElement(By.xpath(xpath));
    return cell.getText();
  }
}