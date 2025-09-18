package com.transmuda.pages;

import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainModulesPage extends BasePage {



    public MainModulesPage() {
        PageFactory.initElements(Driver.getDriver(),  this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public List<WebElement> menuOptions;

    public List<String> getMenuOptions(){
        List<String> menuNames = new ArrayList<>();
        for (WebElement each : menuOptions) {
            menuNames.add(each.getText().trim());
        }
        return menuNames;

//        for (WebElement option : menuOptions) {
//            BrowserUtils.waitForInvisibilityOf(option);
//        }
//
//        return super.menuOptions.stream()
//                .map(WebElement::getText)
//                .map(String::trim)
//                .collect(Collectors.toList());
    }

//span[@class='title title-level-1']

}
