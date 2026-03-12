/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitalbank;
import java.util.Scanner; // Import the Scanner class
/**
 *
 * @author Lab Informatika
 */
public class BankSystem {
    public static void main(String[] args) {
        // Create a Scanner object to read from standard input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==SPEND DIGIAL - CREATE NEW ACCOUNT===\n");
        System.out.println("NIK: ");
        int intNIK = scanner.nextInt(); // Read an integer
        
        System.out.println("Full Name: ");
        String stringNama = scanner.nextLine(); // Read a whole line(string)
        
        // Consume the remaining newline character left by nextDouble()
        scanner.nextLine();
        
        System.out.println("Age");
        String stringUmur = scanner.nextLine(); // Read a whole line(string)
        
        // Close the scanner when no more input is needed
        scanner.close();
        
        System.out.println("NIK: " + intNIK);
        System.out.println("Full Name: " + stringNama);
        System.out.println("Age: " + stringUmur);
        
        System.out.println("==SPEND DIGIAL - CREATE NEW ACCOUNT===\n");
        System.out.println("1. Make Deposit");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Create New Account");
        System.out.println("4. Transfer Money");
        int intPilih = scanner.nextInt();
        
    }
}
