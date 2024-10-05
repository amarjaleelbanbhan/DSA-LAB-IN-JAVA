//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Tasks test = new Tasks();
    test.TaskI();
        System.out.println();
        int oneD[]= new int[20];
        int twoD[][]= {{1,4,5,7,3},
                {6,9,8,10,31},
                {12,3,5,10,14},
                {11,41,51,71,13}};
        test.TaskII(oneD,twoD);
        for (int i = 0; i < oneD.length; i++) {
            System.out.print(oneD[i] + " ");
        }
        System.out.println();
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Boundaries:");
        test.extractBoundaries(arr);

        System.out.println("Center Part:");
        test.cropCenterPart(arr);

    }
}