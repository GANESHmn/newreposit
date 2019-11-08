package com.Athena;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class Readconfig {
	
	Properties pro;
	public Readconfig()
	
	{
		
		File src = new File(System.getProperty("user.dir") +"/config.properties");
try
{
	FileInputStream fis=new FileInputStream(src);
	pro = new Properties();
	pro.load(fis);
	
}catch(Exception e)
{
	System.out.println(e.getMessage());
}
}

public String getURL(){
	
	String url=pro.getProperty("URL");
	return url;
	
}
public String getEnvironment(){
	
	String Environment=pro.getProperty("Environment");
	return Environment;
	
}

public String getUsername() {
	String Username=pro.getProperty("username");
	return Username;
}
public String getPassword() {
	String password=pro.getProperty("password");
	return password;
}
public String getLastName() {
	String LastName=pro.getProperty("LastName");
	return LastName;

}
public String getFirstName() {
	String FirstName=pro.getProperty("FirstName");
	return FirstName;

}
public String getDOB() {
	String DOB=pro.getProperty("DOB");
	return DOB;

}
public String getPhone() {
	String Phone=pro.getProperty("Phone");
	return Phone;

}
public String getEmail() {
	String Email=pro.getProperty("Email");
	return Email;

}
public String getStart_Time() {
	String Start_Time=pro.getProperty("Start_time");
	return Start_Time;

}
public String getDuration() {
	String Duration=pro.getProperty("Duration");
	return Duration;

}
public String getQACron() {
	String QACron=pro.getProperty("qa_cron");
	return QACron;

}
public String getPdevCron() {
	String PdevCron=pro.getProperty("pdev_cron");
	return PdevCron;

}
public String getStagingCron() {
	String StagingCron=pro.getProperty("staging_cron");
	return StagingCron;

}
}
