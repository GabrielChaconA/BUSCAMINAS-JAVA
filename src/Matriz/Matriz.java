package Matriz;

import java.util.Random;

public class Matriz {
    private static Random ran = new Random();
    public static String matriz[][];
    public static int contador = 0;

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
                System.out.print( String.format("[ %s ]", " "));
            }
            System.out.println();

        }

    }

    public static String[][]  detectMatrizGame(String[][] matriz) {
        int contadorPiriot = 0;
        for (int j2 = 0; j2 < matriz.length; j2++) {
            for (int k = 0; k < matriz[j2].length; k++) {
                // If the matrix is differente than * should be a number or a blanck space
                boolean flag = false;
                flag = matriz[j2][k].equals("*") ? false : true;

                if (flag) {

                    if (j2 < matriz.length - 1) {
                        contadorPiriot = matriz[j2 + 1][k].equals("*") ? contadorPiriot + 1 : contadorPiriot;
                    }
                    if (k < matriz.length - 1 && j2 < matriz.length - 1) {
                        contadorPiriot = matriz[j2 + 1][k + 1].equals("*") ? contadorPiriot + 1 : contadorPiriot;
                    }
                    if (j2 < matriz.length - 1 && k > 0) {
                        contadorPiriot = matriz[j2 + 1][k - 1].equals("*") ? contadorPiriot + 1 : contadorPiriot;
                    }
                    if (j2 > 0 && k < matriz.length - 1) {
                        contadorPiriot = matriz[j2 - 1][k + 1].equals("*") ? contadorPiriot + 1 : contadorPiriot;
                    }
                    if (j2 > 0 && k > 0) {
                        contadorPiriot = matriz[j2 - 1][k - 1].equals("*") ? contadorPiriot + 1 : contadorPiriot;
                    }
                    if (j2 > 0) {
                        contadorPiriot = matriz[j2 - 1][k].equals("*") ? contadorPiriot + 1
                                : contadorPiriot;
                    }
                    if (k < matriz.length - 1) {
                        contadorPiriot = matriz[j2][k + 1].equals("*") ? contadorPiriot + 1
                                : contadorPiriot;
                    }
                    if (k > 0) {
                        contadorPiriot = matriz[j2][k - 1].equals("*") ? contadorPiriot + 1
                                : contadorPiriot;
                    }
                    matriz[j2][k] = contadorPiriot > 0 ? String.valueOf(contadorPiriot) : " ";
                    contadorPiriot = 0;


                }

            }

        }
        return matriz;

    }

}
