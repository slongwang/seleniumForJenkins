package com.example.tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class micarshow{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	 /*System.setProperty(
              "webdriver.chrome.driver",
              "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
    driver = new ChromeDriver(); 
   System.setProperty("webdriver.ie.driver", 
			"C:\\Program Files (x86)\\Internet Explorer\\IEDriverServer.exe");
		DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer(); 
		ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	driver = new InternetExplorerDriver(ieCapabilities);*/
	driver = new FirefoxDriver();
    driver.manage().window().maximize();
    baseUrl = "http://qa.micarshow.com/";
    driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
  }

  @Test
  public void testLoginJunit() throws Exception {
	  	driver.get(baseUrl + "/application/app/passport.html?menuCode=login&userPropType=manufacturer");
	    driver.findElement(By.id("rememberMeChk")).click();
	    driver.findElement(By.id("loginBtn")).click();
	    driver.findElement(By.linkText("��Ʒ����")).click();
	    driver.findElement(By.linkText("��Ʒ����")).click();
	    driver.findElement(By.linkText("���ģ��")).click();
	    driver.findElement(By.cssSelector("#productEditStep1-category2 > li")).click();
	    driver.findElement(By.xpath(".//*[@id='productEditStep1-category3']/li[1]")).click();
	    driver.findElement(By.linkText("��һ��")).click();
	    driver.findElement(By.name("productName")).clear();
	    driver.findElement(By.name("productName")).sendKeys("������ӹ�Ӧ����Ʒ����");
	    driver.findElement(By.xpath(".//*[@id='product-brand-toggle']")).click();
	    //ѡ��Ʒ��
	    driver.findElement(By.xpath("(//a[contains(text(),'ѡ��')])[3]")).click();
	    //���Ʒ��
	    /*driver.findElement(By.linkText("���Ʒ��")).click();
	    driver.findElement(By.id("brand-name-input")).clear();
	    driver.findElement(By.id("brand-name-input")).sendKeys("�������Ʒ��5");
	    driver.findElement(By.id("brand-desc-textare")).clear();
	    driver.findElement(By.id("brand-desc-textare")).sendKeys("����Ʒ������");
	    driver.findElement(By.id("save-brand-btn")).click();
	    driver.findElement(By.xpath(".//*[@id='productEditStep2_baseInfoForm']/div[2]/div[3]/label/input")).click();
	    driver.findElement(By.xpath(".//*[@id='productEditStep2_baseInfoForm']/div[2]/div[4]/label/input")).click();
	    driver.findElement(By.name("briefName")).clear();*/
	    driver.findElement(By.name("briefName")).sendKeys("���Զ�����");
	    driver.findElement(By.name("promotionWord")).clear();
	    driver.findElement(By.name("promotionWord")).sendKeys("���Ǵ�����");
	    //driver.manage().wait(10000);
	    driver.findElement(By.linkText("��������")).click();
	    driver.findElement(By.name("addSaleArea")).click();
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[22]")).click();
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[21]")).click();
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[20]")).click();
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[25]")).click();
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[26]")).click();
	    driver.findElement(By.name("confirm")).click();
	    driver.findElement(By.linkText("��Ʒ����")).click();
	    driver.findElement(By.name("attribute2Value_1044")).clear();
	    driver.findElement(By.name("attribute2Value_1044")).sendKeys("M007");
	    driver.findElement(By.id("prop_rad_1109")).click();
	    driver.findElement(By.name("attribute2Value_1047")).clear();
	    driver.findElement(By.name("attribute2Value_1047")).sendKeys("��ɫ");
	    new Select(driver.findElement(By.name("attribute2OptionId_1048"))).selectByVisibleText("F4.0");
	    driver.findElement(By.id("prop_rad_335")).click();
	    driver.findElement(By.id("prop_rad_341")).click();
	    new Select(driver.findElement(By.name("attribute2OptionId_344"))).selectByVisibleText("4.3�缰����");
	    driver.findElement(By.name("attribute2Value_351")).clear();
	    driver.findElement(By.name("attribute2Value_351")).sendKeys("����ط�");
	    driver.findElement(By.name("attribute2Value_1050")).clear();
	    driver.findElement(By.name("attribute2Value_1050")).sendKeys("5kg");
	    driver.findElement(By.linkText("��Ʒ���")).click();
	    driver.findElement(By.name("addSubProduct")).click();
	    driver.findElement(By.name("specOptTxt_1167")).click();
	    driver.findElement(By.name("specOptTxt_1167")).clear();
	    driver.findElement(By.name("specOptTxt_1167")).sendKeys("01");
	    driver.findElement(By.id("product-attr-select-ok")).click();
	    driver.findElement(By.linkText("ͼƬ��Ϣ")).click();
	    driver.findElement(By.linkText("��Ʒ����")).click();
	    //����������ֹ����
	    driver.findElement(By.xpath(".//*[@id='subHeader']/div[2]/a")).click();
	    driver.findElement(By.linkText("��ģ���滻")).click();
	    driver.findElement(By.linkText("���沢����")).click();
	    driver.findElement(By.linkText("��һ��")).click();
	    driver.findElement(By.name("factoryPrice")).clear();
	    driver.findElement(By.name("factoryPrice")).sendKeys("111");
	    driver.findElement(By.name("salePrice")).clear();
	    driver.findElement(By.name("salePrice")).sendKeys("222");
	    driver.findElement(By.linkText("����")).click();
	    driver.findElement(By.linkText("������Ʒ����ҳ��")).click();
	    driver.quit();
  }

  /*@Test
  //���Զ������
  public void testT() throws Exception {
	  driver.get("https://www.baidu.com/"); 
	  assertEquals("About  Baidu", driver.findElement(By.xpath(".//*[@id='lh']/a[4]")).getText());
	  driver.close();
	  driver.quit();
  }*/
  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
