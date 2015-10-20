package com.di.vendor;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MybatisGenerator {

	static final String CONFIG_XML = "/home/hyun/Program/sts/workspace/crm/src/main/resources/com/di/vendor/mybatis/generatorConfig.xml";
	
	public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException {
		
		List<String> warnings = new ArrayList<String>();
		   boolean overwrite = true;
		   
		   File configFile = new File(CONFIG_XML);
		   ConfigurationParser cp = new ConfigurationParser(warnings);
		   Configuration config = cp.parseConfiguration(configFile);
		   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		   
		   try {
			   myBatisGenerator.generate(null);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
