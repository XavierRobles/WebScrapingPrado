
import java.util.List;

import entidad.Cuadro;
import recurso.EntradaSalida;
import recurso.Scraping;

public class ClasePrincipal {
	
	public static void main(String[] args) {
		String rutaArtista = EntradaSalida.rutaArtista();
		Scraping.sacarDatosWeb(rutaArtista);

	}

}
