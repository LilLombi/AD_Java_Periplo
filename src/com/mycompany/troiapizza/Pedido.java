/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.troiapizza;

/**
 *
 * @author danic
 */
public class Pedido {
    
    private int id;
    private int idCliente;
    private int[] idPizzas;
    private String fecha;
    private double total;

    public Pedido(int id, int idCliente, int[] idPizzas, String fecha, double total) {
        this.id = id;
        this.idCliente = idCliente;
        this.idPizzas = idPizzas;
        this.fecha = fecha;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int[] getIdPizzas() {
        return idPizzas;
    }

    public void setIdPizzas(int[] idPizzas) {
        this.idPizzas = idPizzas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido con ID " + id + ", del cliente " + idCliente + ", Pizzas: ");
        for (int i = 0; i < idPizzas.length; i++){
            sb.append(idPizzas[i] + ", ");
        }
        sb.append("realizado el " + fecha + ". Total del pedido: " + total);
        return sb.toString();
    }
    
}
