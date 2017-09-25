package pkg;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Queue;

import org.apache.commons.io.FileUtils;
import javax.imageio.ImageIO;
import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public abstract class Demo2 {
	abstract void king();
	
	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.gecko.driver", "/home/tyss/Downloads/geckodriver");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		Robot r= new Robot();
		Rectangle re= new Rectangle(500,500);
		BufferedImage img = r.createScreenCapture(re);
		ImageIO.write(img, "png", new File("dfsdfsdfsdfsd"));
		List<WebElement> kkk = driver.findElements(By.id(""));
		URL url= new URL("sdfsdfsdf");
		HttpsURLConnection connection =(HttpsURLConnection )url.openConnection();
	connection.connect();
String message=connection.getResponseMessage();
connection.disconnect();

TakesScreenshot t = (TakesScreenshot)driver;
File file = t.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(file, new File("sdfsdfsdfsdf"));
int i=10;

String as="arhad";
Integer a = Integer.valueOf(i);
int ss = Integer.parseInt(as);
double ddd = Double.parseDouble(as);
double d=1000.121;
Double k = Double.valueOf(d);
String s="sdfsdfsdf";
String l = String.valueOf(i);
float f=3.6f;
Float ll = Float.valueOf(f);
int e=255;
Integer.valueOf(e);
Integer.reverse(e);
Integer.valueOf(e);

int iee=10;
Integer op = Integer.valueOf(iee);









































	}

}
