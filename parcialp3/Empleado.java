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
public class Empleado {
    
    private String nombre; 
    private String cargo;
    private int salario;
    private int fechaContratacion;
    private int horaTrabajada;
    private int salarioHora;
    private int diaLibre;

    public Empleado(String nombre, String cargo, int salario, int fechaContratacion, int horaTrabajada, int salarioHora, int diaLibre) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
        this.horaTrabajada = horaTrabajada;
        this.salarioHora = salarioHora;
        this.diaLibre = diaLibre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(int fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public int getHoraTrabajada() {
        return horaTrabajada;
    }

    public void setHoraTrabajada(int horaTrabajada) {
        this.horaTrabajada = horaTrabajada;
    }

    public int getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(int salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getDiaLibre() {
        return diaLibre;
    }

    public void setDiaLibre(int diaLibre) {
        this.diaLibre = diaLibre;
    }
    
    


   
}
    
   
   
   
    
    

