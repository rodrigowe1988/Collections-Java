package org.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

        //Exiba a terceira nota adicionada
        System.out.println(notas.get(2));

        //Exiba a menor nota
        Double menorNota = Collections.min(notas);
        System.out.println("Menor nota: " + menorNota);

        //Exiba a maior nota
        Double maiorNota = Collections.max(notas);
        System.out.println("Maior nota: " + maiorNota);

        //Exiba a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma das notas é: " + soma);

        //Exiba a média das notas
        System.out.printf("A média das notas é: %.2f\n", soma/notas.size());

        //Remova a nota 0
        notas.remove(notas.indexOf(0d));
        System.out.println(notas);

        //Remova as notas menores que 7 e exiba a lista:
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()) {
            Double next = iterator2.next();
            if(next < 7) iterator2.remove();
        }
        System.out.println(notas);

        //Apague toda a lista
        notas.clear();
        System.out.println(notas);

        //Confira se a lista está vazia
        System.out.println("A lista está vazia" + notas.isEmpty());
    }


}
