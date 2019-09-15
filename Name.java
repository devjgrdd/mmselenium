package localizar.elementos;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilidades.*;
import valores.*;

public class Name {

	public static void main(String[] args) throws InterruptedException {
		
		Valores valores = new Valores();
		
		Utilidades utilidades = new Utilidades();
		
		utilidades.asignarPropiedad(valores.getChromeDriver(), valores.getRutaChromeDriver());
		
		WebDriver chrome = utilidades.driverChrome();
		
		utilidades.goTo(chrome, valores.getBaseURL());
		
		utilidades.dormir(3000);
		
		utilidades.maximizaPantalla(chrome);
		
		utilidades.dormir(3000);
		
		WebElement buscadorGoogle = utilidades.busquedaName(chrome, valores.getBuscadorGoogle());
		
		utilidades.escribir(buscadorGoogle, valores.getPracticar());
		
		utilidades.dormir(3000);
		
		utilidades.escribir(buscadorGoogle, valores.getENTER());
		
		utilidades.dormir(3000);
		//esto no funciona
		//WebElement enlace = utilidades.busquedaLinkParcial(chrome, "https://learn.letskodeit.com/p/practice");
		//esto funciona
		//WebElement enlace = chrome.findElement(By.className("ellip"));
		chrome.findElement(By.className(valores.getNombreClassEnlace())).click();
		//esto funciona
		//WebElement enlace = chrome.findElement(By.xpath("//div[contains(text(),\"Practice | Let's Kode It\")]"));
		//System.out.println(enlace);
		
		utilidades.dormir(3000);
		
		//enlace.click();
		
		utilidades.dormir(3000);
		
		WebElement inputAlert = utilidades.busquedaName(chrome, valores.getNombreAlert());
		
		utilidades.escribir(inputAlert, "HOLA MAMÁ");
		
		utilidades.dormir(3000);
		
		utilidades.busquedaId(chrome, "alertbtn").click();
		
		utilidades.dormir(3000);
		
		utilidades.alertAceptar(chrome);
		
		utilidades.dormir(3000);
		
		utilidades.quitarDriver(chrome);
			
	}

}
