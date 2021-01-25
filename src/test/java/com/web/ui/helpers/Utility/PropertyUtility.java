package com.web.ui.helpers.Utility;

import org.testng.Reporter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtility {

    public PropertyUtility() {
    }

        public Properties loadProperty(String file){
            ClassLoader classLoader = this.getClass().getClassLoader();
            InputStream in = classLoader.getResourceAsStream(file);
            Properties props = new Properties();

            try{
                props.load(in);
            }
            catch (IOException e) {
                Reporter.log(String.format("could not load properties %s",file));
            }
        return props;
    }
}
