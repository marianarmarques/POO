package Ficha1;
import java.util.Scanner;


public class Ex5_main {

    public static void main (String [] args) {

        Ex5_aux aux = new Ex5_aux();
        Scanner input = new Scanner(System.in);
        System.out.println("Que exercício quer?");

        //Escolher o ex
        int ex = input.nextInt();

        switch (ex) { 
            case 0:
                System.out.println ("Exercício não encontrado.");
                break;
            case 1:
                System.out.println("Insira a temperatura em graus.");
                double celsius = input.nextDouble();
                double farenheit = aux.celsiusParaFarenheit(celsius);
                System.out.println("O resultado da conversão é "+farenheit);
                break;
            case 2:
                System.out.println("Insira dois inteiros.");
                int i1 = input.nextInt();
                int i2 = input.nextInt();
                int maximo = aux.maximoNumeros(i1, i2);
                System.out.println(""+maximo);
                break;
            case 3:
                System.out.println("Insira um nome e um saldo.");
                String nome = input.next();
                double saldo = input.nextDouble();
                String impressao = aux.criaDescricaoConta(nome,saldo);
                System.out.println(""+impressao);
                break;

            case 4:
                System.out.println("Insira um valor em euros.");
                double euros= input.nextDouble();
                double taxaConversao = input.nextDouble();
                double libra = aux.eurosParaLibras(euros,taxaConversao);
                System.out.println("O valor da conversão é "+libra);
                break;
            
            case 5:
                System.out.println("Insira dois inteiros.");
                int i3 = input.nextInt();
                int i4 = input.nextInt();
                int minimo = Math.min(i3, i4);
                double media = (i3+i4)/2;
                if (minimo==i3) {
                    System.out.println("Ordem decrescente: "+i4+ ", "+i3+ " Média: "+media);
                }
                else System.out.println("Ordem decrescente: "+i3 +i4+ "Média: "+media);
                break;

            case 6:
                System.out.println("Insira um inteiro.");
                int num = input.nextInt();
                long fatorial = aux.fatorial(num);

                System.out.println("O fatorial do inteiro que inseriu é "+fatorial);
                break;
            case 7 :
                System.out.println("O exercício ainda não está feito."); 
                break;
                
        }
        input.close();
    }
}