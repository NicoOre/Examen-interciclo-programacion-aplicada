/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

/**
 *
 * @author GAMER PC
 */
public class Docente extends Persona{

    private Curso curso;
    
    public Docente() {
    }

    public Docente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Curso getC() {
        return curso;
    }

    public void setC(Curso c) {
        this.curso = c;
    } 

    @Override
    public String toString() {
        return "Docente{"+ "nombre=" + this.getNombre() + " apellido=" + this.getApellido() +"\n" + "\t" +" curso=" + curso.toString() + '}';
    }
}
