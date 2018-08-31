package config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;
    private final String propertyFilePath= "/Users/sumit.kumar/lithium/SumitPersonal/src/main/java/config/config.properties";


    public ConfigFileReader(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getDriverPath(){
        String driverPath = properties.getProperty("chromeDriverPath");
        if(driverPath!= null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }

    public String getGmailApplicationUrl() {
        String url = properties.getProperty("gmailApplicationUrl");
        if(url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }

    public String getGmailEmailId() {
        String email = properties.getProperty("gmailLoginEmail");
        if(email != null) return email;
        else throw new RuntimeException("email not specified in the Configuration.properties file.");
    }

    public String getGmailPassword() {
        String pwd = properties.getProperty("gmailLoginPassword");
        if(pwd != null) return pwd;
        else throw new RuntimeException("pwd not specified in the Configuration.properties file.");
    }

}
