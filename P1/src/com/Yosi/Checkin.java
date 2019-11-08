package com.Yosi;

import org.testng.annotations.Test;

public class Checkin extends Yosi_Base_Class {
	
	@Test
	public void checkin() throws InterruptedException
	{
		Verification_Page vp=new Verification_Page(driver);
		vp.set_Verification_Page();
		Patient_Info_Page2 pp=new Patient_Info_Page2(driver);
		pp.Set_Patient_Info_Page();
		Financial_Responsibility_Page fp=new Financial_Responsibility_Page(driver);
		fp.set_Financial_Responsibility_Page();
		Insurance_Information_Page ip=new Insurance_Information_Page(driver);
		ip.set_insurance_Info_Page();
		Additional_Info_Page aip=new Additional_Info_Page(driver);
		aip.Set_Additional_info_Page();
		Emergency_Contact_Page ecp=new Emergency_Contact_Page(driver);
		ecp.set_Emergency_Contact_Page();
		Patient_LifeStyle_Page plp=new Patient_LifeStyle_Page(driver);
		plp.Set_Lifestyle_page();
		Past_Medicat_Hist_Page pmp=new Past_Medicat_Hist_Page(driver);
		pmp.set_Medical_Hist_Page();
		
		Patient_RX_Info_Page prp=new Patient_RX_Info_Page(driver);
		prp.Set_RX_info_Page();
		ROS_Page ros=new ROS_Page(driver);
		ros.set_ROS_Page();
		Patient_Authorization_Page pap=new Patient_Authorization_Page(driver);
		pap.set_Patient_Authorization_Page();
		HIPAA_Page hp=new HIPAA_Page(driver);
		hp.set_HIPAA_Page();
		Refferal_Page rep=new Refferal_Page(driver);
		rep.set_Refferal_Page();
	}

}
