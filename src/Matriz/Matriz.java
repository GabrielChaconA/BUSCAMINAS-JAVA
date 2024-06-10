package Matriz;

import java.util.Random;

public class Matriz {
    private static Random ran = new Random();
    private static String matriz[][];
    private static int contador = 0;

    public static String[][] createMatriz(int i) {
        matriz = new String[i][i];

        for (int j2 = 0; j2 < matriz.length; j2++) {
            for (int k = 0; k < matriz[j2].length; k++) {
                int random = ran.nextInt(i);
                matriz[j2][k] = k == random || k == random / 2 ? "*" : " ";
                contador = matriz[j2][k].equals("*") ? contador + 1 : contador;

            }

        }
        return matriz;
    }

    public static void mostrarMatriz() {

        System.out.println("BOMBS: " + contador);
        for (int j2 = 0; j2 < matriz.length; j2++) {
            for (int k = 0; k < matriz[j2].length; k++) {
                System.out.print(String.format(" [%s] ", matriz[j2][k]));
            }
            System.out.println();

        }

    }

    public static void counterMatriz(String[][] matriz) {
        int contador = 0;
        for (int j2 = 0; j2 < matriz.length; j2++) {
            for (int k = 0; k < matriz[j2].length; k++) {
                contador = matriz[j2][k].equals("*") ? contador++ : contador;
            }

        }

    }

}
