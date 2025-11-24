package complejidades;

public class ComplejidadLineal {


    /**
     * Complejidad: O(n)
     * Razón: Búsqueda secuencial que recorre todo el arreglo
     * hasta encontrar el valor.
     */
    public void ejemplo() {
        int[] numeros = {4, 7, 2, 9, 1, 5};
        int buscar = 9;

        // Búsqueda lineal: revisa uno por uno
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                System.out.println("Número encontrado en la posición: " + i);
                break;
            }
        }
        // Si hay n elementos, el ciclo puede ejecutarse hasta n veces
    }
}
