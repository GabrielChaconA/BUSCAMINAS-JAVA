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