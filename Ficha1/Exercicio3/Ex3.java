package Ficha1;

public class Ex3 {
     
    public int alinea_1 (int d, int m, int a) {
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
}
