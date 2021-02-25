package Ficha1;
import java.util.Scanner;
import java.lang.*;



public class Ex5 {

    //1
    public double celsiusParaFarenheit (double celsius) {
        
        return(1.8*celsius+32);
    }

    //2
    public int maximoNumeros (int i1, int i2) {

        return (Math.max(i1,i2));
    }

    //3
    public String criaDescricaoConta (String nome, double saldo) {

        return ("NOME: "+nome+ ", SALDO: "+saldo);
    }

    //4
    public double eurosParaLibras (double euros, double taxaConversao) {
        taxaConversao = 0.860715;
        return (euros*taxaConversao);
    }

    //6
    public long fatorial (int num) {
        long f=1;
        for (int i=1; i<=num; i++) {
            f=f*i;
        }
        return f;
    }


    public static void main (String [] args) {

        Ex5 f = new Ex5 ();
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
                double farenheit = f.celsiusParaFarenheit(celsius);
                System.out.println("O resultado da conversão é "+farenheit);
                break;
            case 2:
                System.out.println("Insira dois inteiros.");
                int i1 = input.nextInt();
                int i2 = input.nextInt();
                int maximo = f.maximoNumeros(i1, i2);
                System.out.println(""+maximo);
                break;
            case 3:
                System.out.println("Insira um nome e um saldo.");
                String nome = input.next();
                double saldo = input.nextDouble();
                String impressao = f.criaDescricaoConta(nome,saldo);
                System.out.println(""+impressao);
                break;

            case 4:
                System.out.println("Insira um valor em euros.");
                double euros= input.nextDouble();
                double taxaConversao = input.nextDouble();
                double libra = f.eurosParaLibras(euros,taxaConversao);
                System.out.println("O valor da conversão é "+libra);
                break;
            
            case 5:
                System.out.println("Insira dois inteiros.");
                int i3 = input.nextInt();
                int i4 = input.nextInt();
                int minimo = Math.min(i3, i4);
                long media = (i3+i4)/2;
                if (minimo==i3) {
                    System.out.println("Ordem decrescente: "+i4+ ", "+i3+ " Média: "+media);
                }
                else System.out.println("Ordem decrescente: "+i3 +i4+ "Média: "+media);
                break;

            case 6:
                System.out.println("Insira um inteiro.");
                int num = input.nextInt();
                long fatorial = f.fatorial(num);

                System.out.println("O fatorial do inteiro que inseriu é "+fatorial);
                break;
        }
        input.close();
    }
}