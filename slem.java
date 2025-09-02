public class FrameUsingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
        Thread.sleep(3000);
        WebElement frame1=driver.findElement(By.xpath("//iframe"));
       driver.switchTo().frame(frame1);
       
       Thread.sleep(3000);
       
       driver.findElement(By.id("username")).sendKeys("akhi");
       Thread.sleep(3000);
       driver.findElement(By.id("password")).sendKeys("akhi");
       
       driver.findElement(By.id("submitButton")).click();
       
       Thread.sleep(3000);
       
       driver.switchTo().defaultContent();
       String elm=driver.findElement(By.xpath("//p[@class=\"font-bold border-b-[1px] border-solid text-[15px] text-black \"]")).getText();
       System.out.println(elm);
       
       Thread.sleep(3000);
	}
        
       
}
