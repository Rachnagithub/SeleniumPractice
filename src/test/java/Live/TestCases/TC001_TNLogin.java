package Live.TestCases;

import Live.Functions.TNFunctions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Live.Functions.commonFunctions;

public class TC001_TNLogin {
    commonFunctions cf= new commonFunctions();
    TNFunctions tnf= new TNFunctions();
    @BeforeMethod
    public void preCondition(){
        cf.initializeDriver();
        cf.openURL("https://tutorialsninja.com/demo/");
        System.out.println("Precondition is complete");

    }


    @Test

    public void tnLogin() throws Exception{

        cf.clickmyAccount ();
        tnf.createAccount();
        System.out.println("Test case completed ");

    }

   @AfterMethod
    public void post(){
       // cf.quit();

   }


}
