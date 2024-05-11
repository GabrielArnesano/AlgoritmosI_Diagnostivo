import java.util.ArrayList;
import java.util.List;

public class ListAnalyzer {

    public static int contadorImpares(List<Integer> numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                contador++;
            }
        }
        return contador;
    }

    // Método para obtener los números consecutivos en una lista
    public static List<Integer> numerosConsecutivos(List<Integer> numeros) {
        List<Integer> consecutivos = new ArrayList<>();
        if (numeros.size() <= 1) {
            return consecutivos; // Si la lista tiene 0 o 1 elemento, no hay números consecutivos
        }

        for (int i = 0; i < numeros.size() - 1; i++) {
            int numActual = numeros.get(i);
            int numSiguiente = numeros.get(i + 1);
            if (numSiguiente == numActual + 1) {
                consecutivos.add(numActual);
                consecutivos.add(numSiguiente);
            }
        }
        return consecutivos;
    }
}
