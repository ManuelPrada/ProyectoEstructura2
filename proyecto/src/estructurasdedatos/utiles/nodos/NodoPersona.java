/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

/**
 *
 * @author Manuel Prada
 */
public class NodoPersona {
    
    private String cedula;
    private String nombre;
    private NodoPersona siguiente;

 
    public String getCedula() {
        return cedula;
    }

   
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

  
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    public NodoPersona getSiguiente() {
        return siguiente;
    }

    
    public void setSiguiente(NodoPersona siguiente) {
        this.siguiente = siguiente;
    }
    
    
}

