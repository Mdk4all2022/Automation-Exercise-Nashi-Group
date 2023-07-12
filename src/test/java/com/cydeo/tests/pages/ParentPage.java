package com.cydeo.tests.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class ParentPage {

    public ParentPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
