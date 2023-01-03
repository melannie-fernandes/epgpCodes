import java.util.*;
public class LinearSearchPel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declare the array here
        int array[];
        //Take the size of the array as an input from the user.
        int count = input.nextInt();
        array= new int[count];
        for (int i = 0; i < count; i++) {
            //The elements of the array as an input from the user.
            array[i] = input.nextInt();
        }
        int key = input.nextInt();
        input.close();
        //The key you are searching for, as an input from the user.
        //write your code here
        //Given an array of non-negative integers, write a code to search the position of an element in the array in the reverse order.
        // Do not print anything when the element is not present in the given array.
        //Also, if the key is repeated, print the index where the key is appearing for the first time in reverse order
        //Sample Input://7//6 8 3 5 9 1 2//9//Sample Output://2
        //Here the output is 2 because the position of number 9 is 2 from the reverse order as mentioned in the question.
        for (int i = count-1; i >= 0; i--) {
            if (array[i] == key) {
                System.out.println(count-i-1);
            }
        }
    }
}

