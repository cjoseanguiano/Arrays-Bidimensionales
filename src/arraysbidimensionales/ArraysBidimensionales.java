/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysbidimensionales;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author carlosjoseanguiano
 */
public class ArraysBidimensionales {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        final int numAlumnos = 5;
        int contador;
        int nota;
        ArrayList<ArrayList<Integer>> miarray = new ArrayList<ArrayList<Integer>>();

        System.out.println("Introdusca notas < 0 para acabar");

        for (int i = 0; i < numAlumnos; i++) {
            contador = 1;

            System.out.println("Alumno " + (i + 1) + " : ");
            System.out.println("Nota " + contador + ":");
            nota = entrada.nextInt();

            miarray.add(new ArrayList<Integer>());

            while (nota >= 0) {
//                miarray.get(nota);
                miarray.get(i).add(nota);
                contador++;
                System.out.println("Nota " + contador + ":");
                nota = entrada.nextInt();
            }
        }

        System.out.println("Mostrar todas las notas");
        for (int i = 0; i < miarray.size(); i++) {
            System.out.println("Alumno " + i + ":");
            for (int j = 0; j < miarray.get(i).size(); j++) {
                System.out.println(miarray.get(i).get(j) + " ");
            }
        }
        System.out.println();
    }

}
