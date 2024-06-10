package Matriz;

public class Matriz {
    private static String matriz[][];

    public Matriz() {
    }

    public static void crearMatriz(int i) {
        matriz = new String[i][i];
        for (int j2 = 0; j2 < matriz.length; j2++) {
            for (int k = 0; k < matriz.length; k++) {
                matriz[j2][k] = " ";

            }

        }
    }

    public static void mostrarMatriz() {
        for (int j2 = 0; j2 < matriz.length; j2++) {
            for (int k = 0; k < matriz.length; k++) {
                System.out.println(String.format("[ %s ]", matriz[j2][k]));

            }

        }

    }
}
