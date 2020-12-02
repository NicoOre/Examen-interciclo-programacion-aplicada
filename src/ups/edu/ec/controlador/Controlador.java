/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author GAMER PC
 */
public class Controlador {

    private Pattern patron;
    private Matcher corpus;

    public void ingresarRegex(String regex) {
        patron = Pattern.compile(regex);
    }

    public boolean validar(String texto) {
        corpus = patron.matcher(texto);
        return corpus.find();
    }

    public Set<String> obtenerURL(String paginaTexto) {
        Set<String> resultado = new HashSet();
        corpus = patron.matcher(paginaTexto);
        while (corpus.find()) {
            resultado.add(corpus.group(0));
        }
        return resultado;
    }

    public Pattern getPatron() {
        return patron;
    }

    public void setPatron(Pattern patron) {
        this.patron = patron;
    }

    public Matcher getCorpus() {
        return corpus;
    }

    public void setCorpus(Matcher corpus) {
        this.corpus = corpus;
    }
}
