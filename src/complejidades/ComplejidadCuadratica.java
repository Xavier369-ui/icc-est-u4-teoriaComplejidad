package complejidades;

public class ComplejidadCuadratica {

    /**
     * Complejidad: O(n²)
     * Razón: Ordenamiento burbuja utiliza dos bucles anidados.
     */
    public void ejemplo() {
        int[] numeros = {5, 3, 8, 1, 2};

        // Bubble Sort
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Arreglo ordenado (Burbuja):");
        for (int n : numeros) {
            System.out.println(n);
        }
        // Dos ciclos = n * n operaciones
    }
}
