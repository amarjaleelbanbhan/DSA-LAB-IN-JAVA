import java.util.Arrays;

public class Tasks {
    public void TaskI() {
        int a[] = {1, 2, 3, 6, 7, 2, 8, 9, 3, 10};
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        System.out.print(Arrays.toString(a));
    }

    public void TaskII(int oneD[], int twoD[][]) {
        int index = 0;
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                boolean found = false;
                for (int k = 0; k < index; k++) {
                    if (oneD[k] == twoD[i][j]) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    oneD[index] = twoD[i][j];
                    index++;
                }

                if (index == oneD.length) {
                    return;
                }
            }
        }

    }

    public void extractBoundaries(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;

        // Print first row
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[0][j] + " ");
        }
        System.out.println();

        // Print first column
        for (int i = 1; i < rows - 1; i++) {
            System.out.print(arr[i][0] + " ");
        }
        System.out.println();

        // Print last row
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[rows - 1][j] + " ");
        }
        System.out.println();

        // Print last column
        for (int i = 1; i < rows - 1; i++) {
            System.out.print(arr[i][cols - 1] + " ");
        }
        System.out.println();
    }

    public void cropCenterPart(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

