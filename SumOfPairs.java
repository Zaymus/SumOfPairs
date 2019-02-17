import java.util.*;

public class SumOfPairs
{
    static Scanner sc = new Scanner(System.in);
    static int[] nums;
    static int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
    static int inputVal;

    public static void main(String[] args)
    {
        while(true)
        {
            /*(System.out.println("\n\ninput the length of the list");
            nums = new int[sc.nextInt()];

            for(int i = 0; i < nums.length; i++)
            {
                System.out.println("value for index: " + (i + 1) + " out of: " + (nums.length));
                nums[i] = sc.nextInt();
            }//end of for*/

            System.out.println("input sum");
            inputVal = sc.nextInt();

            findSum(test, inputVal);
        }//end of while
    }//end of main

    public static void findSum(int[] a, int search)
    {
        int k = 1;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] + a[k] == search)
            {
                System.out.println(a[i] + " + " + a[k] + " = " + search);
                break;
            }//end of if
            else if (k < a.length)
            {
                k++;
            }//end of else if
            else
            {
                System.out.println("no sum found");
                break;
            }//end of else
        }//end of for
    }//end of findSum
}//end of class