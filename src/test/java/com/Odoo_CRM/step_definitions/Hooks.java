package com.Odoo_CRM.step_definitions;



import com.Odoo_CRM.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

//    @Before
//    public void setUp() {
//       // System.out.println("\nThis is coming from before scenario");
//    }

    @After
    public void tearDown() {
        //System.out.println("This is coming from after scenario\n");
        Driver.closeDriver();
    }



    }
