import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("This program simulates Binary Search on an array.");
        System.out.print("Please enter the size of the array: ");
        int n = scan.nextInt();

        // Create array of random numbers of size: n
        Numbers arr = new Numbers(n);

        return;
    }
}
