package dev.lpa;

public class MobileMain {


    public static void main(String[] args) {
        MobilePhone myMobile = new MobilePhone("19");
        Contact helge = new Contact("Helge", "55506834");
        Contact helgi = new Contact("Helgi", "55508463");
        Contact jessie = new Contact("Jessie", "55536969");
        Contact aeris = new Contact("Aeris", "55594599");
        Contact tifa = new Contact("Tifa","55533935");
        Contact rinoa = new Contact("Rinoa", "55534534");
        Contact edea = new Contact("Edea", "55539056");


        myMobile.addNewContact(aeris);
        myMobile.addNewContact(rinoa);
        myMobile.addNewContact(tifa);
        myMobile.addNewContact(tifa);
        myMobile.addNewContact(edea);
        myMobile.addNewContact(helge);
        myMobile.addNewContact(jessie);
        myMobile.updateContact(helge, helgi);
        myMobile.removeContact(aeris);

        myMobile.printContacts();
    }


}
/*tests:
at Evaluate$AssertMethodUtils.assertMethodCount(Unknown Source) - 7 functions in MobilePhone.java

 Tests for using the following methods in the MobilePhone class:
 public boolean addNewContact(Contact contact)
 public boolean updateContact(Contact contact, Contact updatedContact)
 public boolean removeContact(Contact contact)
 private int findContact(Contact contact)
 private int findContact(String name)
 public Contact queryContact(String name)

 Checks that the following methods are private:
 There are also thest that checks if both findContact methods exists and are private
 There is also a test that checks if

 Checks that these fields in the MobilePhone class exists and are private:
 private String myNumber;
 private ArrayList<Contact> myContacts = new ArrayList<>();

 Checks that the following fields in the Contact class exists and are private:
 private String name;
 private String phoneNumber;

Tests for creating the following Contacts and adding them to myContacts:
Bob -> 31415926
Alice -> 16180339
Tom -> 11235813
Tom -> 11235813 (test for false return value when adding duplicate)
Jane -> 23571113

tests for other methods in the
checks for mp.queryContact("Jane"); (public method)
Contact bob = new Contact("Bob", "31415926") (creating the 5 contacts)
mp.addNewContact(bob)             (adding the 5 contacts to the contact list)
mp.removeContact(Lisa)            (testing removing a contact)
mp.updateContact(sandra, jane)    (testing updating a contact


printContacts():
Contact List:
1. Bob -> 31415926
2. Alice -> 16180339
3. Tom -> 11235813
4. Jane -> 23571113
 */
