public class ThreadVetor extends Thread {

    private int numero;
    private int vetor[];

    public ThreadVetor(int nuemro, int vetor[]){
        this.numero = nuemro;
        this.vetor = vetor;
    }
    @Override
    public void run() {
        if ((numero % 2) == 0) {
            long inicio = System.nanoTime();
            for (int i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);
            }
            long fim = System.nanoTime();
            double tempoEmSegundos = (fim - inicio) / 1000000000.0;
            System.out.println("Tempo para percorrer for: " + tempoEmSegundos + "s");
        } else if ((numero % 2) == 1) {
            long inicio = System.nanoTime();
            int x=0;
            for (int num : vetor) {
                System.out.println(x);
                x++;
            }
            long fim = System.nanoTime();
            double tempoEmSegundos = (fim - inicio) / 1000000000.0;
            System.out.println("Tempo para percorrer foreach: " + tempoEmSegundos + "s");
        } else {
            System.out.println("Você informou um número que não devia");
        }

    }
}
