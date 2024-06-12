package Game;

import Matriz.Matriz;
import utils.Ask;

public class game {
    public static void userAction(String[][] matriz) {
        Matriz.mostrarMatriz();
        System.out.println("CHOOSE A SQUARE OF THE MAP(0,0)");
        String x = Ask.forString("VALUE X");
        String y = Ask.forString("VALUE Y");
        showGameParts(matriz, Integer.parseInt(x), Integer.parseInt(y));

    }

    public static void showGameParts(String[][] matriz, int j2, int k) {
        int contador = 0;
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[j].length; i++) {
                String respuesta = " ";

                if (j2 < matriz.length - 1) {
                    respuesta = contador < 4 ? matriz[j][i] : " ";

                }
                if (k < matriz.length - 1 && j2 < matriz.length - 1) {
                    respuesta = contador < 4 ? matriz[j][i] : "  ";

                    // System.out.print());

                }
                if (j2 < matriz.length - 1 && k > 0) {
                    respuesta = contador < 4 ? matriz[j][i] : " ";

                    // System.out.print());

                }
                if (j2 > 0 && k < matriz.length - 1) {
                    respuesta = contador < 4 ? matriz[j][i] : " ";

                    // System.out.print());

                }
                if (j2 > 0 && k > 0) {
                    respuesta = contador < 4 ? matriz[j][i] : " ";

                    // System.out.print(String.format("[ %s ]",));

                }
                if (j2 > 0) {
                    respuesta = contador < 4 ? matriz[j][i] : " ";

                    // System.out.print(String.format("[ %s ]",));

                }
                if (k < matriz.length - 1) {
                    respuesta = contador < 4 ? matriz[j][i] : " ";

                    // System.out.print());

                }
                if (k > 0) {
                    respuesta = contador < 4 ? matriz[j][i] : " ";

                    // System.out.print(String.format("[ %s ]",));

                }
                String respuestaF = respuesta.equals("*")? String.format("[ %s ]", " "):String.format("[ %s ]", respuesta);
               System.out.print(respuestaF);

            }
            System.out.println();
            contador++;

        }

    }

}
