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
public class Rector<T> extends Persona {

    private List<T> docentes;

    public Rector(){
        docentes  = new ArrayList<>();
    }

    public Rector(String nombre, String apellido) {
        super(nombre, apellido);
        docentes  = new ArrayList<>();
    }

    public List<T> getDocentes() {
        return docentes;
    }

    public void setDocentes(List<T> docentes) {
        this.docentes = docentes;
    }

    public void agregarDocente(T objeto) {
        docentes.add(objeto);
    }
}
