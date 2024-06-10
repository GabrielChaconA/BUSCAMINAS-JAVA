package Matriz;

public class Matriz {
    private static String matriz[][];

    public Matriz() {
    }

    public static String[][] crearMatriz(int i) {
        matriz = new String[i][i];
        for (int j2 = 0; j2 < matriz.length; j2++) {
            for (int k = 0; k < matriz[j2].length; k++) {
                matriz[j2][k] = " ";

            }

        }
        return matriz;
    }

    public static void mostrarMatriz() {
        for (int j2 = 0; j2 < matriz.length; j2++) {
            for (int k = 0; k < matriz[j2].length; k++) {
                System.out.print(String.format(" [%s] ", matriz[j2][k]));

            }
            System.out.println();

        }

    }

    public static void modifyMatriz() {

    }
}
