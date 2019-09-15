package localizar.elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
	
	private static WebElement busquedaId(WebDriver driver, String id){
		WebElement element = driver.findElement(By.id(id));
		return element;
	}
	
	private static void maximizaPantalla(WebDriver driver){
		driver.manage().window().maximize();
	}
	
	private static void goTo(WebDriver driver, String url){
		driver.get(url);
	}
	
	public static WebDriver driverChrome(){
		return new ChromeDriver();
	}
	
	public static void asignarPropiedad(String tipoDriver, String rutaDriver){
		System.setProperty(tipoDriver, rutaDriver);
	}
	
	public static void quitarDriver(WebDriver driver){
		driver.quit();
	}
	
	public static void dormir(int duracion) throws InterruptedException{
		Thread.sleep(duracion);
	}
	
	public static void escribir(WebElement elemento, String texto){
		elemento.sendKeys(texto);
	}
	
	private static void pulsarBoton(WebElement boton) {
		boton.click();
	}
	
	private static void alertAceptar(WebDriver driver){
		driver.switchTo().alert().accept();
	}
	
	private static void alertConfirm(WebDriver driver){
		driver.switchTo().alert().dismiss();
	}
	
	static String chromeDriver = "webdriver.chrome.driver";
	
	static String rutaChromeDriver = "C:\\chromedriver32\\chromedriver.exe";
	
	static String baseURL = "http://www.google.com";
	
	static String practicar = "https://learn.letskodeit.com/p/practice";

	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver32\\chromedriver.exe");
	//	String chromeDriver = "webdriver.chrome.driver";
	//	String rutaChromeDriver = "C:\\chromedriver32\\chromedriver.exe";
		asignarPropiedad(chromeDriver, rutaChromeDriver);
		
		//Id id = new Id();
		//WebDriver driver = new ChromeDriver();
		//String baseURL = "http://www.google.com";
		
		//String practicar = "https://learn.letskodeit.com/p/practice";
		
		//driver.manage().window().maximize();
		
		WebDriver chrome = driverChrome();
		
		//WebElement elemento = busquedaId(chrome, "name");
		
		//driver.get(baseURL);
		//goTo(new ChromeDriver(), baseURL);
		goTo(chrome, baseURL);
		//driver.manage().window().maximize();
		//maximizaPantalla(new ChromeDriver());
		maximizaPantalla(chrome);
		
		dormir(5000);
		
		goTo(chrome, practicar);
		
		dormir(5000);
		
		WebElement inputAlert = busquedaId(chrome, "name");
		
		escribir(inputAlert,"buenas noches a todos");
		
		dormir(5000);
		
		WebElement btnAlert = busquedaId(chrome, "alertbtn");
		
		pulsarBoton(btnAlert);
		
		dormir(5000);
		
		alertAceptar(chrome);
		
		dormir(5000);
		
		escribir(inputAlert, "BUENAS NOCHES A TODOS");
		
		dormir(5000);
		
		WebElement btnConfirm = busquedaId(chrome, "confirmbtn");
		
		pulsarBoton(btnConfirm);
		
		dormir(5000);
		
		alertConfirm(chrome);
		
		dormir(5000);
		
		quitarDriver(chrome);
		/*
		driver.get("https://learn.letskodeit.com/p/practice");
		Thread.sleep(2500);
		//WebElement element = driver.findElement(By.id("name"));
		WebElement element = Id.busquedaId(driver,"name");
		element.sendKeys("WANOLO");
		Thread.sleep(2500);
		//WebElement weBtnAlert = driver.findElement(By.id("alertbtn"));
		WebElement
		weBtnAlert.click();
		Thread.sleep(2500);
		driver.switchTo().alert().accept();
		WebElement weBtnConfirm = driver.findElement(By.id("confirmbtn"));
		element.sendKeys("PACO");
		Thread.sleep(2500);
		weBtnConfirm.click();
		Thread.sleep(2500);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2500);
		driver.quit();
		*/
	}

	

}
