package org.example.list;

import java.util.ArrayList;
import java.util.List;

//List notas = new ArrayList(); forma antiga de instanciar um array
//List<Double> notas = new ArrayList<>();  //Generics and Diamond Operator
//List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
//notas.add(10d);
//System.out.println(notas);


//Listas que NÂO aceitam adicionar ou remover elementos
//List<Double> notas =  Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); AbstractList
//List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); ImutableCollections
//notas.add(1d);
//notas.remove(5d);

public class List001 {
    public static void main(String[] args) {
        //Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        //Crie uma lista e adicione as sete notas
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas);
        System.out.println(notas.toString());

        //Exiba a posição da nota 5.0
        System.out.println("Posição da nota 5: " + notas.indexOf(5d));

        //Adicione na lista a nota 8.0 na posição 4
        notas.add(4, 8.0);
        System.out.println(notas);

        //Substitua a nota 5.0 pela nota 6.0
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        //Confira se a nota 5.0 está na lista
        System.out.println(notas.contains(5d));

        //Exiba todas as notas na ordem em que foram informadas
        for (Double nota: notas) {
            System.out.println(nota);
        }

    }


}
