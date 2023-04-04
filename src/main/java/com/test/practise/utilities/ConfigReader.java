package com.test.practise.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties projectProperties = null;

	// To get the data from project.properties file
	public static String getProperties(String key) {
		if (projectProperties == null) {
			try {
				projectProperties = new Properties();
				projectProperties.load(new FileReader("project.properties"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return projectProperties.getProperty(key);
	}

}
