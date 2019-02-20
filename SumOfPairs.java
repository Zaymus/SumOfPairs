import java.util.*;

public class SumOfPairs
{
    static Scanner sc = new Scanner(System.in);
    static int[] nums;
    static int[][] multiples = new int[500][500];
    static int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
    static int inputVal, k = 1, j, x, c = 0;
    static float y;

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

    public static String getMultiples()
    {
        String val = "";
        for(int i = c; i < inputVal / 2; i++)
        {
            c = i;
            if((inputVal / i) == (int)(inputVal / i))
            {
                val =  inputVal / i + "" + i;
                return val;
            }//end of if
        }//end of for
        return val;
    }//end of getMultiple

    public static void findSum(int[] a, int search)
    {
        
        for(int i = 0; i < multiples.length; i++)
        {
            if()
            {

            }//end of if
        }//end of for
    }//end of findSum
}//end of class