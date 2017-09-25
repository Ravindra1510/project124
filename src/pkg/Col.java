package pkg;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.worker.Worker;

public class Col {
	public static void main(String[] args) throws AWTException, InterruptedException, FileNotFoundException, IOException {
		WebDriver driver= new FirefoxDriver();
		FluentWait ff= new FluentWait(driver);
		ff.withTimeout(50, TimeUnit.SECONDS);
		ff.pollingEvery(250, TimeUnit.MILLISECONDS);
		ff.ignoring(NoSuchElementException.class);
		Connection dddd = DriverManager.getConnection("sdfsdf","sdsdf","sdfsdf");
		ResultSet sp = dddd.createStatement().executeQuery("select* from emp");
		
		
		FluentWait wi= new FluentWait(driver);
		
		wiat
		wi.withTimeout(40, TimeUnit.SECONDS);
		wi.pollingEvery(500, TimeUnit.MILLISECONDS);
		wi.pollingEvery(250, TimeUnit.MILLISECONDS);
		wi.ignoring(NullPointerException.class);
		wi.withTimeout(50, TimeUnit.SECONDS);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		FluentWait fi= new FluentWait(driver);
		fi.withTimeout(50, TimeUnit.SECONDS);
		fi.ignoring(FileNotFoundException.class);
		fi.pollingEvery(250		, TimeUnit.MILLISECONDS);
		
		
		
		
		FluentWait w= new FluentWait(driver);
		w.ignoring(NoSuchElementException.class);
		w.withTimeout(54, TimeUnit.SECONDS);
		w.pollingEvery(500, TimeUnit.MILLISECONDS);
		
		
System.setProperty("webdriver.gecko.driver", "fsdfsd");

driver.findElement(By.id("sdfsdf")).sendKeys(Keys.CONTROL+"a");
driver.findElement(By.id("sdfsd"));
Select s= new Select(element);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebDriverWait wait= new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.titleContains(""));
Actions a= new Actions(driver);
a.moveToElement(target);
Robot r= new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
BufferedImage img=r.createScreenCapture(new Rectangle(500	, 500));
ImageIO.write(img, ".png", new  File("sdfsdf"));
TakesScreenshot take = (TakesScreenshot)driver;
File file=take.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file, new File("sdfsdf"));
Connection c=DriverManager.getConnection("sdfsdf","sdfsdf","sdfsdfsd");
	Statement st=c.createStatement();
	
	ResultSet re = st.executeQuery("select*from emp;");
	re.toString();
	URL u= new URL("sdfsdf");
	HttpURLConnection con = (HttpURLConnection)u.openConnection();
	con.connect();
	String stt=con.getResponseMessage();
	con.disconnect();
	driver.manage().window().maximize();
	driver.manage().window().fullscreen();
	driver.switchTo().alert().dismiss();
	driver.manage().window();
	String ssss=driver.getWindowHandle();
	Set<String> sdfsdf = driver.getWindowHandles();
	Properties p= new Properties();
	p.load(new FileInputStream("sdfsdf"));
	p.getProperty("sdfsdfsdf");
	Calendar.getInstance().getTime();
	Date d= new Date();
	SimpleDateFormat sdt= new SimpleDateFormat("DD/MM/yyyy");
	int i=90;
	int kkk=Integer.valueOf(i);
	String ts="simran";
	int iii=Integer.parseInt(ts);
	double ddd=Double.parseDouble(ts);
	String ppp[]=ts.split("");
	System.out.println(ppp.length);
	StringBuffer sb= new StringBuffer(ts);
	String res=sb.reverse().toString();
	sb.replace(0, 50, ts);
	ts.replace('d', 'd');
	ts.replaceAll(regex, replacement);
	
	WebDriver driver= new FirefoxDriver();
FluentWait<WebDriver> fw=new FluentWait<WebDriver>(driver);
fw.pollingEvery(250, TimeUnit.MILLISECONDS);
fw.withTimeout(30, TimeUnit.SECONDS);
fw.ignoring(NoSuchElementException.class);
fw.ignoring(exceptionType);
fw.pollingEvery(duration, unit);\
fw.withTimeout(duration, unit)
fw.until(new Function<WebDriver	, WebElement>() {

	@Override
	public WebElement apply(WebDriver t) {
		// TODO Auto-generated method stub
		return null;}
	
	

	
})

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
