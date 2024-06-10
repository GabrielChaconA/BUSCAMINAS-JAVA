package Matriz.utils;
import utils.Ask;

public class Verify {
    public static int verify() {
        boolean flag = true;
        int i = 0, j = 0;
        while (flag) {
            System.out.println("*VALUES BIGGERS THAN 3*");
            i = Ask.forInt("Ingrese ancho");
            j = Ask.forInt("Ingrese alto");
            flag = i != j || i < 3? true : false;
            String r = flag ? "ES SIMETRICA" : "NO ES SIMETRICA/ IS TO SMALL";
            System.out.println(r);
        }
        return i;

    }
}
