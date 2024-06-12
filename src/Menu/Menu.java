package Menu;

import Game.game;
import Matriz.Matriz;
import Matriz.utils.Verify;

public class Menu {
    public static void menu() {
        boolean flag = true;
        while (flag) {

            System.out.println("******************WELCOME TO BUSCAMINAS***************");

            
            game.userAction(Matriz.detectMatrizGame(Matriz.createMatriz(Verify.verify())));

        }

    }
}
