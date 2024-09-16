/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.troiapizza;

/**
 *
 * @author danic
 */
public enum Ingrediente {
     
    SBBQ("Salsa BBQ", 001), SBOU("Salsa Bourbon", 002), STOM("Salsa de tomate", 003), SCREM("Salsa crema", 004),
    CYRK("Jamón York", 101), CBCN("Bacon", 102), CPPK("Pulled Pork", 103), CPPP("Pepperoni", 104), CNCH("Anchoas", 105), CATN("Atún", 106),
    VCHM("Champiñones", 201), VACT("Aceitunas", 202), VCEB("Cebolla", 203), VCCR("Cebolla caramelizada", 204), VTOM("Tomate", 205),
        VPIV("Pimiento verde", 206), VPIR("Pimiento rojo", 207), VPNA("Piña", 208), VMIZ("Maiz", 209),
    QPAR("Queso parmesano", 301), QMZZ("Queso mozzarela", 302), QCDD("Queso cheddar", 303), QAZL("Queso azul", 304), QEDM("Queso edam", 305);
    
    
    public final String label;
    public final int pos;
    
    private Ingrediente(String label, int pos){
        this.label = label;
        this.pos = pos;
    }

    @Override
    public String toString() {
        return label;
    }
    
    
    
}
