package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class property {
	
	public String login(String orange) throws Throwable {
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\orangelogin.txt");
		
		Properties po = new Properties();
		
		po.load(fis);
		
	String st =	po.getProperty(orange);
	return st;
		
		
	}

}
