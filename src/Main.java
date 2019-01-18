import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter last number in the range:");
        int num =0;
        boolean Prime = true;

         num = keyboard.nextInt();
        keyboard.close();
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j < i; j++) {

                int remainder = i % j;
                if (remainder == 0) {
                    Prime = false;
                    break;

                }

            }
            if (Prime){
                System.out.println(i+ " is a Prime Number");
        }else
                System.out.println(i+ " is not a Prime Number");
        }
    }
}
