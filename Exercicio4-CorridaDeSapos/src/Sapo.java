public class Sapo extends Thread{

    private int id;
    private int tamanhoMaximoDoPuloEmMetros;
    private int distanciaMaximaParaPercorrer;
    private int salto;
    private int distanciaPercorrida;
    private static int colocacao=0;

    public Sapo(int tamanhoMaximoDoPuloEmMetros, int distanciaMaximaParaPercorrer, int id){
        this.tamanhoMaximoDoPuloEmMetros = tamanhoMaximoDoPuloEmMetros;
        this.distanciaMaximaParaPercorrer = distanciaMaximaParaPercorrer;
        this.id = id;
    }

    @Override
    public void run() {
        while (distanciaPercorrida<distanciaMaximaParaPercorrer){
            salto = (int) (Math.random() * (tamanhoMaximoDoPuloEmMetros+1));
            distanciaPercorrida+=salto;
            System.out.println("O sapo " +id+ " saltou "+salto+"metros e já percorreu "+distanciaPercorrida+" metros");
        }
        colocacao++;
        System.out.println("O sapo " +id+ " foi o "+colocacao+"° a chegar");

    }
}
