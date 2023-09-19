package com.shoppers.qsp.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtlity {

	public String readTheDataFromPropertyFile(String key) throws IOException {
		FileInputStream file = new FileInputStream("./src/test/resources/commondata.properties");
	    Properties pobj = new Properties();
	    pobj.load(file);
	    String value = pobj.getProperty(key);
	    return value;
}
}