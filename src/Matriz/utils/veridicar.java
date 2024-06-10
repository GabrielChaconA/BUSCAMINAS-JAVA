package Matriz.utils;

import utils.Ask;

public class veridicar {
    public static int verificar() {
        boolean flag = true;
        int i = 0, j = 0;
        while (flag) {
            i = Ask.forInt("Ingrese ancho:");
            j = Ask.forInt("Ingrese alto");
            flag = i == j ? false : true;
            String r = flag ? "ES SIMETRICA" : "NO ES SIMETRICA";
            System.out.println(r);
        }
        return i;

    }
}
