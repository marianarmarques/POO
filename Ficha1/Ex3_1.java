package Ficha1;
import java.util.Scanner;

public class Ex3_1 {
     
    public static int contaDias (int d, int m) {
        int dgeral=0, soma=0;

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
        
        return (d+soma);
    }


   

    public static void main (String [] args) {
        int resultado, d, m, a;

        Ex3_1 f = new Ex3_1();
        Scanner input = new Scanner (System.in);
        System.out.println ("Que dia, mês e ano quer?");
        d = input.nextInt();
        m = input.nextInt();
        a = input.nextInt();
        
        
        if ((a%4)==0 && (m==1 || m==2)) {
            resultado = (a-1900)*365 + ((a-1900)/4)-1 + (f.contaDias(d, m)) ;
        }
        else  resultado = (a-1900)*365 + (a-1900)/4 + (f.contaDias(d, m));
        
        resultado = (resultado%7);

        switch (resultado) {
            case 0: 
                System.out.println("O dia da semana é Domingo"); break;
            
            case 1:
                System.out.println("O dia da semana é Segunda-feira"); break;

            case 2:
                System.out.println("O dia da semana é Terça-feira"); break;

            case 3:
                System.out.println("O dia da semana é Quarta-feira"); break;
            
            case 4:
                System.out.println("O dia da semana é Quinta-feira"); break;

            case 5:
                System.out.println("O dia da semana é Sexta-feira"); break;
            
            case 6:
                System.out.println("O dia da semana é Sábado"); break;
        }
        input.close();
    }
}
