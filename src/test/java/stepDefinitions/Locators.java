package stepDefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public WebDriver driver;
    public static void main(String[] args) {
        //Auto setup driver
        WebDriverManager.chromedriver().setup();

        //Open browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        String root_folder_path = System.getProperty("user.dir");
        root_folder_path = root_folder_path.replace("\\","/");
        String test_file_path = root_folder_path + "/src/test/resources/simple-landing-page/dist/index.html";

        System.out.println("test_file_path: " + test_file_path);

        String test_page_url = test_file_path;
        //Access URL
        driver.get(test_page_url);

        //Get first sub-title text
        WebElement first_subtitle = driver.findElement(By.className("sub-title"));
        String actual_first_subtitle = first_subtitle.getText();

        //Print subtitle
        System.out.println("actual_first_subtitle: " + actual_first_subtitle);


//        //FIRST CASE: IFRAME
//        //WRONG METHOD
//        //Get first pre-order button text
//        WebElement first_pre_button = driver.findElement(By.id("first-button"));
//        String pre_button_text = first_pre_button.getText();
//
//        //Print button text
//        System.out.println("pre_button_text: " + pre_button_text);
//
//////        CORRECT METHOD
////        //Access first frame
////        driver.switchTo().frame("first-frame");
////        //Get first pre-order button text
////        WebElement first_pre_button = driver.findElement(By.id("first-button"));
////        String pre_button_text = first_pre_button.getText();
////        driver.switchTo().defaultContent();
////
////        //Print button text
////        System.out.println("pre_button_text: " + pre_button_text);


////        SECOND CASE: SHADOW DOM
////        WRONG METHOD
//            WebElement dom_button = driver.findElement(By.id("dom_button"));
//            String dom_button_text = dom_button.getText();
//            System.out.println(dom_button_text);
//
//////            CORRECT METHOD
////        WebElement dom_parent = driver.findElement(By.id("shadow-el"));
////        SearchContext dom_content = dom_parent.getShadowRoot();
////        WebElement dom_button = dom_content.findElement(By.cssSelector("#dom_button"));
////        String dom_button_text = dom_button.getText();
////        System.out.println("dom_button_text: " + dom_button_text);

        driver.close();
        driver.quit();
    }
}
