package localizar.elementos;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		
		//utilidades.dormir(3000);
		
		utilidades.maximizaPantalla(chrome);
		
		//utilidades.dormir(3000);
		
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
		//List<WebElement> auxlefas = new ArrayList();
		List<String> lstEnlaces = new ArrayList();
		byte contador=0;
		for (WebElement webElement : lefas) {
			if(webElement.getTagName().equals("li") && webElement.findElement(By.tagName("a")).getAttribute("href")!=null){
				//System.out.println(webElement.findElement(By.tagName("a")).getAttribute("href"));
				lstEnlaces.add(webElement.findElement(By.tagName("a")).getAttribute("href"));
				contador++;
			}
			else{
				if(webElement.getAttribute("href")!=null){
					lstEnlaces.add(webElement.getAttribute("href"));
					contador++;
				}
			}
				//System.out.println(webElement.getTagName().equals("a"));
				//System.out.println(webElement.getAttribute("href"));
				//lstEnlaces.add(webElement.findElement(By.tagName("a")).getAttribute("href"));
			//}
			
			//System.out.println(webElement.getTagName().equals("a"));
			/*
			if(webElement.getTagName().equals("li")){
				if(webElement.findElement(By.tagName("a")).getAttribute("href")!=null){
					System.out.println(webElement.findElement(By.tagName("a")).getAttribute("href"));
					contador++;
				}				
			}
			*/
			
			//System.out.println(webElement.findElement(By.tagName("a")));
			//if(!webElement.findElement(By.tagName("a"))){
			//	System.out.println(webElement.findElement(By.tagName("a")).getAttribute("href"));
			//}
			//org.openqa.selenium.StaleElementReferenceException
		//	if(webElement.isDisplayed())webElement.click();
			//if(!webElement.getText().isEmpty()){
			//	auxlefas.add(webElement);
			//if(webElement.findElement(By.tagName("a")).getAttribute("href")!=null){
		//	if(webElement!=null){
		//		lstEnlaces.add(webElement.findElement(By.tagName("a")).getAttribute("href"));
		//	}
		}
		System.out.println(contador);
		//System.out.println(lstEnlaces);
		/*
		for (String enlace : lstEnlaces) {
			System.out.println(enlace.toString());
		}
		*/
		List<String> pestanas = new ArrayList<String>(chrome.getWindowHandles());
		contador=0;
		for (String enlace : lstEnlaces) {
		//	utilidades.goTo(chrome, enlace);
			chrome.switchTo().window(pestanas.get(contador+1));
			utilidades.goTo(chrome, enlace);
			contador++;
		}
		
		//System.out.println(auxlefas.get(0).findElement(By.tagName("a")).getAttribute("href"));
		//https://demostore.x-cart.com/
		/*
		System.out.println(auxlefas.size());
		byte contador=0;
		List<String> pestanas = new ArrayList<String>(chrome.getWindowHandles());
		chrome.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		for (WebElement webElement : auxlefas) {
		//	System.out.println(webElement.findElement(By.tagName("a")).getAttribute("href"));
			//if(webElement!=null) webElement.click();
			//if(!webElement.getText().isEmpty()) webElement.click();
			//if(webElement.findElement(By.tagName("a")).getAttribute("href")!=null){
			//	contador++;	//14 de 17
			//	webElement.click();	//org.openqa.selenium.StaleElementReferenceException
			//}
			//¿abrir pestañas para cada enlace?
			chrome.switchTo().window(pestanas.get(contador+1));
			webElement.click();
			contador++;
		}
		System.out.println(contador);
		*/
	}

}
