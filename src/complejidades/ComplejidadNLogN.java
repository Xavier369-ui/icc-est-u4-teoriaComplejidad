package complejidades;


public class ComplejidadNLogN {

    /**
     * Complejidad: O(n log n)
     * Razón: Merge Sort divide el arreglo y luego lo combina ordenadamente.
     */
    public void ejemplo() {
        int[] numeros = {9, 3, 7, 5, 2, 8, 1};
        mergeSort(numeros, 0, numeros.length - 1);

        System.out.println("Arreglo ordenado (Merge Sort):");
        for (int n : numeros) {
            System.out.println(n);
        }
    }

    private void mergeSort(int[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;

            mergeSort(arr, izquierda, medio);
            mergeSort(arr, medio + 1, derecha);

            merge(arr, izquierda, medio, derecha);
        }
    }

    private void merge(int[] arr, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[izquierda + i];
        for (int j = 0; j < n2; j++) R[j] = arr[medio + 1 + j];

        int i = 0, j = 0, k = izquierda;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // Este algoritmo combina división (log n) con recorrido (n)
    // Por eso su complejidad total es O(n log n)

   
    
}
