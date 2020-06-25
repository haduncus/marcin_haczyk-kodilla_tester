package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Komputer\\Desktop\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        WebElement closePopup = driver.findElement(By.xpath("//button[@class=\"_13q9y _8hkto munh_56_m m7er_k4 m7er_wn m7er_56_m\"]"));
        closePopup.click();

        WebElement filterDropdownToggle = driver.findElement(By.xpath("//*[@class=\"_r65gb mp7g_oh\"]/select"));
        Select selectCategory = new Select(filterDropdownToggle);
        selectCategory.selectByValue("/kategoria/elektronika");

        WebElement searchField = driver.findElement(By.xpath("//div[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/input"));
        searchField.sendKeys("mavic mini");

        WebElement searchButton = driver.findElement(By.xpath("//form[@class=\"_1h7wt _d25db_UtYE1\"]/button"));
        searchButton.click();
    }
}
