package recurso;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import entidad.Artista;
import entidad.Cuadro;

public class PintarHTML {
	
	public static void CrearHTML(Artista a, List<Cuadro> lista_cuadros) {
		String html = "<html><head><title>Obras</title></head><body><table>";
		html += "<h1>"+a.getNombre()+"</h1>";
		for (Cuadro c : lista_cuadros) {
			html += "<tr><td><img src='"+c.getRuta_cuadro()+"'></td>";
			html += "<td>"+c.getTitulo()+"</td></tr>";
		}
		html += "</table></body></html>";
		
		crearArchivo(html,a);
		
	}
	
	public static void crearArchivo(String html, Artista a) {

		try {
			FileWriter fw = new FileWriter("C:\\Users\\xavie\\pruebasmenu\\obras\\"+a.getNombre()+".html");
			
			fw.write(html);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
