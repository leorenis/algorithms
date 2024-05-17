package letcode.easy;
import java.util.HashMap;

public class TwoSum {

    public static void main (String[] args) {
        int alvo = 13;
        int pivo = 0;
        int[] elementos = {2,7,11,15};
        var dicionario = new HashMap<Integer, Integer>();
        while (pivo < elementos.length) {
            dicionario.put(elementos[pivo], pivo);
            var elemento = dicionario.get(alvo - elementos[pivo]);
            if (elemento != null && pivo != elemento) {
                System.out.printf("Alvos: %d e %d", elemento, pivo);
                break;
            }
            pivo++;
        }
    }
}
