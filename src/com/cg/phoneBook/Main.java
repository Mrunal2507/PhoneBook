package com.cg.phoneBook;

import java.util.List;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 int choice ;
		 PhoneBook phoneBook = new PhoneBook();
		 do {
	            System.out.println("Menu");
	            System.out.println("1. Add Contact");
	            System.out.println("2. Display all contacts");
	            System.out.println("3. Search contact by phone");
	            System.out.println("4. Remove contact");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine();
	            switch (choice) {
                case 1:
                    System.out.println("Add a Contact:");
                    System.out.print("Enter the First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter the Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter the Phone No.: ");
                    long phoneNumber = scanner.nextLong();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter the Email: ");
                    String emailId = scanner.nextLine();

                    Contact contact = new Contact(firstName, lastName, phoneNumber, emailId);
                    phoneBook.addContact(contact);
                    System.out.println("Contact added successfully.");
                    break;
                case 2:
                    System.out.println("All Contacts:");
                    List<Contact> allContacts = phoneBook.viewAllContacts();
                    for (Contact c : allContacts) {
                        System.out.println(c.getFirstName() + " " + c.getLastName() + " - " + c.getPhoneNumber());
                    }
                    break;
                case 3:
                    System.out.print("Enter the Phone No. to search: ");
                    long searchPhoneNumber = scanner.nextLong();
                    scanner.nextLine(); // Consume newline character

                    Contact searchedContact = phoneBook.viewContactGivenPhone(searchPhoneNumber);
                    if (searchedContact != null) {
                        System.out.println("Contact found:");
                        System.out.println(searchedContact.getFirstName() + " " + searchedContact.getLastName() + " - " + searchedContact.getEmailId());
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the Phone No. to remove: ");
                    long removePhoneNumber = scanner.nextLong();
                    scanner.nextLine(); // Consume newline character

                    boolean removed = phoneBook.removeContact(removePhoneNumber);
                    if (removed) {
                        System.out.println("Contact removed successfully.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 5);

        scanner.close();
	}
}
