/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerapruebacurso;

/**
 *
 * @author jcapitan
 */
public class Cliente {
    
    private String name;
    private int edad;
    private String dni;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Cliente(String name, int edad, String dni) {
        this.name = name;
        this.edad = edad;
        this.dni = dni;
    }

    
    public Cliente() {
    }

    @Override
    public String toString() {
        return "name=" + name + ", edad=" + edad + ", dni=" + dni +'\n';
    }
    
    
}
