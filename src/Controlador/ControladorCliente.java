/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import java.awt.event.ActionEvent;

/**
 *
 * @author JHONNY
 */
public class ControladorCliente {
    
    public void controlarAccion(ActionEvent evento, Cliente unCliente){
        String accion=evento.getActionCommand();
        System.out.println("antes del switch "+accion);
       
        switch(accion){
            case "Insertar" -> {
                System.out.println("insertar");
                unCliente.insertar();
            }
            case "Modificar" -> {
                System.out.println("modificar");
                unCliente.modificar();
            }
                
            case "Eliminar" -> unCliente.eliminar();
        }
    }
    
}
