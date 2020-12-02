/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAMER PC
 */
public class Curso<T> {
    
    private String nombre;
    private List<T> alumnos;

    public Curso(String nombre) {
        this.nombre = nombre;
        alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<T> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<T> alumnos) {
        this.alumnos = alumnos;
    }
    
    public void agregarAlumno(T objeto){
        alumnos.add(objeto);
    }

    @Override
    public String toString() {
        return "Curso{" + "nombre=" + nombre + ", alumnos=" + alumnos + '}';
    }
}
