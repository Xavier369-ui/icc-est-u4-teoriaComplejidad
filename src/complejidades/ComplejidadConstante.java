package complejidades;

public class ComplejidadConstante {
    
    public void ejemplo(){
        // Este método siempre ejecuta las mismas instrucciones.
        // No usa bucles ni depende de listas o arreglos.
        // Por lo tanto, el tiempo de ejecución NO cambia aunque aumenten los datos.
        System.out.println("Ejemplo O(1) - Constante: ");
        int a = 5;
        int b = 10;
        int suma = a + b;
        System.out.println("Suma" + suma);
        /**
        * Complejidad: O(1)
        * Razón: No importa el tamaño de los datos,
        * la cantidad de operaciones siempre es la misma.
        */
    }
}
