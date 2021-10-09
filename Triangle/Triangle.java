import java.util.*;
public class Triangle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if((a==b) && (a==c)){
            System.out.println("The triangle is Equilateral in nature");
        }
        else if((a==b) || (b==c) || (a==c)){
            System.out.println("The triangle is Isosceles in nature");
        }
        else{
            System.out.println("The triangle is Scalena in nature");
        }

        input.close();
    }
}