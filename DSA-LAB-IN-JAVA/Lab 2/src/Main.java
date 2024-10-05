//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TaskIII myList = new TaskIII();
        myList.add(5);
        myList.add(10);
        myList.add(15);


        System.out.println("Size of the list: " + myList.size());
        System.out.println("Is the list empty? " + myList.isEmpty());
    }
}