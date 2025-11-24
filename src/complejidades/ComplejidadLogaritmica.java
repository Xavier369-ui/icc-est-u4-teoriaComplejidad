package complejidades;

public class ComplejidadLogaritmica {

    /**
     * Complejidad: O(log n)
     * Razón: La búsqueda binaria divide el problema a la mitad en cada paso.
     */
    public void ejemplo() {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        int buscar = 6;

        int inicio = 0;
        int fin = numeros.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (numeros[medio] == buscar) {
                System.out.println("Encontrado en la posición: " + medio);
                break;
            }

            if (numeros[medio] < buscar) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        // Cada iteración reduce el rango a la mitad
    }
    
}
