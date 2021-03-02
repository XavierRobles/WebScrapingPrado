package recurso;
import entidad.Artista;
import entidad.Cuadro;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entidad.Cuadro;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scraping {

	public static List<Cuadro> sacarDatosWeb(String ruta) {
		List<Cuadro> lista_cuadros = new ArrayList();
		try {
			Document documento = Jsoup.connect(ruta).get();
			Element elemento_nombre = documento.selectFirst("div.obra-autor>article>h1");
			String nombre_autor ="";
			if (elemento_nombre != null) {
				nombre_autor = elemento_nombre.text();
			
			}
			
			Element elemento_padre = documento.selectFirst("div.mostrable.miniaturas");
			Elements elementos_figure = elemento_padre.select("figure");
			
			
			for (Element e : elementos_figure) {
				Element elementos_imagen=e.selectFirst("div.imgwrap>a>img");
				Element elemento_titulo=e.selectFirst("figcaption>dl>dt>a");
				String url = elementos_imagen.absUrl("src");
				String titulo= elemento_titulo.text();
				Cuadro c = new Cuadro(url, titulo);
				lista_cuadros.add(c);
				
			}
			
			Artista a = new Artista(nombre_autor, lista_cuadros);
			
			PintarHTML.CrearHTML(a,lista_cuadros);
					return lista_cuadros;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
}
