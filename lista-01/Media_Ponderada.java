public class Media_Ponderada {

    public static void main(String[] args) {
        double Projeto_pratico_1, Projeto_pratico_2;
        double Lista_de_Exercicio_1, Lista_de_Exercicio_2, Lista_de_Exercicio_3, Lista_de_Exercicio_4, Lista_de_Exercicio_5;
        double Media_Ponderada, Media_Geometrica, Media_Final;

        double W1, W2;

        W1 = 2;
        W2 = 4;

        Projeto_pratico_1 = Double.parseDouble(args[0]);
        Projeto_pratico_2 = Double.parseDouble(args[1]);

        Lista_de_Exercicio_1 = Double.parseDouble(args[2]);
        Lista_de_Exercicio_2 = Double.parseDouble(args[3]);
        Lista_de_Exercicio_3 = Double.parseDouble(args[4]);
        Lista_de_Exercicio_4 = Double.parseDouble(args[5]);
        Lista_de_Exercicio_5 = Double.parseDouble(args[6]);


        Media_Ponderada = ((Projeto_pratico_1*W1+Projeto_pratico_2*W2)/(W1+W2));
        Media_Geometrica = Math.pow(Lista_de_Exercicio_1*Lista_de_Exercicio_2*Lista_de_Exercicio_3*Lista_de_Exercicio_4*Lista_de_Exercicio_5, 1.0/5);
        Media_Final = Media_Ponderada *0.9 + (Math.pow(Media_Geometrica,1/5))*0.1;


        if (Media_Final > 6) {
            System.out.println("Aluno APROVADO com média: " +Media_Final);

        } else {
            System.out.println("Aluno REPROVADO com média: " +Media_Final);
        }
    }
}
