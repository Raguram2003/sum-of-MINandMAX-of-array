import java.util.Scanner;

class Solution{
    public static int sumofminmax(int[] array)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            }
            if(array[i]<min)
            {
                min = array[i];
            }
        }
        return max+min;
    }
}
public class MinMaxSum
{
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array : ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the Element of the array : ");
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        Solution answer = new Solution();
        System.out.print("The Sum of Min and Max value is :");
        System.out.println(answer.sumofminmax(array));

    }
}
