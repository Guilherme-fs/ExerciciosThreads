//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int impar = 1;
        int par = 2;
        int vetor[] = new int[10000];
        for (int i = 0; i < 1000; i++) {
            vetor[i] =(int) (Math.random()*100)+1;
        }
        ThreadVetor tv1 = new ThreadVetor(impar, vetor);
        tv1.start();
        ThreadVetor tv2 = new ThreadVetor(par, vetor);
        tv2.start();

    }
}