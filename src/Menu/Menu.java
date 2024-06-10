package Menu;

import Matriz.Matriz;
import Matriz.utils.Verify;

public class Menu {
    public  static void menu() {
        while (true) {

            System.out.println("******************WELCOME TO BUSCAMINAS***************");
            System.out.println("ENTER THE SIZE OF YOUT GAME");
             Matriz.crearMatriz(Verify.verify());
             Matriz.mostrarMatriz();

        }

    }
}
