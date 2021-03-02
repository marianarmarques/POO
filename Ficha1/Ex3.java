package Ficha1;
import java.util.Scanner;

public class Ex3 {
     
    public static int ex3_1 (int d, int m, int a) {
        int dgeral=0, soma=0, diasAno, resultado;

        // Contar os dias que já passaram no ano dado;
        for (int i=0, mtemp=m-1; i<12; i++, mtemp--) {
    
            switch (mtemp) {
                case 0 :
                    dgeral=0;
                    break;
                case 1: case 3: case 5: case 7 : case 8 : case 10 : case 12:
                    dgeral=31; 
                    break;
                case 2: 
                    dgeral=28; 
                    break;
                case 4: case 6 : case 9 : case 11 :
                    dgeral=30; 
                    break;
            } 
            soma = soma + dgeral;
        }
        diasAno= soma+d;

        if ((a%4)==0 && (m==1 || m==2)) {
            resultado = (a-1900)*365 + ((a-1900)/4)-1 + diasAno;
        }
        else  resultado = (a-1900)*365 + (a-1900)/4 + diasAno;
        
        return (resultado%7); 
    }

    

    public static void main (String [] args) {
        int ex;

        Scanner input = new Scanner (System.in);
        System.out.println ("Que exercício quer?");
        ex = input.nextInt();

        switch (ex) {
            case 0:
                System.out.println ("Exercício não encontrado.");
                break;
            case 1:
                System.out.println ("Insira um dia, mês e ano em formato dd mm aaaa.");
                int d = input.nextInt();
                int m = input.nextInt();
                int a = input.nextInt();
                int resultado = ex3_1(d, m, a);
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
            case 2 : case 3 : case 4 : case 5 : case 6 : case 7 :
                System.out.println("O exercício ainda não está feito."); 
                break;
                
        }        
        input.close();
    }
}
