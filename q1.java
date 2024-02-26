
package techhaus;

import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
           Scanner scan = new Scanner(System.in);
           int a = scan.nextInt();
           System.out.println(a+" has "+NumOfDigits(a)+" number of digits.");
    }
    public static int NumOfDigits(int num)
    {
        int count = 0;
        while(num!=0)
        {
            num = num/10;
            count++;
        }
        return count;
    }
}
