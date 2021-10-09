import java.util.Scanner;

public class Palindrome01{
    public static void main(String[] args) {

        int sum = 0, i = -1, remainder=0;
        
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int tempNumber = number;

        while(tempNumber!=0){
            tempNumber/=10;
            i++;
        }
        //System.out.println(i);

        tempNumber = number;
        
        while(tempNumber != 0){
            remainder = tempNumber%10;
            sum = sum + (int)(remainder * Math.pow(10, i));
            tempNumber /= 10;
            i--;
        }
        
        System.out.println(sum);

        if(number == sum)System.out.println("The number is a palindrome");
        else System.out.println("The number is not a palindrome");
        sc.close();
    }
}