/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.troiapizza;

import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author danic
 */
public class Pizza {
    
    private int id;
    private String nombre;
    private Set<Ingrediente> ingredientes;
    private boolean familiar;
    private double precio;
    
    public Pizza(int id, String nombre, Set<Ingrediente> ingredientes, boolean familiar, double precio){
        this.id = id;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.familiar = familiar;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Set<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public boolean isFamiliar() {
        return familiar;
    }

    public void setFamiliar(boolean familiar) {
        this.familiar = familiar;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Pizza ").append(nombre).append(" con ");
//        for (int i = 0; i < ingredientes.size(); i++){
//            sb.append(ingredientes);
//        }
//        
//        return sb.toString();
//    }
//    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza " + nombre + " con ");
        Iterator ing = ingredientes.iterator();
        while (ing.hasNext()){
            sb.append(ing.next().toString() + ", ");
        }
        if (familiar){
            sb.append("FAMILIAR, coste: ");
        }else {
            sb.append("MEDIANA, coste: ");
        }
        sb.append(precio);
        
        return  sb.toString();
    }
    
    
}
