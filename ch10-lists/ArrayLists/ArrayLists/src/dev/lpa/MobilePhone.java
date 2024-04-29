package dev.lpa;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;

    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            return false;
        }
        myContacts.add(contact);

        return true;

    }

    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact) && myContacts.remove(contact)){
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact contact, Contact updatedContact){
        int myIndex = myContacts.indexOf(contact);
        if (myIndex == -1){ return false; }
        myContacts.set(myIndex, updatedContact);

        return true;
    }

    public Contact queryContact(String name){
        for(int i=0;i<myContacts.size();i++){
            if(myContacts.get(i).getName()==name){
                return myContacts.get(i);
            }
        }

        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i=0;i<myContacts.size();i++){
            System.out.println(i+1 + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }

    //
    private int findContact(Contact contact){
        int index = myContacts.indexOf(contact);

        return index;
    }

    private int findContact(String name){
        for(int i=0;i<myContacts.size();i++){
            if(myContacts.get(i).getName()==name){
                return i;
            }
        }

        return -1;
    }
}