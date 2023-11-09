import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {

        boolean match = false;
        int random_numbers;
        int random_numbers2;
        int random_numbers3;
        int random_numbers4;
        int user_guess;
        int user_guess2;
        int user_guess3;
        int user_guess4;

        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Please guess a number between 1 and 54: ");
        user_guess = scan.nextInt();

        System.out.println();

        System.out.println("Please guess a number between 1 and 54: ");
        user_guess2 = scan2.nextInt();

        System.out.println();

        System.out.println("Please guess a number between 1 and 54: ");
        user_guess3 = scan3.nextInt();

        System.out.println();

        System.out.println("Please guess a number between 1 and 54: ");
        user_guess4 = scan4.nextInt();

        System.out.println();

        random_numbers = generator.nextInt(54) + 1;
        System.out.println(random_numbers);

        System.out.println();

        random_numbers2 = generator.nextInt(54) + 1;
        System.out.println(random_numbers2);

        System.out.println();

        random_numbers3 = generator.nextInt(54) + 1;
        System.out.println(random_numbers3);

        System.out.println();

        random_numbers4 = generator.nextInt(54) + 1;
        System.out.println(random_numbers4);

        System.out.println();

        if (user_guess == random_numbers)

            System.out.println("Congratulations! You have won the Grand Prize of $75,000!");

        else if (user_guess2 == random_numbers
                && user_guess == random_numbers2
                && user_guess3 == random_numbers2
                && user_guess2 == random_numbers3
                && user_guess4 == random_numbers4)

            System.out.println("You Matched 3 numbers! You win $1,000!");

        else if (user_guess2 == random_numbers2
                && user_guess3 == random_numbers3
                && user_guess4 == random_numbers4)

            System.out.println("You Matched 2 numbers! You win $25!");

        else if (user_guess2 == random_numbers3
                && user_guess3 == random_numbers4
                && user_guess4 == random_numbers)
            System.out.println("You Matched a number! You Won a Free Ticket!");
        else
            System.out.println("Sorry, No Match! No winnings.");


    }
}



