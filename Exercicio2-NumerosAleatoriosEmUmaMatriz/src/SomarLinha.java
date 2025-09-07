public class SomarLinha extends Thread {

    private int linha;
    private int vetor[];

    public SomarLinha(int linha, int[] vetor){
        this.linha = linha;
        this.vetor = vetor;
    }

    private int somaLinha(){
        int somar = 0;
        for(int x=0; x<5; x++){
            somar = somar + vetor[x];
        }
        return somar;
    }

    @Override
    public void run() {
        System.out.println("Linha: "+(linha+1)+"\nSoma da Linha: "+somaLinha()+"\n");
    }
}
