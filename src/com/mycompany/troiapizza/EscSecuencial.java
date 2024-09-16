/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.troiapizza;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author danic
 */
public class EscSecuencial {
    
//    public static void escribirClientes(String file, List<Cliente> clientes) {
//       try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
//            for (Cliente c : clientes) {
//                String linea = c.getNombre() + "," + c.getApellidos() + "," + c.getDni() + "," + c.getId() + "\n";
//                writer.write(linea);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    private int tamMaxIdPizza = 100; 
    
    public static void escribirClientes(File cliente) {
        try{
            FileOutputStream fos = new FileOutputStream(cliente, true);
            
        }catch(FileNotFoundException fe){
            fe.printStackTrace();
        }
        
    }
    
    public static void escribirPizza(String pizzasfile, List<Pizza> pizzas) {
       try (BufferedWriter writer = new BufferedWriter(new FileWriter(pizzasfile))) {
            for (Pizza p : pizzas) {
                String linea = p.getId() + "," + p.getIngredientes() + "," + p.getPrecio() + "," + p.isFamiliar() + "," + p.getNombre() + "\n";
                writer.write(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void escribirPedido(String pedidosfile, List<Pedido> pedidos) {
       try (BufferedWriter writer = new BufferedWriter(new FileWriter(pedidosfile))) {
            for (Pedido p2 : pedidos) {
                String linea = p2.getId() + "," + p2.getIdCliente() + "," + p2.getTotal() + "," + p2.getFecha() + "\n";
                writer.write(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
