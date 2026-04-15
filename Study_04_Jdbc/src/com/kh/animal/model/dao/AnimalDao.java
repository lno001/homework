package com.kh.animal.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AnimalDao {
	private Properties prop = new Properties();
	
	public AnimalDao() {
		try {
			prop.loadFromXML(new FileInputStream("src/com/kh/resources/member-mapper.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
