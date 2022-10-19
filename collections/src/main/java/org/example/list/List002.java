package org.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        Serie serie01 = new Serie(7L,"Arcane", 1, "Animação");
        Serie serie02 = new Serie(2L, "Ruptura", 1, "Suspense");
        Serie serie03 = new Serie(3L, "How I met your mother", 9, "Drama");
        Serie serie04 = new Serie(3L, "How I met your mother", 6, "Comédia");

        List<Serie> minhasSeries = new ArrayList<>(){{
            add(serie01);
            add(serie02);
            add(serie03);
            add(serie04);
        }};
        System.out.println(minhasSeries);
//        Collections.shuffle(minhasSeries);
//        System.out.println(minhasSeries);
        //Comparator por ID
        Collections.sort(minhasSeries, new ComparatorId());
        System.out.println(minhasSeries);

        //Comparator por Nome
        minhasSeries.sort(new ComparatorNome());
        System.out.println(minhasSeries);

        //Comparator id/nome/temporadas/genero
        minhasSeries.sort(new ComparatorIdNomeTempGenero());
        System.out.println(minhasSeries);
    }
}

class Serie implements Comparable<Serie>{
    private Long id;
    private String name;
    private Integer temporadas;
    private String genero;

    Serie(Long id, String name, Integer temporadas, String genero) {
        this.id = id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

class ComparatorId implements Comparator<Serie> {
    @Override
    public int compare(Serie serie1, Serie serie2) {
        return Long.compare(serie1.getId(), serie2.getId());
    }
}

class ComparatorNome implements Comparator<Serie> {
    @Override
    public int compare(Serie serie1, Serie serie2) {
        return serie1.getName().compareToIgnoreCase(serie2.getName());
    }
}

class ComparatorIdNomeTempGenero implements Comparator<Serie> {
    @Override
    public int compare(Serie serie1, Serie serie2) {
        int id = Long.compare(serie1.getId(), serie2.getId());
        if(id != 0) return id;

        int name = serie1.getName().compareToIgnoreCase(serie2.getName());
        if (name != 0) return name;

        int temporadas = Integer.compare(serie1.getTemporadas(), serie2.getTemporadas());
        if(temporadas != 0) return temporadas;

        return serie1.getGenero().compareToIgnoreCase(serie2.getGenero());
    }
}