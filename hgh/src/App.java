public class App {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6}; // Arreglo de ejemplo
        System.out.println("Arreglo Original:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    
        insertionSort(arr); // Llamada al método de ordenamiento por inserción
    
        System.out.println("Arreglo Ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
    
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    
}
