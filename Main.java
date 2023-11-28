import java.util.Scanner;
import java.util.Random;


public class Main
{
    public static void problemOne()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name:");
        String name1 = scanner.nextLine();

        System.out.println("Enter the second name:");
        String name2 = scanner.nextLine();

        System.out.println("Enter the third name:");
        String name3 = scanner.nextLine();

        String min_name = name1;
        String mid_name, max_name;

        if (name2.compareTo(min_name) < 0) {
            max_name = mid_name = min_name;
            min_name = name2;
        } else {
            max_name = mid_name = name2;
        }

        if (name3.compareTo(min_name) < 0) {
            max_name = mid_name;
            mid_name = min_name;
            min_name = name3;
        } else if (name3.compareTo(max_name) > 0) {
            min_name = mid_name;
            mid_name = max_name;
            max_name = name3;
        } else {
            mid_name = name3;
        }

        System.out.println("Names in alphabetical order: " + min_name + ", " + mid_name + ", " + max_name);

    }

    public static void problemTwo()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter sentence: ");

        String sentence = scan.nextLine();
        System.out.println("Character count: " + sentence.length());
    }

    public static void problemThree()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter word: ");
        String word = scan.nextLine();

        if(word.length() == 3)
        {
            if(word.charAt(0) == word.charAt(2))
            {
                System.out.println(true);
            }
            else
            {
                System.out.println(false);
            }
        }

        else
        {
            System.out.println("Please enter valid input.");
        }
    }

    public static void problemFour()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter word: ");
        String word = scan.nextLine();

        if(word.length() == 3)
        {
            System.out.print(word.charAt(2));
            System.out.print(word.charAt(1));
            System.out.print(word.charAt(0));
        }

        else
        {
            System.out.println("Please enter valid input.");
        }
    }

    public static void problemFive()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter word: ");
        String word = scan.nextLine();
        String result = "";

        if(word.length() == 4)
        {
            for(int i = 0; i < word.length(); i++)
            {
                if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
                {
                    result += "*";
                }

                else
                {
                    result += word.charAt(i);
                }
            }
        }


        else
        {
            System.out.println("Please enter valid input.");
        }

        System.out.println(result);
    }

    public static void problemSix()
    {
        Random rnd = new Random();
        int rnd_num = rnd.nextInt(100) + 1;
        System.out.println("The number " + rnd_num + ": ");
        System.out.println();
        if(rnd_num < 10)
        {
            System.out.println("The number has one digit.");
        }
        else
        {
            System.out.println("The number has two digits.");
        }

        if(rnd_num % 2 == 0 || rnd_num % 3 == 0)
        {
            System.out.println("Number is divisible by 2 or 3.");
        }
        else
        {
            System.out.println("Number is NOT divisible by 2 or 3.");
        }

    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
//        problemOne();//שאלה 1
//        problemTwo();//שאלה 2
//        problemThree(); //שאלה 3
//        problemFour(); //שאלה 4
//        problemFive(); //שאלה 5
//        problemSix(); //שאלה 6

    }
}
