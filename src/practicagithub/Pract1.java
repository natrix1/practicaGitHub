/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

/**
 *
 * @author Altamirano
 */
public class Pract1 {
    private String nombre;
    private String apellido;
    private int edad;
    private int votos;
    
    

    public Pract1(String nombre, int edad, int votos) {
        this.nombre = nombre;
        this.edad = edad;
        this.votos = votos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
}
