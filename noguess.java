//shendage akanksha vijaykumar

Import java.util.Random;

Import java.util.Scanner;

Public class guessing_no {
    Public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        Int n = 1 + (int) (100 * Math.random());//here random number will be guessed
        Int Trials = 6;
        Int I, j;

        System.out.println(“A Number is chosen between 1 to 100 Guess the number .”);
        Int l;
        Do {

            For (I = 0; I < Trials; i++) {
                System.out.println(“Enter the Number :”);
                J = s.nextInt();

                If (n == j) {
                    System.out.println(“Congratulations!,You Guess a Correct Number  “);
                    Break;

                } 
                Else if (n > j && I != n – 1) {
                    System.out.println(“Your number is greater than “ + j);

                } 
                Else if (n < j && I != n – 1) {
                    System.out.println(“Your number is smaller than “ + j);

                }
                Else {
                    System.out.println(“Enter the number between 1 to 100”);
                }

            }

            System.out.println(“You Enter a wrong numbers”);

            System.out.println(“The actual number is :” + n);

            System.out.println(“Do you want to continue press 1.”);

            L = s.nextInt();

        }
       
        While (l == 1);

    }

}
