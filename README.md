# GABRIEL CHACON ARELLANO
## Juego Buscaminas
Incorporated the new methods into class verify, changed the class name, and changed the array size values
```java
public class Verify {
    public static int verify() {
        boolean flag = true;
        int i = 0;
        String difficult = "";
        while (flag) {
            int option = Ask.forInt("*DIFICULTY*\n(1)EASY \n(2)MEDIUM\n(3)HARD\n");
            switch (option) {
                case 1 -> {
                    difficult = "EASY";
                    i = 10;
                }
                case 2 -> {
                    difficult = "MEDIUM";
                    i = 19;
                }
                case 3 -> {
                    difficult = "HARD";
                    i = 25;
                }
            }

            flag = option > 3 ? true : false;
            String r = flag ? "DIFFICUL:" + difficult : "THERES IS NOT AN OPTION";
            System.out.println(r);
        }
        return i;

    }
}

```
Then i incorporated the bombs into the matrix, and added a counter to know the bombs numer
```java
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



```