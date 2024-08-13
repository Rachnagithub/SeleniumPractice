package Live.TestCases;

import Live.Functions.TNFunctions;
import org.testng.annotations.Test;
import Live.Functions.commonFunctions;

public class TC001_TNLogin {
    commonFunctions cf= new commonFunctions();
    TNFunctions tnf= new TNFunctions();



    @Test

    public void tnLogin() throws Exception{
        cf.initializeDriver();
        cf.openURL("https://tutorialsninja.com/demo/");
        cf.clickmyAccount ();
        tnf.createAccount();

    }



}
