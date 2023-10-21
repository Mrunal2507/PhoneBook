package com.cg.phoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

	 private List<Contact> phoneBook = new ArrayList<>();

	//getters-setters
	 
	 public List<Contact> getPhoneBook() {
		return phoneBook;
	}

	public void setPhoneBook(List<Contact> phoneBook) {
		this.phoneBook = phoneBook;
	}
	
//methods
	
	 public void addContact(Contact contactObj) {
	        phoneBook.add(contactObj);
	    }
	 
	 public List<Contact> viewAllContacts() {
	        return phoneBook;
	    }

	    public Contact viewContactGivenPhone(long phoneNumber) {
	        for (Contact contact : phoneBook) {
	            if (contact.getPhoneNumber() == phoneNumber) {
	                return contact;
	            }
	        }
	        return null;
	    }

	    public boolean removeContact(long phoneNumber) {
	        for (Contact contact : phoneBook) {
	            if (contact.getPhoneNumber() == phoneNumber) {
	                phoneBook.remove(contact);
	                return true;
	            }
	        }
	        return false;
	    }
	 
}
