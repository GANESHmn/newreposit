package com.Athena;


import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Registration extends Athena_Base_Class

{

	@Test(dataProvider = "inputdata")
	
	public void registration(String Lastname,String Firstname,String Sex,String Dob,String phone,String email,String Mstatus,String appt,String provider,String strt_time,String duration) throws InterruptedException, IOException
	{
		
	RegistrationPage rp=new RegistrationPage(driver);
	
	rp.register(Lastname,Firstname,Sex,Dob,phone,email,Mstatus);
	AppointmentPage ap=new AppointmentPage(driver);
	ap.appointment(appt,provider,strt_time, duration);
	
	
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
}}
