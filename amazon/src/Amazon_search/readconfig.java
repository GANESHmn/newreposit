package Amazon_search;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readconfig {

	Properties pro;


	public readconfig()
	{
		File src=new File(System.getProperty("user.dir") +"/config.properties");
//System.setProperty("webdriver.gecko.driver", new File(System.getProperty("user.home"), "chromedriver.exe").getAbsolutePath());
		try
		{

			FileInputStream file=new FileInputStream(src);
			pro=new Properties();
			pro.load(file);
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
	}

	public String geturl()
	{
		
		String url=pro.getProperty("URL");
		return url;	
	}
	
	public String username()
	{
		String username=pro.getProperty("USERNAME");	
		return username;
	}

	public String password()
	{
		String password=pro.getProperty("PASSWORD");	
		return password;
	}
}