public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Add single phone numbers for contacts
        phoneBook.add("Alice", "123-456-7890");
        phoneBook.add("Bob", "234-567-8901");

        // Add multiple phone numbers for a contact
        phoneBook.addAll("Charlie", "345-678-9012", "456-789-0123");

        // Lookup phone numbers by name
        System.out.println(phoneBook.lookup("Alice"));
        System.out.println(phoneBook.lookup("Charlie"));

        // Reverse lookup by phone number
        System.out.println("Who has the number 234-567-8901? " + phoneBook.reverseLookup("234-567-8901"));
        System.out.println("Who has the number 999-999-9999? " + phoneBook.reverseLookup("999-999-9999")); // null

        // Get all contact names
        System.out.println("All contacts: " + phoneBook.getAllContactNames());

        // Remove a contact
        phoneBook.remove("Alice");
        System.out.println(phoneBook.hasEntry("Alice")); // false

        // Get the entire phonebook map
        System.out.println("Phonebook contents: " + phoneBook.getMap());
    }
}

