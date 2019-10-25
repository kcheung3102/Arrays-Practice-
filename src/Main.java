import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numTotal = 0;
        int[] numArray =new int[5];
         for(int i = 0; i < numArray.length;i++) {

            System.out.println("Enter numbers " + (i + 1) + ":");
            numArray[i] = keyboard.nextInt();
            numTotal += numArray[i];
        }
         double mean = numTotal/5;
        System.out.println(numTotal);
        System.out.println(mean);

         //testcase 1: 1,2,3,4,5
        //testcase 2: 10,20,30,40,50

    }


}
