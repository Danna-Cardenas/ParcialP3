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
public class Administradores {
    
    private ArrayList<Empleado>empleados;

    public Administradores(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    
    public void mostrarSalario(){
        System.out.println("Inventario:");
        for(Empleado empleado : empleados){
            System.out.println("salario: "+ empleado.getSalario());
        }
        
    }
    
    
}
