class Sorting {

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        int[] array2 = {65, 35, 22, 12, 71};
        System.out.println("Original array:");
        printArray(array);

        insertionSort(array);

        System.out.println("\nSorted array with insertion sort:");
        printArray(array);

        System.out.println("\nOriginal array:");
        printArray(array2);

        selectionSort(array2);

        System.out.println("\nSorted array with selection sort:");
        printArray(array2);
    }
}