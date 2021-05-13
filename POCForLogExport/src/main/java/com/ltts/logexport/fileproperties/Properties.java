package com.ltts.logexport.fileproperties;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@PropertySource("classpath:myProperties.properties")
public class Properties {

	
	@Value("${p.zipFilepath}")
	private String zipFilepath;
	
	@Value("${p.logFilepath}")
	private String myFolder;

	public String getZipFilepath() {
		return zipFilepath;
	}

	public String getFolder() {
		return myFolder;
	}

	public void setFolder(String folder) {
		myFolder = folder;
	}

	public void setZipFilepath(String zipFilepath) {
		this.zipFilepath = zipFilepath;
	}

	

	
	
	
	
   
} 