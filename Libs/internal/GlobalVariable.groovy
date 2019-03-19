package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object authorization
     
    /**
     * <p></p>
     */
    public static Object issue_key
     
    /**
     * <p></p>
     */
    public static Object update_issue_key
     
    /**
     * <p></p>
     */
    public static Object latest_response
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            authorization = selectedVariables['authorization']
            issue_key = selectedVariables['issue_key']
            update_issue_key = selectedVariables['update_issue_key']
            latest_response = selectedVariables['latest_response']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
