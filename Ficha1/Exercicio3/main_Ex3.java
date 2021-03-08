package Ficha1;
import java.util.Scanner;

public class main_Ex3 {
    public static void main (String [] args) {

        Ex3 three = new Ex3();
        Scanner input = new Scanner (System.in);
        System.out.println ("Que exercício quer?");
        
        //Escolher o ex;
        int ex = input.nextInt();

        switch (ex) {
            case 0:
                System.out.println ("Exercício não encontrado.");
                break;
            case 1:
                System.out.println ("Insira um dia, mês e ano em formato dd mm aaaa.");
                int d = input.nextInt();
                int m = input.nextInt();
                int a = input.nextInt();
                int resultado = three.alinea_1(d, m, a);
                switch (resultado) {
                    case 0: 
                        System.out.println("O dia da semana é Domingo"); 
                        break;
                    
                    case 1:
                        System.out.println("O dia da semana é Segunda-feira"); 
                        break;
                
                    case 2:
                        System.out.println("O dia da semana é Terça-feira"); 
                        break;
                
                    case 3:
                        System.out.println("O dia da semana é Quarta-feira"); 
                        break;
                    
                    case 4:
                        System.out.println("O dia da semana é Quinta-feira"); 
                        break;
                
                    case 5:
                        System.out.println("O dia da semana é Sexta-feira"); 
                        break;
                    
                    case 6:
                        System.out.println("O dia da semana é Sábado"); 
                        break;
                }
                break;
            case 2 : case 3 : case 4 : case 5 : case 6 : case 7 :
                System.out.println("O exercício ainda não está feito."); 
                break;
                
        }        
        input.close();
    }
}
