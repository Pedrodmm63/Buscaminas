package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Read {

	private final String FICHERO = "C:\\Users\\pdmm2\\OneDrive\\Documentos\\READ.txt";
	
	/**
	 * Lee los datos del fichero y los traslada a un ArrayList
	 * @return 
	 * @return el Arraylist con los datos leidos y trasnformados en Posicion
	 * y esto lo hace hasta que no queden lineas
	 */
	
	public void getDatos() {
		
		try {
			// enlaza con un fichero
            BufferedReader ficheroEntrada = new BufferedReader(new FileReader(FICHERO));
 
            // leo una linea del fichero    
            String numero=ficheroEntrada.readLine();
            
            // mientras que las lineas existan
            while(numero!=null){
            	
            	System.out.println(numero);
            	

            	// volvemos a leer la 2 linea
            	String letra=ficheroEntrada.readLine();
            	
            	//VUELVO A LEER UNA POSIBLE PRIMERA LINEA
            	numero=ficheroEntrada.readLine();

            }           
            ficheroEntrada.close();
        }
        catch (IOException e) {
            System.out.println("Problemas: " + e.getMessage() );
        } 
        catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
	}
}
