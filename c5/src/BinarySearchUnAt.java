import java.util.*;
public class BinarySearchUnAt {
    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here

        int mid;int left=0;int right=inputArr.length-1;
        int steps=0;
        while(left<=right){
            mid = left + (right - left)/2 ;
            if(inputArr[mid] == key){
                break;
            }
            else if (inputArr[mid] > key){
                right=mid-1;
                steps=steps+1; //unsuccesfull attempt increment 1
            }
            else{
                left=mid+1;
                steps=steps+1;//unsuccesfull attempt increment 1
            }
        }
        return steps; //return total unsuccessful steps for the code to reach key

    }
    public static void main(String[] args) {
        BinarySearchUnAt bs = new BinarySearchUnAt();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
    }
}
