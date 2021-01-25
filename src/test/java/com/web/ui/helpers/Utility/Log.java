package com.web.ui.helpers.Utility;


import org.apache.log4j.Logger;

public class Log {

    private static Logger Log = Logger.getLogger(com.web.ui.helpers.Utility.Log.class.getName());

    public static void startTestCase(String sTestCaseName) {
        Log.info("Started Test case");
    }


    public static void endTestCase(String sTestCaseName) {
        Log.info("Ended Test Case");
    }

    public static void info(String message) {
        Log.info(message);
    }
}
