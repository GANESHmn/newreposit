//Check create a new account button
package Amazon_search;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.io.IOException;
	public class Signup_TC1 extends amazon_baseclass
	{
		@Test
		public void SignupTest() throws IOException, InterruptedException 
		    {
			driver1=new ChromeDriver();
			driver1.manage().window().maximize();
			driver1.get(Baseurl);	
			Login_page lp=new Login_page(driver1);
			lp.hellosignup();
			lp.Createaccountfn();
			Thread.sleep(3000);
		    }
				
		@Test(dataProvider = "inputdata")
			 public void register(String user_name,String Mobile_number,String Email ,String Password) throws IOException
			 {  
		     	System.out.print("test");
			    Login_page lp=new Login_page(driver1);
				lp.register(user_name,Mobile_number,Email,Password);				
			 }
					
		@DataProvider(name="inputdata")
			String [][] getData() throws IOException
			{
			 	String path=System.getProperty("user.dir")+"/test-output/Testdata.xlsx";
				System.out.println("testing");
			    int rowcount=Read_Excel.getRowCount(path,"Sheet1");
				System.out.print("rowcount"+rowcount);
				int colcount=Read_Excel.getCellcount(path,"Sheet1",rowcount);
				System.out.print("colcount"+colcount);
				String inputdata[][]=new String [rowcount][colcount];
				for(int i=1;i<=rowcount;i++)
				{
			
					for(int j=0;j<colcount;j++)
					{
						inputdata[i-1][j]=Read_Excel.getCelldata(path,"Sheet1",i,j);
					}
			    }
				
			return inputdata;
		   }
	}
	
