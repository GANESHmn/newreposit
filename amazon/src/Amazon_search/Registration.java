package Amazon_search;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class Registration extends amazon_baseclass
{/*
	

	@Test(dataProvider = "inputdata")
	public void registration(String user_name,String Mobile_number,String Email ,String Password) throws IOException, InterruptedException
	{
		driver1=new ChromeDriver();
		driver1.get(Baseurl);
		driver1.manage().window().maximize();		
		registerationpage rp=new registerationpage();
		rp.signinpagefn();
		rp.Createaccountfn();
		rp.register(user_name,Mobile_number,Email,Password);
	}
	

@DataProvider(name="inputdata")
	String [][] getData() throws IOException
	{
	 
		String path=System.getProperty("user.dir")+"/Testdata.xlsx";
		
		int rowcount=Read_Excel.getRowCount(path,"Sheet1");
		int colcount=Read_Excel.getCellcount(path,"Sheet1",rowcount);
		
		String inputdata[][]=new String [rowcount][colcount];
		for(int i=1;i<=rowcount;i++){
	
			for(int j=0;j<colcount;j++)
			{
				inputdata[i-1][j]=Read_Excel.getCelldata(path,"Sheet1",i,j);
			}}
		
	return inputdata;
}*/}
