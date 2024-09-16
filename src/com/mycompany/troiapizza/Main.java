package com.mycompany.troiapizza;

import static com.mycompany.troiapizza.Fichero.crearFichero;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import javax.xml.*;
import org.w3c.dom.*;

/**
 *
 * @author danic
 */
public class Main {

    private static final Properties myProperties = new Properties();
    
    public static void main(String[] args) {
        Set<Ingrediente> ingGolosa = new HashSet<>();
        String nombreArchivoPizza = myProperties.getProperty("path.pizza");
        String nombreArchivoClientes = myProperties.getProperty("path.clientes");
        String nombreArchivoPedidos = myProperties.getProperty("path.pedidos");
        
         File archivoPizza = crearFichero(nombreArchivoPizza);
            File archivoClientes = crearFichero(nombreArchivoClientes);
            File archivoPedidos = crearFichero(nombreArchivoPedidos);
        ingGolosa.add(Ingrediente.SBBQ);
        ingGolosa.add(Ingrediente.CBCN);
        Pizza golosa = new Pizza(01, "Golosa", ingGolosa, false, 7.99);
        try{
            myProperties.load(Main.class.getClassLoader().getResourceAsStream("pizzasApp.properties"));
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
//         try {
//            Main.myProperties.load(new FileInputStream("pizzaApp.properties"));
//        } catch (IOException e) {
//            System.out.println("No se pueden cargar la inicialización del programa. Saliendo...");
//            System.exit(100);
//        }
    }
}
