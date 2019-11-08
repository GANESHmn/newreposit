package com.Athena;

import java.io.IOException;

import org.testng.annotations.Test;



public class getdata {

	
	
	@Test
	static String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/Testdata.xlsx";
		int rownum=Read_Excel.getRowCount(path,"Sheet1");
		int colcount=Read_Excel.getCellcount(path,"Sheet1",1);
		String inputdata[][]=new String [rownum][colcount];
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				inputdata[i-1][j]=Read_Excel.getCelldata(path,"Sheet1",i,j);
			}
		}
	return inputdata;
}}
