import java.util.*;

public class BitMasking{
    public static void main(String[] args) {
        //Get Bit
        /*
        int number = 5; //0101
        int position = 2;
        
        int bitMask = 1<<position; 

        if((bitMask & number) == 0){
            System.out.println("Bit is zero");
        }else{
            System.out.println("Bit is one");
        }
        */

        //Set Bit
        /*
        int number = 5; //0101
        int position = 3;
        int bitMask = 1<<position;

        int newNumber = bitMask | number;

        System.out.println(newNumber);
        */

        //Clear Bit
        /*
        int number = 5;
        int position = 0;
        int bitMask = 1<<position;

        int notBitMask = ~bitMask;
        int newNumber = notBitMask & number;

        System.out.println(newNumber);
        */

        //Update Bit

        int number = 5;//0101
        Scanner input = new Scanner(System.in);
        int position = input.nextInt();

        int bitMask = 1<<position;

        if((bitMask & number) == 0){
            //Set Bit
            int newNumber = bitMask | number;
            System.out.println(newNumber);
        }else{
            //Clear Bit
            int notBitMask = ~bitMask;
            int newNumber = notBitMask & number;
            System.out.println(newNumber);
        }
        input.close();
        
    }
}