/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerapruebacurso;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jcapitan
 */
public class GestionCliente {
    
    static List<Cliente> listaClientes = new ArrayList<Cliente>();
    
    public static void CrearCliente(Cliente cliente){
    listaClientes.add(cliente);
    
    } 
    
    public static void EliminarCliente(String dni){
        
       for (Cliente cliente : listaClientes) {
            if (dni.equalsIgnoreCase(cliente.getDni())) {
               listaClientes.remove(cliente);
            }
        }
    
    }
    
    public static void ModificarCliente(int EdadModificar, String dni ){
    
        for (Cliente cliente : listaClientes) {
            if (dni.equalsIgnoreCase(cliente.getDni())) {
                cliente.setEdad(EdadModificar);
            }
        }
    
    }
    
    public static String LeerLista(){
        
        String listaSring = listaClientes.toString();
        return listaSring;
        /*for (Cliente cliente : listaClientes) {
            System.out.println(cliente.toString());
        }*/
    }
}
