package testCaseUtils;

import org.openqa.selenium.By;
import utils.BasicActions;

public class ColorWebsite extends BasicActions {

    public static void openColorWebsite() {
        setUp();
        driver.findElement(By.xpath("//div[@class='spectrum-Dialog spectrum-Dialog--centered is-open Base__onBoardingDialog___28hYd']")).isDisplayed();
        driver.findElement(By.xpath("//*[@id='S_Close_18_N_2x']")).click();
        tearDown();
    }
}
