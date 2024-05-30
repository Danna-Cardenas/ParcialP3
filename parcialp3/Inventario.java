/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialp3;

import java.util.ArrayList;

/**
 *
 * @author DANNA
 */
public class Inventario {
    
    private ArrayList<Producto>productos;

    public Inventario(ArrayList<Producto> producto) {
        this.productos = producto;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
}
    
    
    public Producto buscarProductoNombre(String nombre){
        for(Producto producto : productos){
            if (producto.getNombre().equalsIgnoreCase(nombre)){
                return producto;
            }
        }
        return null;
}
    
    
    public void mostarInventario(){
        System.out.println("Inventario:");
        for(Producto producto : productos){
            System.out.println("nombre: "+ producto.getNombre() + "descripcion: " + producto.getDescripcion() + "precio: " + producto.getPrecio() + "cantidad disponible: " + producto.getCantidadDisponible());
        }
    }
    

    
    
    
    
   

}