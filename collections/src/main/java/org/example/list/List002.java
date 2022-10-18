package org.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Dados as seguintes informaçoes sobre minhas series favoritas, crie uma lista
 * e ordene esta lista exibindo
 * (nome-temporadas-genero)

 Serie 01 = nome: "Arcane", 1, "Animação"
 Serie 02 = nome: "Ruptura", 1, "Suspense"
 Serie 03 = nome: "How I met your mother", 9, "Comédia"
 */

public class List002 {

    public static void main(String[] args) {

        Serie serie01 = new Serie("Arcane", 1, "Animação");
        Serie serie02 = new Serie("Ruptura", 1, "Suspense");
        Serie serie03 = new Serie("How I met your mother", 9, "Comédia");

        List<Serie> minhasSeries = new ArrayList<>(){{
            add(serie01);
            add(serie02);
            add(serie03);
        }};
        System.out.println(minhasSeries);
//        Collections.shuffle(minhasSeries);
//        System.out.println(minhasSeries);
        Collections.sort(minhasSeries);
        System.out.println(minhasSeries);

    }
}

class Serie implements Comparable<Serie>{
    private String name;
    private Integer temporadas;
    private String genero;

    Serie(String name, Integer temporadas, String genero) {
        this.name = name;
        this.temporadas = temporadas;
        this.genero = genero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return  "name=" + name + "\n" + " temporadas= " + temporadas +
                "\ngenero=" + genero + "\n";
    }

    @Override
    public int compareTo(Serie serie) {
        return this.getName().compareToIgnoreCase(serie.getName());
    }
}