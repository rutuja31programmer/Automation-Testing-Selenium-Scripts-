package readPropertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/config.properties");//Provide the path of the file
		
		//To read a property data
		Properties prop = new Properties();
		
		//we need to use this methods
		prop.load(fis);//make the file ready for read
		String data = prop.getProperty("username");//use to read key value from property file (config.properties file)
		System.out.println(data);//print the data key value
	}

}
