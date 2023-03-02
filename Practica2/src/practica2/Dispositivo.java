/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * @author Usuario
 */
public class Dispositivo {
    private int codigo;
    private String nombre;
    private String serial;

    public Dispositivo(int codigo, String nombre, String serial) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.serial = serial;
    }

    
    public Dispositivo(){
            
            }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSerial() {
        return serial;
    }
    
    
}
