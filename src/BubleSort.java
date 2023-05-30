import java.util.Arrays;

public class BubleSort {

    public static void main(String ...args) {
        int [] numeros = {4, 8, 2,23, 12, 49, 94, 1};
        System.out.println(Arrays.toString(ordenar(numeros)));
    }

    private static int[] ordenar (int[] n) {
        int bkp;
        for (var x = n.length -1; x >= 1; x--) {
            var mudou = false; // Objetivo de mapear a necessidade de trocar as posicoes.
            for (var y = 0; y < x; y ++) {
               if (n[y] > n[y+1]) {
                   mudou = true;
                   bkp = n[y];
                   n[y] = n[y+1];
                   n[y+1] = bkp;
               }
            }
            if (!mudou) break;
        }
        return n;
    }
}
