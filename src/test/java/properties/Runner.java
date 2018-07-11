package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Runner {
	
	private static Properties prop;
	static {
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream("automation.properties");
			prop.load(fis);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	
	public static String getMyValue(String key) {

		String value = prop.getProperty(key);

		return value;
	}

}
