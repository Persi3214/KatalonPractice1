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
    public static Object URL_Katalon_Demo
     
    /**
     * <p></p>
     */
    public static Object FileDownloadCheckingURL
     
    /**
     * <p></p>
     */
    public static Object Dropdown_Html_path
     
    /**
     * <p></p>
     */
    public static Object Alerts_Html_path
     
    /**
     * <p></p>
     */
    public static Object Alert2_Html_Path
     
    /**
     * <p></p>
     */
    public static Object Frames_Html_Path
     
    /**
     * <p></p>
     */
    public static Object MultiSelection_dropDown_Html_Path
     
    /**
     * <p></p>
     */
    public static Object UploadFile_Html_Path
     
    /**
     * <p></p>
     */
    public static Object WebTable1_Html_Path
     
    /**
     * <p></p>
     */
    public static Object WebTable2_Html_Path
     
    /**
     * <p></p>
     */
    public static Object Image_Upload_Path
     
    /**
     * <p></p>
     */
    public static Object URL_Iframe
     
    /**
     * <p></p>
     */
    public static Object URL_WindowHandeling
     
    /**
     * <p></p>
     */
    public static Object Excel_TestData_Path
     
    /**
     * <p></p>
     */
    public static Object CSV_TestData_Path
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            URL_Katalon_Demo = selectedVariables['URL_Katalon_Demo']
            FileDownloadCheckingURL = selectedVariables['FileDownloadCheckingURL']
            Dropdown_Html_path = selectedVariables['Dropdown_Html_path']
            Alerts_Html_path = selectedVariables['Alerts_Html_path']
            Alert2_Html_Path = selectedVariables['Alert2_Html_Path']
            Frames_Html_Path = selectedVariables['Frames_Html_Path']
            MultiSelection_dropDown_Html_Path = selectedVariables['MultiSelection_dropDown_Html_Path']
            UploadFile_Html_Path = selectedVariables['UploadFile_Html_Path']
            WebTable1_Html_Path = selectedVariables['WebTable1_Html_Path']
            WebTable2_Html_Path = selectedVariables['WebTable2_Html_Path']
            Image_Upload_Path = selectedVariables['Image_Upload_Path']
            URL_Iframe = selectedVariables['URL_Iframe']
            URL_WindowHandeling = selectedVariables['URL_WindowHandeling']
            Excel_TestData_Path = selectedVariables['Excel_TestData_Path']
            CSV_TestData_Path = selectedVariables['CSV_TestData_Path']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
