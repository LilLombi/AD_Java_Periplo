package com.mycompany.troiapizza;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 *
 * @author danic
 */
public class LecSecuencial {

    File fichLector;

    public LecSecuencial() {
    }

    ;

    public LecSecuencial(File fichLector) {
        this.fichLector = fichLector;
    }

    public File getFichLector() {
        return fichLector;
    }

    public void setFichLector(File fichLector) {
        this.fichLector = fichLector;
    }

    public List<Pizza> leerTexto() {
        List<Pizza> pizzas = new ArrayList<>();
        Properties properties = new Properties();
        //FileInputStream inputStream = new FileInputStream("pizzasApp.properties");
        //properties.load(inputStream);
        int id;
        String nombre, ingrediente;
        boolean familiar;
        double precio;
        Set<Ingrediente> ingredientes = null;

        try {

            BufferedReader fbr = new BufferedReader(new FileReader(properties.getProperty("path.pizza")));
            String linea;
            while ((linea = fbr.readLine()) != null) {
                String[] datos = linea.split(",");
                id = Integer.parseInt(datos[0]);
                nombre = datos[1];
                familiar = Boolean.parseBoolean(datos[2]);
                precio = Double.parseDouble(datos[3]);
                ingredientes = new HashSet<>();
                for (int i = 4; i < datos.length; i++) {
                    ingredientes.add(Ingrediente.valueOf(datos[i]));

                }

                Pizza pizza = new Pizza(id, nombre, ingredientes, familiar, precio);

                pizzas.add(pizza);
            }
            fbr.close();
        } catch (FileNotFoundException fn) {
            System.out.println("No se encuentra el fichero en la ruta indicada");
        } catch (IOException io) {
            System.out.println("Error de E/S ");
        }

        return pizzas;
    }

    public void leerBinario() {
        
    }
}
