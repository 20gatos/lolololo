/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofamilia;

/**
 *
 * @author Estudiante
 */
public class Familia {
    private String apellido;
    private Persona madre; //cada flecha de asociación representa un atributo 
    private Persona padre;
    private Persona [] hijo; //este atributo es un vector porque en el diagrama de flujo tiene cardinalidad 2
    
    public Familia(String apellido){
        this.apellido = apellido;
        this.hijo = new Persona[2]; 
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona getMadre() {
        return madre;
    }

    public void setMadre(Persona madre) {
        this.madre = madre;
    }

    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }

    public Persona[] getHijo() {
        return hijo;
    }

    public void setHijo(Persona[] hijo) {
        this.hijo = hijo;
    }
    public Persona [] listaMiembros (){
        return null;
    }
    public Persona buscarMiembro(String nombre){
        return null;
    }
    
}
