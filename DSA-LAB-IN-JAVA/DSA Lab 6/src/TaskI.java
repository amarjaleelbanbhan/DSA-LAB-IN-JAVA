//1. Implement selection sort and insertion sort.
public class TaskI {
    public void selection(int [] arr) {
        for(int i = 0; i<arr.length -1;i++){
            int minindex = i;
            for(int j = i + 1 ; j< arr.length  ; j++){
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                    
                }
            }
            if (minindex != i) {
                int temp  = arr[i];
                arr[i] = arr[minindex];
                arr[minindex] = temp;
            }

        }
    }
    public void insertion(int [] arr) {
    for(int i = 1; i < arr.length; i++){
        int key = arr[i];
        int j = i - 1;
        while(j >= 0 && arr[j] > key){
            arr[j + 1] = arr[j];
            j = j -1;
        }
        arr[j + 1] = key;
    }
    }

    public boolean TwoSum(int[] arr, int k){
        insertion(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left<=right) {
            int sum = arr[left] + arr[right];

            if (sum == k) {
                return true;
            } else if (sum < k){
                left++;
            } else {
                right--;
            }
            
        }
        return  false;

    }
    



}
