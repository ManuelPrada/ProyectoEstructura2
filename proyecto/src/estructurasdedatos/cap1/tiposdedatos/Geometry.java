/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.tiposdedatos;

/**
 *
 * @author manuel
 */
public class Geometry {
    
    private String codigo;
    private String tipo;
    private String nombre;
  
  public float crearFigura(){return 0;}
  public float calcularArea(){return 0;}
        
    public String getCodigo() {
        return codigo;
    }
 
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getTipo() {
        return tipo;
    }
     
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}

