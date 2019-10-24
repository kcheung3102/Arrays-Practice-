import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
        int numTotal = 0;

        for( int i = 0; i < num.length;i++) {
            numTotal += num[i];
        }
        System.out.println(numTotal);


        int[] newArray = new int[10];

        System.out.println("Enter numbers");
        int number = keyboard.nextInt();



    }


}
