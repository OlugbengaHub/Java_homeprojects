package chapter3;

/*
Write a program that prints the numbers 1-100, each on a new line
For each number that is a multiple of 3, print “Fizz” instead of the number
For each number that is a multiple of 5, print “Buzz” instead of the number
For each number that is a multiple of both 3 and 5, print “FizzBuzz” instead of the number
 */
public class FizzBuzzTest {
    public static void main(String args[]){

            for (int i = 1; i <= 100; i++) {
                if (i%3 == 0 && i%5 == 0)
                    System.out.println("FizzBuzz");
                else if (i%5 == 0)
                    System.out.println("Buzz");
                else if (i%3 == 0)
                    System.out.println("Fizz");
                else
                    System.out.println(i);
            }
        }

    }

