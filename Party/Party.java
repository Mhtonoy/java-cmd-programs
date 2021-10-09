import java.util.*;

public class Party{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amountsOfTea = input.nextInt();
        int amountsOfCandy = input.nextInt();

        if((amountsOfTea < 5) || (amountsOfCandy < 5)){
            System.out.println("The party is bad(0)");
        }
        else{

            if((amountsOfTea >= amountsOfCandy*2) || (amountsOfCandy >= amountsOfTea*2)){
                System.out.println("The party is great(2)");
            }
            else{
                System.out.println("The party is good(1)");
            }
            
        }
        

        input.close();
    }
}
