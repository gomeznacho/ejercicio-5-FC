package es.nachogom;

import es.nachogom.candidato.Candidato;
import es.nachogom.candidato.Presencialidad;
import es.nachogom.etiqueta.Etiqueta;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Candidato candidato1 = new Candidato(1,"cand1", "Madrid", "España", "666666", "email@email.email", true, Presencialidad.REMOTO, 2, new ArrayList<>());
        Candidato candidato2 = new Candidato(2,"cand2", "Valencia", "España", "666777", "email2@email.email", false, Presencialidad.MIXTO, 1, new ArrayList<>());
        Candidato candidato3 = new Candidato(3,"cand3", "Madrid", "España", "666888", "email3@email.email", true, Presencialidad.REMOTO, 1, new ArrayList<>());
        Candidato candidato4 = new Candidato(4,"cand4", "Barcelona", "España", "666999", "email4@email.email", true, Presencialidad.REMOTO, 3, new ArrayList<>());

        Etiqueta etiqueta1= new Etiqueta("Java", 2);



    }
}
