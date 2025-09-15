//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int tamanhoMaximoDoPuloEmMetros = 4;
        int distanciaMaximaParaPercorrer= 100;
        for (int id = 1; id <= 4; id++) {
            Thread s = new Sapo(tamanhoMaximoDoPuloEmMetros, distanciaMaximaParaPercorrer, id);
            s.start();
        }
    }
}