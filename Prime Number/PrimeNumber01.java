/**
 * Find out prime numbers in a given range
 */

import java.util.*;
public class PrimeNumber01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startNumber = sc.nextInt();
        int endNumber = sc.nextInt();

        boolean flag = true;

        System.out.print("The prime Numbers are: ");

        for(int i=startNumber; i<=endNumber; i++){

            if(i <= 1){
                flag = false;
            }

            else if(i == 2){
                flag = true;
            }
            else{
                for(int j=2; j<=i/2; j++){
                    if(i%j == 0){
                        flag = false;
                        break;
                    }
                }
                
            }
            if(flag){
                System.out.print(i + " ");
            }

            flag = true;

        }
        sc.close();
    }
}