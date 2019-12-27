package com.Odoo_CRM.pages;

import com.Odoo_CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[class='nav navbar-nav navbar-left oe_application_menu_placeholder']>li")
    public List<WebElement> navigationTabs;
    /*
        0. Discuss          6.Website           12.Project
        1. Calendar         7.Point of Sales    13.Events
        2. Notes            8.Purchases         14.Surveys
        3. Contacts         9.Inventory         15.Employees
        4. CRM              10.Manufacturing    16.More
        5. Sales            11.Repairs
     */




}