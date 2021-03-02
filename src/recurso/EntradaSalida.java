package recurso;

import java.awt.List;
import java.util.Scanner;

public class EntradaSalida {
	static Scanner sc = new Scanner(System.in);
	public static String rutaArtista() {
		System.out.println("Introcuzca la url del artista.");
		String url = sc.nextLine(); 	
		return url;
		
	}
	

}
