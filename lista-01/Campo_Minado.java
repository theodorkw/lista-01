import java.util.Arrays;
import java.util.Random;

public class Campo_Minado {

    public static void main(String[] args) {

        int contador;

        for (contador=0; contador<9; contador++) {

            char bomba_ou_tiro[] = {'.','*','.','.'};

            int numero_aleatorio = (int)(Math.random()*bomba_ou_tiro.length);

            int numero_aleatorio2 = (int)(Math.random()*bomba_ou_tiro.length);

            char bomba_aleatoria = bomba_ou_tiro[numero_aleatorio];

            char bomba_aleatoria2 = bomba_ou_tiro[numero_aleatorio2];

            char campo_minado[][] = {{bomba_aleatoria, bomba_aleatoria2, bomba_aleatoria, bomba_aleatoria2, bomba_aleatoria, bomba_aleatoria2, bomba_aleatoria, bomba_aleatoria2, bomba_aleatoria},{bomba_aleatoria2, bomba_aleatoria, bomba_aleatoria2, bomba_aleatoria, bomba_aleatoria2, bomba_aleatoria, bomba_aleatoria2, bomba_aleatoria, bomba_aleatoria2}};

            System.out.println(Arrays.deepToString(campo_minado));


            //esse codigo ajudou:
            //https://www.examtray.com/java/java-program-how-print-random-element-or-index-array-arraylist
        }
    }
}
