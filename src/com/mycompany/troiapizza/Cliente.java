/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.troiapizza;

/**
 *
 * @author danic
 */
public class Cliente {
    
    private int id;
    private String nombre;
    private String apellidos;
    private String dni;
    private String password;
    private int puntos;
    private static int contaCliente = 0;

    public Cliente(int id, String nombre, String apellidos, String dni, String password, int puntos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.password = password;
        this.puntos = puntos;
        contaCliente++;
    }
    
    public Cliente(String nombre, String apellidos, String dni, String password) {
        this.id = contaCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.password = password;
        this.puntos = 0;
        contaCliente++;
    }
    
    
    
    public void hacerPedido(){
        
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
            return "Cliente con ID: " + id + ", " + nombre.toUpperCase() + " " + apellidos.toUpperCase() + " , con DNI " + dni + " y " + puntos + " puntos";
    }
    
    
    
}
