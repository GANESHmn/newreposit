package Amazon_search;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class search_page {
	
	
	public WebDriver ldriver;
	public search_page(WebDriver rdriver) throws IOException
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"enterAddressStateOrRegion\"]")
	@CacheLookup
    public WebElement statetxt;

	@FindBy(how = How.XPATH, using= "//*[@id=\"enterAddressPostalCode\"]")
	@CacheLookup
    public WebElement pincodetxt;
	@FindBy(how = How.XPATH, using= "//*[@id=\"enterAddressAddressLine1\"]")
	@CacheLookup
	public WebElement Flattxt;
	@FindBy(how = How.XPATH, using= "//*[@id=\"enterAddressCity\"]")
	@CacheLookup
	public WebElement Citytxt;
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"enterAddressAddressLine2\"]")
	@CacheLookup
    public WebElement address2txt;
		
	@FindBy(how = How.XPATH, using= "//*[@id=\"twotabsearchtextbox\"]")
	@CacheLookup
    private WebElement searchbox;
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"nav-search\"]/form/div[2]/div")
	@CacheLookup
    private WebElement searchclick;
	
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"buyBoxAccordion\"]")
	@CacheLookup
    private WebElement addtocartclass;
	
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"add-to-cart-button\"]")
	@CacheLookup
    private WebElement addtocart;

	@FindBy(how = How.XPATH, using= "//*[@id=\"hlb-ptc-btn\"]")
	@CacheLookup
    private WebElement proceedtobuyclk;
	
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"search\"]/div[1]/div[2]/div")
	@CacheLookup
    private WebElement findproduct_phone;
	

	@FindBy(how = How.XPATH, using= "//*[@id=\"shippingOptionFormId\"]/div[1]/div[2]/div/span[1]\r\n")
	@CacheLookup
    private WebElement shippingclik;
	
	
	public void searchbx(String sepro)
	{
		searchbox.sendKeys(sepro);
	}
	
	public void searchclk()
	{
		searchclick.click();
	}
	
	public void autosuggestion() throws InterruptedException
	{
		
		List<WebElement> rows = findproduct_phone.findElements(By.tagName("span"));                          			
        Iterator<WebElement> i = rows.iterator();                        			
        while(i.hasNext()) {                        			
        WebElement row = i.next();                        			
        System.out.println(row.getText());      
        
        if(row.getText().equalsIgnoreCase("Samsung Galaxy S10 (White, 8GB RAM, 512GB Storage) with No Cost EMI/Additional Exchange Offers"))                        			
        {                        			
         System.out.println("Clicked on:"+ row.getText());                        			
         row.click();                          			
         break;                        			
        }
        } 
        }
	
	public void addtocartclk() throws InterruptedException 
	{
		Set<String> ids = ldriver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        ldriver.switchTo().window(childId);
        Thread.sleep(5000);
        WebElement wb=ldriver.findElement(By.xpath("//*[@id=\"buyBoxAccordion\"]"));
      	WebElement wbs=wb.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
      	//*[@id="quantity"]
		WebDriverWait wait = new WebDriverWait(ldriver,30);		 
	    wait.until(ExpectedConditions.visibilityOf(wbs));
      	wbs.click();
      //  addtocart.click();
     }   
	
	
	public void proceedtobuy() throws InterruptedException  
	{
		Set<String> ids = ldriver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        ldriver.switchTo().window(childId);
        Thread.sleep(5000);
    //ldriver.findElement(By.xpath("Proceed to Buy")).click(); 
        WebElement wb=ldriver.findElement(By.xpath("//*[@id=\"huc-v2-order-row-with-divider\"]"));
      	WebElement wbs=wb.findElement(By.xpath("//*[@id=\"hlb-ptc-btn\"]"));
      	  
    //*[@id="quantity"]
		WebDriverWait wait = new WebDriverWait(ldriver,30);		 
	    wait.until(ExpectedConditions.visibilityOf(wbs));
      	wbs.click();
	//proceedtobuyclk.click();
	
     }
	public void pincodefn(String sepro1)
	{
		pincodetxt.sendKeys(sepro1);
	}
	public void flatfn(String sepro2)
	{
		Flattxt.sendKeys(sepro2);
	}
	public void cityfn(String sepro3) throws InterruptedException
	{
		Thread.sleep(3000);
		Citytxt.clear();
		Citytxt.sendKeys(sepro3);
	}
	public void address2fn(String sepro4)
	{
		address2txt.sendKeys(sepro4);
	}
	public void statefn(String sepro5)
	{
	//	statetxt.clear();
	//	statetxt.sendKeys(sepro5);
	}	
	public void shippingaddress() throws InterruptedException  
	{
		Thread.sleep(5000);		
		Set<String> ids = ldriver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        ldriver.switchTo().window(childId);
        Thread.sleep(5000);
        /*JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollBy(0,1000)");
        */
     //   WebElement wbs=ldriver.findElement(By.xpath("a-form-actions"));
		WebElement wb=ldriver.findElement(By.xpath("//*[@id=\"newShippingAddressFormFromIdentity\"]/div[1]/div[1]/form/div[6]/span"));
		 
		 for(int i=1;i<2;i++)
			 {
			 wb.click();
			 }
		 }
	public void shippingfn()
	{
		
		shippingclik.click();
	}
	
	
    }