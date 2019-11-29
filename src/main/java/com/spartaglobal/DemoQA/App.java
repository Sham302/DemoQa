package com.spartaglobal.DemoQA;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shmaila Rehman\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        DemoQa demoQa = new DemoQa(driver);
        demoQa.goToHomepage();
        demoQa.selectableInteraction();
        demoQa.getSelectable();

    }
}
