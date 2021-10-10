import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.next();

        message = message.toLowerCase();
        
        char[] ch = message.toCharArray();


        for(int i=0; i<ch.length; i++){
            switch(ch[i]){
                case 'y':
                    ch[i] = 'a';
                    break;
                case 'z':
                    ch[i] = 'b';
                    break;
                default:
                    ch[i] = (char)(ch[i] + 2);
            }
        }

        for(int i=0; i<ch.length; i++){
            if(i%2 == 0){
                ch[i] = (char)(ch[i] - 32);
            }
        }
        System.out.println(String.valueOf(ch));

        sc.close();
    }
}