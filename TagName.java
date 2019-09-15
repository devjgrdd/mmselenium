package localizar.elementos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilidades.Utilidades;
import valores.Valores;

public class TagName {

	public static void main(String[] args) throws InterruptedException {
		
		Valores valores = new Valores();
		
		Utilidades utilidades = new Utilidades();
		
		utilidades.asignarPropiedad(valores.getChromeDriver(), valores.getRutaChromeDriver());
		
		WebDriver chrome = utilidades.driverChrome();
		
		utilidades.goTo(chrome, valores.getDemo());
		
		utilidades.dormir(3000);
		
		utilidades.maximizaPantalla(chrome);
		
		utilidades.dormir(3000);
		
		WebElement tagA = utilidades.busquedaTagName(chrome, valores.getTagA());
		
		System.out.println(tagA.getClass());
		System.out.println(tagA.getTagName());
		System.out.println(tagA.getText());
		System.out.println(tagA.getLocation());
		System.out.println(tagA.getSize());
		
		System.out.println(tagA.toString());
		
	}

}
