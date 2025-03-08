import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking number
        System.out.println("Up to what number would you like to process?");
        int number = scanner.nextInt();

        double average = 0;
        double sum = 0;
        double count = 0;

        //Calculating sum of numbers from 0 to number taking by user and count operation
        for (int i=0; i<=number ; i++){
            if (i%3 == 0 && i%4 == 0 ){
                sum = sum+i;
                count = count+1;
            }
        }

        //The number of numbers divided by three and four, up to the number received from the user, is kept in count, and if this value is greater than 0, the average calculation is carried out.
        if (count>0){
            average = sum/count;
            System.out.println("The average from 0 to " + number + " is " + average);
        }
        else {
            System.out.println("Hatalı veri girdiniz");
        }


    }
}
