package Ficha1.Exercicio5;


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
}
