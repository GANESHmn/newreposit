package Amazon_search;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class search_TC1  extends amazon_baseclass{
	
	@Test
	public void search_product() throws IOException, InterruptedException {
		
		driver1=new ChromeDriver();
		driver1.get(Baseurl);
		driver1.manage().window().maximize();
		Login_page lp=new Login_page(driver1);
		lp.hellosignup();
		lp.txtusername(username);
		lp.unsubmitbtn();
		lp.setpassword(password);
		lp.pwsubmitbtn();
		search_page sp=new search_page(driver1);
		sp.searchbx(Searchproduct);
        sp.searchclk();
        sp.autosuggestion();
        sp.addtocartclk();
        sp.proceedtobuy();
        sp.pincodefn(pincode);
        sp.flatfn(address1);        
        sp.address2fn(address2);    
        sp.cityfn(city);
        sp.statefn(state);
        sp.shippingaddress();   
        sp.shippingfn();
        }
	}
