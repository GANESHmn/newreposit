package Amazon_search;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class loginpage_TC1 extends amazon_baseclass{
	
	
	@Test
	public void login() throws IOException {
		
		driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get(Baseurl);
		
		Login_page lp=new Login_page(driver1);
		lp.hellosignup();
		lp.txtusername(username);
		lp.unsubmitbtn();
		lp.setpassword(password);
		lp.pwsubmitbtn();
		
	}

}
