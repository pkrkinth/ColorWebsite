package testCaseUtils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasicActions;

public class OnBoardingDialog extends BasicActions {

    public static void checkOnBoardingDialog() {
        setUp();
        driver.findElement(By.xpath(
                "//div[@class='spectrum-Dialog spectrum-Dialog--centered is-open Base__onBoardingDialog___28hYd']"))
                .isDisplayed();
    }

    public static void checkUIOfOnBoardingDialog(){
        checkOnBoardingDialog();
        WebElement first_element = driver
                .findElement(By.xpath("//span[contains(text(),'Welcome to the new Color experience! We')]"));
        String firstString = first_element.getText();
        System.out.println(firstString);
        Assert.assertEquals(
                "Welcome to the new Color experience! We’ve been hard at work rebuilding and adding some surprises along the way. Create your perfect palette by choosing a base color and applying our Color Rules. Convert your color themes to Pantone swatches, then download them to use in desktop applications.",
                firstString);

        WebElement second_element = driver
                .findElement(By.xpath("//span[contains(text(),'Be sure to check out the new Explore page, where w')]"));
        String secondString = second_element.getText();
        System.out.println(secondString);
        Assert.assertEquals(
                "Be sure to check out the new Explore page, where we pick the best inspiration from across the Adobe Creative world.",
                secondString);

        WebElement third_element = driver
                .findElement(By.xpath("//span[contains(text(),'Your use of the Color service, including your subm')]"));
        String thirdString = third_element.getText();
        System.out.println(thirdString);
        Assert.assertEquals(
                "Your use of the Color service, including your submission of comments, ideas, feature requests and techniques, as well as Adobe’s right to use such materials, is governed by the Adobe Terms of Use.",
                thirdString);
    }

    public static void adobeTermsUrl(){

    }
}
