import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numTotal = 0;
        double[] newArray = new double[10];
        for(int i = 0; i < newArray.length;i++) {

            System.out.println("Enter numbers");
            newArray[i] = keyboard.nextDouble();
            numTotal += newArray[i];
        }
        Double avg = numTotal/newArray.length;
        System.out.println(avg);
    }


}
