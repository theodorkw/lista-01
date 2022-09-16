import java.io.*;
import java.util.*;

public class Detectando_Minas {

    public static void main(String[] args) {

        String Campo_Minado = "teste.txt";

        try {
            Scanner scan = new Scanner(new File(Campo_Minado));

            while (scan.hasNextLine()) {
                String linha_minada = scan.nextLine();
                System.out.println(linha_minada);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

