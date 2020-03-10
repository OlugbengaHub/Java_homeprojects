package selfTest;

public class Fizzbuzz {
    public static void main(String args[]) {
        for (int j = 1; j<=100; j++){
            if (j%3 == 0 && j%5 == 0)
                System.out.println("FizzBuzz");
            else if (j%5 == 0)
                System.out.println("Buzz");
            else if (j%3 == 0)
                System.out.println("Fizz");
            else
                System.out.println(j);
        }
    }
}
