package com.mycompany.troiapizza;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danic
 */
public class Fichero {
    
    private static File dir = new File("./storage");
    private static Scanner read = new Scanner(System.in);
    
    public static File crearFichero(String route){
        File f = new File(dir, route);
        try {
            if (!f.exists()) {
                f.createNewFile();
                System.out.println("Archivo creado: " + f.getAbsolutePath());
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f;
    }
    
    public void moverFichero(File fich){
        //File f = new File(dir, route);
        String nruta, rutao;
        System.out.println("Indique el nombre del fichero que quieres mover: ");
        rutao = read.next();
        
        File origen = new File(rutao);
        
        if (!origen.exists()) {
            System.out.println("El fichero no existe");
        } else {
            System.out.println("Indique la nueva ruta en la que desea establecer el fichero " + fich.getName());
            nruta = read.next();    
            File destino = new File(nruta);
            
        }
    }
    
    public void copiarFichero(File fich){
        String nruta;
        System.out.println("Indique la nueva ruta en la que desea establecer el fichero " + fich.getName());
        nruta = read.next();
        File dest = new File(nruta);
        //FileUtils.copyFile(fich.getAbsoluteFile(), dest);
        
    }
    
    public void borrarFichero(File fich){
        if (fich.exists()){
            fich.delete();
        }
    }
}
