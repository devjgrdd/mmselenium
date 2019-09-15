package localizar.elementos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilidades.Utilidades;
import valores.Valores;

public class ClassName {

	public static void main(String[] args) throws InterruptedException {
Valores valores = new Valores();
		
		Utilidades utilidades = new Utilidades();
		
		utilidades.asignarPropiedad(valores.getChromeDriver(), valores.getRutaChromeDriver());
		
		WebDriver chrome = utilidades.driverChrome();
		
		utilidades.goTo(chrome, valores.getDemo());
		
		utilidades.dormir(3000);
		
		utilidades.maximizaPantalla(chrome);
		
		utilidades.dormir(3000);
		
		List<WebElement> lefas = chrome.findElements(By.className("leaf"));
		//TODO ESTO FUNCIONA
		/*
		System.out.println(lefas.size());
		WebElement deCompras = null;
		byte contador = 0;
		for (WebElement webElement : lefas) {
			contador++;
			//System.out.println(webElement.getText());
			if(webElement.getText().equals("Shipping")){
				deCompras = webElement;
				break;
			}
		}
		System.out.println(deCompras.getText());
		System.out.println(contador);
		System.out.println(lefas);
		utilidades.dormir(3000);
		//esto lleva a https://demostore.x-cart.com/shipping.html <---> funciona
		//deCompras.click();
		*/
		utilidades.dormir(3000);
		for (WebElement webElement : lefas) {
			//org.openqa.selenium.StaleElementReferenceException
			if(webElement.isDisplayed())webElement.click();
		}
	}

}
