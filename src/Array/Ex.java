package Array;

import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {

        float[] media = new float[4]; // Apenas um colchete porque media é um vetor, array com apenas uma dimensão
        float n1, n2, n3, somaMedia = 0, mediaGeral;
        int i;

        Scanner Leia = new Scanner(System.in);

        for (i = 0; i < 4; i++) {
            System.out.println("\nInsira a primeira nota do aluno número " + (i + 1) + " :"); // sysout + ctrl + espaço
                                                                                                // = print
            n1 = Leia.nextFloat();
            System.out.println("\nInsira a segunda nota do aluno número " + (i + 1) + ":");
            n2 = Leia.nextFloat();
            System.out.println("\nInsira com a terceira nota do aluno número " + (i + 1) + ":");
            n3 = Leia.nextFloat();

            media[i] = (n1 + n2 + n3) / 3;
            System.out.println("\nMédia: " + media[i]);
            somaMedia += media[i];
        }
        mediaGeral = somaMedia / 4;
        System.out.printf("\nA média geral da turma é de %.2f", mediaGeral);

        for (i = 0; i < 4; i++) {
            System.out.println("\nMedia do aluno" + (i + 1) + "foi de:" + media[i]);
        }
    }

}