import java.util.Scanner;

public class Max_min_find {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Learning how many numbers the user will enter
        System.out.println("How many numbers will you enter?");
        int count = scanner.nextInt();

        int Max = Integer.MIN_VALUE; //Giving minimum value to max
        int Min = Integer.MAX_VALUE; //Giving maximum value to min

        //Taking numbers and research for max and min values
        for (int i = 1; i<=count; i++){
            System.out.println(i + ". number: " );
            int number = scanner.nextInt();

            if (number > Max){
                Max = number;
            }
            if (number < Min){
                Min = number;
            }
        }

        //Showing result
        System.out.println("Minimum number is: " + Min);
        System.out.println("Maximum number is: " + Max);


    }
}
