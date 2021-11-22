import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");
    private static Calculator numbers = new Calculator();
    private static TicTacToe Toe=new TicTacToe();

    public static void main(String[] args) {
	    // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.

        boolean quit = false;
        boolean closeCalculator = false;
        boolean closeContat = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (4 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();


            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    System.out.println("\nOpening Contacts App.....");
                    printContactActions();
                    while(!closeContat) {
                        System.out.println("\nEnter action: (6 to show available actions)");
                        int operation = scanner.nextInt();
                        scanner.nextLine();


                        switch (operation) {
                            case 0:
                                System.out.println("\nClosing Contacts App...");
                                closeContat = true;
                                break;
                            case 1:
                                mobilePhone.printContacts();
                                break;

                            case 2:
                                addNewContact();
                                break;

                            case 3:
                                updateContact();
                                break;

                            case 4:
                                removeContact();
                                break;

                            case 5:
                                queryContact();
                                break;

                            case 6:
                                printContactActions();
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nOpening Calculator App.....");
                    printCalculatorActions();
                    while(!closeCalculator) {
                        System.out.println("\nEnter action: (6 to show available actions)");
                        int operation = scanner.nextInt();
                        scanner.nextLine();
                        if (operation == 0)
                            break;
                        System.out.println("Enter 1st number: ");
                        double num1 = scanner.nextDouble();
                        System.out.println("Enter 2nd number: ");
                        double num2 = scanner.nextDouble();


                        switch (operation) {
                            case 0:
                                System.out.println("\nClosing Calculator App...");
                                closeCalculator = true;
                                break;
                            case 1:
                                numbers.Add(num1,num2);
                                break;

                            case 2:
                                numbers.Sub(num1,num2);
                                break;

                            case 3:
                                numbers.Multiply(num1,num2);
                                break;

                            case 4:
                                numbers.Divide(num1,num2);
                                break;

                            case 5:
                                numbers.Rem(num1,num2);
                                break;

                            case 6:
                                printCalculatorActions();
                                break;
                        }

                    }
                    break;
                case 3:
                    System.out.println("\nOpening Tic Tac Toe Game.....");
                    String ch;
                    do{
                        Toe.newBoard();
                        Toe.play();
                        System.out.println ("Would you like to play again? (Enter 'yes'/'no') ");
                        Scanner in =new Scanner(System.in);
                        ch=in.nextLine();
                        System.out.println("ch value is  "+ch);
                    }while (ch.equals("yes"));
                case 4:
                    printActions();
                    break;
            }

        }

    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = "+ phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println( "0  - to shutdown\n" +
                            "1  - to open Contacts App\n" +
                            "2  - to open Calculator App\n" +
                            "3  - to open Tic Tac Toe Game\n");
    }

    private static void printCalculatorActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("1. Add\t2. Subtract\t3. Multiplication\t4. Divide\t5. Remainder\t6. Print Operations");
    }

    private static void printContactActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to close Contacts App\n" +
                           "1  - to print contacts\n" +
                           "2  - to add a new contact\n" +
                           "3  - to update existing an existing contact\n" +
                           "4  - to remove an existing contact\n" +
                           "5  - query if an existing contact exists\n" +
                           "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }



























}
