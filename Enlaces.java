package localizar.elementos;

import org.openqa.selenium.WebDriver;

import utilidades.Utilidades;
import valores.Valores;

public class Enlaces {

	public static void main(String[] args) throws InterruptedException {
Valores valores = new Valores();
		
		Utilidades utilidades = new Utilidades();
		
		utilidades.asignarPropiedad(valores.getChromeDriver(), valores.getRutaChromeDriver());
		
		WebDriver chrome = utilidades.driverChrome();
		
		utilidades.goTo(chrome, valores.getUrlLKIT());
		
		utilidades.dormir(3000);
		
		utilidades.maximizaPantalla(chrome);
		
		utilidades.dormir(3000);
		
		utilidades.busquedaLink(chrome, valores.getLOGIN()).click();
		
		utilidades.dormir(3000);
		
		utilidades.goTo(chrome, valores.getUrlLKIT());
		
		utilidades.dormir(3000);
		
		utilidades.busquedaLinkParcial(chrome, valores.getPRAC()).click();
		
		utilidades.dormir(5000);
		
		utilidades.quitarDriver(chrome);
	}

}
