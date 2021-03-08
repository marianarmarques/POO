package Ficha2;
import java.util.Arrays;
import java.util.Scanner;


public class main_2 {
    
    public static void main(String args[]){
        int ex;
        Ex1 one = new Ex1();
        Scanner input = new Scanner(System.in);

        System.out.println("Que exercício quer?");
        ex = input.nextInt();

        switch (ex) {
        case 0: 
            System.out.println("Esse exercício não existe.");
            break;
        case 1: 

            int dim1, dim2;
            System.out.println ("Quantos elementos tem o primeiro vetor?");
            dim1 = input.nextInt();
            int [] vetor1 = new int [dim1];
            System.out.println ("Insira "+dim1+" numeros.");
            for (int i=0; i<dim1; i++) vetor1[i]= input.nextInt();

            System.out.println ("Quantos elementos tem o segundo vetor?");
            dim2 = input.nextInt();
            int [] vetor2 = new int [dim2];
            System.out.println ("Insira "+dim2+" numeros.");
            for (int i=0; i<dim2; i++) vetor2[i]= input.nextInt();
            System.out.println("\n");

            System.out.println("Alínea a)");
            int min_vetor1 = one.minimo(vetor1);
            int min_vetor2 = one.minimo(vetor2);
            System.out.println("O menor elemento do primeiro vetor é "+min_vetor1+" e do segundo vetor é "+min_vetor2+".");
            System.out.println("\n");

            System.out.println("Alínea b)");
            System.out.println("Insira o 1º e 2º índice.");
            int i1 = input.nextInt();
            int i2 = input.nextInt();
            int [] entre1 = one.valoresEntre(vetor1, i1, i2);
            int [] entre2 = one.valoresEntre(vetor2, i1, i2);
            System.out.println ("Vetor resultado do primeiro vetor: " +Arrays.toString(entre1));
            System.out.println ("Vetor resultado do segundo vetor: " +Arrays.toString(entre2));
            System.out.println("\n");

            System.out.println("Alínea c)");
            int [] comuns = one.comuns(vetor1, vetor2);
            System.out.println ("Vetor resultado: " +Arrays.toString(comuns));
            break;
        }

        input.close();    
    }
}
