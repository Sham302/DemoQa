package com.spartaglobal.DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DemoQa {
    private WebDriver driver;

    private String demoQaURL = "https://demoqa.com/";
    private String selectableURL = "https://demoqa.com/selectable/";
    private By selectableID = By.className("ui-widget-content ui-selectee");


    public DemoQa(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHomepage(){
        driver.navigate().to(demoQaURL);
    }

    public void selectableInteraction(){
        driver.navigate().to(selectableURL);
    }

    public void getSelectable(){
//        List<WebElement> selected = driver.findElements(selectableID);
//
//        for (WebElement select: selected){
//            driver.findElement(By.className(select.getAttribute("ui-widget-content ui-selectee"))).click();
//            driver.findElement(By.className(select.getAttribute("ui-widget-content ui-selectee"))).isSelected();
//
//
//        }
        WebElement element = driver.findElement(By.id("sortable"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).release().perform();
    }


}
