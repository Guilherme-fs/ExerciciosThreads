public class Main {
    public static void main(String[] args) {

        int matriz[][] = new int [3][5];
        for (int i = 0; i <= 2; i++) {
            for (int x = 0; x <= 4; x++) {
                matriz[i][x] = (int) (Math.random()*10);
            }
        }

        for (int i = 0; i <= 2; i++) {
            for (int x = 0; x <= 4; x++) {
                System.out.print(matriz[i][x]);
            }
            System.out.print("\n");
        }

        for (int i = 0; i < 3; i++) {
            Thread sl = new SomarLinha(i, matriz[i]);
            sl.start();
        }
    }
}