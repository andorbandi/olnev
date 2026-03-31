package dev.tanto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Prop {
    public static String getFileName() {
        try {
            return tryGetFileName();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
    
    public static String tryGetFileName() throws IOException {
        Properties prop = new Properties();
        String configFileName = "Program.config";
        InputStream inputStream = new FileInputStream(configFileName);
        prop.load(inputStream);
        return prop.getProperty("Filename");
    }
}
