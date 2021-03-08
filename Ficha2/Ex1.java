package Ficha2;

public class Ex1 {
    
    //a)
    public int minimo (int[] a){
        int min = a[0];
        for (int i=0; i<a.length; i++) {
            if (min>a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    //b)
    public int[] valoresEntre (int[] a, int i1, int i2){
        if (i1>i2 || i2>=a.length) return null;

        int size = i2-i1+1;
        int res[] = new int[size];
        System.arraycopy(a, i1, res, 0, size);
        return res;
    }

    //c)
    public int[] comuns (int[] a, int[] b){

        int res[] = new int[a.length*b.length];
        int ind=0; //tamanho do res[];

        for (int i=0; i<a.length; i++) {
            for (int j=0; j<b.length; j++) {
                
                if(a[i]==b[j]) {
                    boolean found = false;
                    for (int r=0; r<ind && !found; r++) {
                        if (res[r]==a[i]) found = true; //O elemento é repetido, já está no res[];
                    }
                    if (!found) {
                        res[ind] = a[i];
                        ind++;
                    }
                }

            }
        }
        int [] resultado = new int [ind];
        System.arraycopy(res, 0, resultado, 0, ind);
        return resultado;
    } 
}
