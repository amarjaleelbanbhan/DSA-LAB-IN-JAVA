public class App {
    public static void main(String[] args) throws Exception {
        TaskI I = new TaskI();
        int arr[] = {4,2,5,3,9,0,1};
        System.out.print("{");
        
        for (int j : arr) {
            System.out.print(j+", ");
        }
        System.out.println("}");
        I.selection(arr);
        System.out.print("{");
        for (int j : arr) {
            System.out.print(j+", ");
        }
        System.out.println("}");
        int a[] = {4,2,5,3,9,0,1};
        System.out.print("{");
        for (int j : a) {
            System.out.print(j+", ");
        }
        System.out.println("}");
        I.insertion(a);
        System.out.print("{");
        for (int j : a) {
            System.out.print(j+", ");
        }
        System.out.println("}");

        boolean f = I.TwoSum(arr, 12);
        System.out.println(f);

    }
}
