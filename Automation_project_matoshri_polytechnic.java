package sel_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Automation_project_matoshri_polytechnic {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Desktop\\EB\\selenium app\\chromedriver_win32\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		
		w.get("http://mapoly.co.in");
		
		//-----------------To Maximize Window------------------------
		w.manage().window().maximize();
		
		
		//w.findElement(By.linkText("Home")).click();
		Thread.sleep(2000);
		
		//---------------info frame------------------------------
		
		w.findElement(By.name("your-name")).sendKeys("Nisha Patil");
		w.findElement(By.name("email")).sendKeys("nisha@gmail.com");
		w.findElement(By.name("phone")).sendKeys("8423456785");
		
		Select s=new Select(w.findElement(By.name("course")));
		s.selectByIndex(3);
		
		w.findElement(By.name("query")).sendKeys("Inquiry");
		w.findElement(By.xpath("//*[@id=\"wpcf7-f2199-o1\"]/form/p[6]/input")).click();
		System.out.println("Your Information of Home Page Has Been Succesfully Sent");
		
		//--------------To close Information frame------------------------
		w.findElement(By.xpath("//*[@id=\"wpcs_close_slider_2198\"]/img")).click();w.navigate().back(); 
		//--------------- info frame closed-------------------------------
		
		
		//==========================About Us============================================
		Actions a1=new Actions(w);
		
		a1.moveToElement(w.findElement(By.linkText("About Us"))).perform(); //Parent Button
		w.findElement(By.xpath("//*[@id=\"menu-item-1119\"]/a")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		a1.moveToElement(w.findElement(By.linkText("About Us"))).build().perform();	
		Thread.sleep(2000);  //Parent Button
		w.findElement(By.xpath("//*[@id=\"menu-item-493\"]/a")).click();
		w.navigate().back();
		
		a1.moveToElement(w.findElement(By.linkText("About Us"))).perform();
		Thread.sleep(2000);//Parent Button
		w.findElement(By.xpath("//*[@id=\"menu-item-443\"]/a")).click();
		w.navigate().back();
		
		a1.moveToElement(w.findElement(By.linkText("About Us"))).perform(); //Parent Button
		w.findElement(By.linkText("Principal Desk")).click();
		Thread.sleep(2000);
		w.navigate().back();
	
		a1.moveToElement(w.findElement(By.linkText("About Us"))).perform(); //Parent Button
		w.findElement(By.linkText("Governing Body")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
		a1.moveToElement(w.findElement(By.linkText("About Us"))).perform(); //Parent Button
		w.findElement(By.linkText("Mandatory Disclosure")).click();
		Thread.sleep(2000);
		w.navigate().back();
		 
		//==============================Department========================================
		 
		Actions a2=new Actions(w);
			
		a2.moveToElement(w.findElement(By.linkText("Department"))).perform(); //Parent Button
		w.findElement(By.linkText("Applied Science")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
		a2.moveToElement(w.findElement(By.linkText("Department"))).perform(); //Parent Button
		w.findElement(By.linkText("Automobile Engineering")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
		a2.moveToElement(w.findElement(By.linkText("Department"))).perform(); //Parent Button
		w.findElement(By.linkText("Civil Engineering")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
		a2.moveToElement(w.findElement(By.linkText("Department"))).perform(); //Parent Button
		w.findElement(By.linkText("Computer Engineering")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
		a2.moveToElement(w.findElement(By.linkText("Department"))).perform(); //Parent Button
		w.findElement(By.linkText("Electronics & Telecommunication")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
		a2.moveToElement(w.findElement(By.linkText("Department"))).perform(); //Parent Button
		w.findElement(By.linkText("Electrical Engineering")).click();
		Thread.sleep(2000);
		w.navigate().back();
			

		a2.moveToElement(w.findElement(By.linkText("Department"))).perform(); //Parent Button
		w.findElement(By.linkText("Information Technology")).click();
		Thread.sleep(2000);
		w.navigate().back();
			
		a2.moveToElement(w.findElement(By.linkText("Department"))).perform(); //Parent Button
		w.findElement(By.linkText("Mechanical Engineering")).click();
		Thread.sleep(2000);
		w.navigate().back();       
		
		//==================================Academics====================================================
		
		Actions a3=new Actions(w);
		
		a3.moveToElement(w.findElement(By.linkText("Academics"))).perform(); //Parent Button
		w.findElement(By.linkText("MSBTE Academic Calendar")).click();
		
		JavascriptExecutor js= (JavascriptExecutor) w;
		Thread.sleep(2000);
			
		//js.executeScript("window.scrollBy(0,300)", "");
		js.executeScript("window.scrollBy(0,150)");
		js.executeScript("window.scrollBy(0,350)");
		
		Thread.sleep(5000);
		w.navigate().back();
		
					
		a3.moveToElement(w.findElement(By.linkText("Academics"))).perform(); //Parent Button
		w.findElement(By.linkText("Institude Academics Calender")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
		a3.moveToElement(w.findElement(By.linkText("Academics"))).perform(); //Parent Button
		w.findElement(By.linkText("Exam Rules And Regulation")).click();
		Thread.sleep(2000);
		w.navigate().back();
	
		a3.moveToElement(w.findElement(By.linkText("Academics"))).perform(); //Parent Button
		w.findElement(By.linkText("Achievements")).click();
		Thread.sleep(2000);
		w.navigate().back();
	
		a3.moveToElement(w.findElement(By.linkText("Academics"))).perform(); //Parent Button
		w.findElement(By.linkText("Institute Toppers")).click();
		Thread.sleep(2000);
		w.navigate().back();   
		
		//=======================Placements================================
			
		Actions a4=new Actions(w);
		
		a4.moveToElement(w.findElement(By.linkText("Placements"))).perform(); //Parent Button
		w.findElement(By.xpath("//a[contains(text(),'Placement overview')]")).click();
		Thread.sleep(2000);
		w.navigate().back();
			
		a4.moveToElement(w.findElement(By.linkText("Placements"))).perform(); //Parent Button
		w.findElement(By.xpath("//a[contains(text(),'Job Openings')]")).click();      //Job Openings
		w.findElement(By.name("Name")).sendKeys("Ram Patil");
		w.findElement(By.name("email")).sendKeys("ram@gmail.com");
		w.findElement(By.name("mobile")).sendKeys("9494949494");		
		w.findElement(By.name("your-message")).sendKeys("Overview of placement records");
		w.findElement(By.xpath("//*[@id=\"wpcf7-f2321-p372-o1\"]/form/p[5]/input")).click();
		System.out.println("Your Information For Placement Is Successfully Sent....");
		
		Thread.sleep(2000);
		w.navigate().back();
		
		a4.moveToElement(w.findElement(By.linkText("Placements"))).perform(); //Parent Button
		w.findElement(By.xpath(" //a[contains(text(),'Our recruiters')]")).click();
		Thread.sleep(2000);
		//	w.navigate().back();  
			
		//======================Student Corner================================
			
		Actions A14=new Actions(w);
		A14.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-1840\"]/a"))).perform();
		w.findElement(By.linkText("Scholarship")).click();
		Thread.sleep(2000);
		w.navigate().back();
		 
			 
		A14.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-1840\"]/a"))).perform();
		w.findElement(By.xpath("//*[@id=\"menu-item-500\"]/a")).click();    //Bus
		Thread.sleep(2000);
		w.navigate().back();
			 
		A14.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-1840\"]/a"))).perform();
		w.findElement(By.linkText("Syllabus")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
		//=====================Library======================================
		Actions A13=new Actions(w);
		A13.moveToElement(w.findElement(By.linkText("Library"))).perform();
		w.findElement(By.linkText("About Library")).click();
		Thread.sleep(2000);
		w.navigate().back();
		A13.moveToElement(w.findElement(By.linkText("Library"))).perform();
		w.findElement(By.linkText("Book")).click();
		Thread.sleep(2000);
		w.navigate().back();
		A13.moveToElement(w.findElement(By.linkText("Library"))).perform();
		w.findElement(By.linkText("DELNET")).click();
		Thread.sleep(2000);
		w.navigate().back();
		A13.moveToElement(w.findElement(By.linkText("Library"))).perform();
		w.findElement(By.linkText("Journals & Magazines")).click();
		Thread.sleep(2000);
		w.navigate().back();
		A13.moveToElement(w.findElement(By.linkText("Library"))).perform();
		w.findElement(By.linkText("Rules & Regulation")).click();
		Thread.sleep(2000);
		w.navigate().back();    
		A13.moveToElement(w.findElement(By.linkText("Library"))).perform();
		w.findElement(By.linkText("Faculty")).click();
		Thread.sleep(2000);
		w.navigate().back();  
		
		//=====================Alumni==================================
		Actions A12=new Actions(w);
		A12.moveToElement(w.findElement(By.linkText("Alumni"))).perform();
		w.findElement(By.linkText("Alumni Registration")).click();
		Thread.sleep(2000); 
		 
		//------------------------Alumni Registration--------------------
			 
		w.findElement(By.name("your_name")).sendKeys("Vibha");                              
		w.findElement(By.name("father_name")).sendKeys("SUresh");
		w.findElement(By.name("birth_date")).sendKeys("24/01/1999");
		w.findElement(By.xpath("//*[@id=\"wpcf7-f1052-p435-o1\"]/form/div[2]/div[4]/span/span/span[2]/input")).click();
		w.findElement(By.name("degree")).sendKeys("BE");
		w.findElement(By.name("branch")).sendKeys("Information Technology");
		w.findElement(By.name("pass_year")).sendKeys("2019");
		w.findElement(By.name("marital_status")).sendKeys("Unmarried");
		w.findElement(By.name("telephone_no")).sendKeys("8484848484");
		w.findElement(By.name("mobile_number")).sendKeys("8484848484");
		w.findElement(By.name("email")).sendKeys("vibha@gmail.com");
		w.findElement(By.name("current_address")).sendKeys("Nashik");
		w.findElement(By.name("permanent_address")).sendKeys("Nashik");
		 
		//----------------------Details For Higher Studies--------------
			 
		w.findElement(By.name("course_name")).sendKeys("M.Tech");
		w.findElement(By.name("specialization")).sendKeys("IT");
		w.findElement(By.name("university")).sendKeys("Savitribai Phule Pune Univercity");
		w.findElement(By.name("address")).sendKeys("Pune");
		
		//--------------------Work Information---------------------------
		w.findElement(By.name("employee")).sendKeys("Vibha");
		w.findElement(By.name("job_designation")).sendKeys("Software Tester");
		w.findElement(By.name("office_number")).sendKeys("02253-224865");
		w.findElement(By.name("official_email")).sendKeys("vibhaindiabletechnology@gmail.com");
		w.findElement(By.name("field_work")).sendKeys("Tester");
		 
		//--------------------Details of Enterprionership-----------------
		 
		w.findElement(By.name("org_name")).sendKeys("Sai InfoTech");
		w.findElement(By.name("org_address")).sendKeys("Nashik");
		w.findElement(By.name("service_offered")).sendKeys("Testing Websites");
		w.findElement(By.name("suggestion")).sendKeys("Nothing");
		w.findElement(By.xpath("//*[@id=\"wpcf7-f1052-p435-o1\"]/form/div[2]/div[25]/p/input")).click();
		
			 
		System.out.println("Thank You For Message,It has been Sent of Alumni Page");  
		
		w.navigate().to("http://mapoly.co.in/placements/our-recruiters");     
			 
		//==============================================Event===================================================
			 
		w.findElement(By.linkText("Event")).click();
			 
		w.findElement(By.linkText("Our Institude")).click();
		w.navigate().back();
		w.findElement(By.xpath("//*[@id=\"list-12\"]/ul/li[2]/a")).click();
		// w.navigate().back();
		w.findElement(By.xpath("//*[@id=\"list-12\"]/ul/li[3]/a")).click();
		// w.navigate().back();
		w.findElement(By.xpath("//*[@id=\"list-12\"]/ul/li[4]/a")).click();
		// w.navigate().back();
		w.findElement(By.xpath("//*[@id=\"list-12\"]/ul/li[5]/a")).click();
		w.navigate().back(); 
		
		//-----------------------List Of Textboxes-------------------------
		List<WebElement> C1 = w.findElements(By.tagName("a"));
		System.out.println("Total Links are = "+ C1.size());
		 
		//===================================Downloads=================================================
		Actions A11=new Actions(w);
		A11.moveToElement(w.findElement(By.linkText("Downloads"))).perform();
		w.findElement(By.linkText("Committee Letters")).click();
		w.navigate().back();
		A11.moveToElement(w.findElement(By.linkText("Downloads"))).perform();
		w.findElement(By.linkText("Certificate Section")).click();
		w.navigate().to("http://mapoly.co.in/placements/our-recruiters"); 
		 
		//========================Contact================================
				 
		w.findElement(By.linkText("Contact Us")).click();
		w.findElement(By.xpath("//*[@id=\"wpcf7-f134-p131-o1\"]/form/p[1]/label/span/input")).sendKeys("vibha");
		w.findElement(By.name("your-email")).sendKeys("vibha@gmail.com");
		w.findElement(By.name("your-subject")).sendKeys("Information Technology");
		w.findElement(By.name("your-message")).sendKeys("Inquiry Regarding Admisiion");
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/form[1]/p[4]/input[1]")).click();
				
		//=========================List Of Text boxes=======================
		List<WebElement> C = w.findElements(By.tagName("label"));
		System.out.println("Total Textboxes are = "+ C.size());
		System.out.println("Thank You For The Information of Contact Us Page.It HAs Been Sent");
		w.navigate().to("http://mapoly.co.in/placements/our-recruiters");
	
	}
}
