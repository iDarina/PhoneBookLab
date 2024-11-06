import java.util.*;

public class PhoneBook {
    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    // constructor i want to test
    public PhoneBook() {
        this(new HashMap<>()); //calling another constructor;
    }

    public void add(String name, String phoneNumber) {
        List<String> nums = new ArrayList<>();
        nums.add(phoneNumber);
        phonebook.put(name, nums);
    }

    public void addAll(String name, String... phoneNumbers) {
        List<String> numbersList = new ArrayList<>();
        for(String number : phoneNumbers){
            numbersList.add(number);
        }
        phonebook.put(name, numbersList);
        //phonebook.put(name, Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
        List<String> phoneNumbers = new ArrayList<>();
        if (phonebook.containsKey(name)){
            phoneNumbers.addAll(phonebook.get(name));
        }
        return phoneNumbers;
    }

    public String reverseLookup(String phoneNumber)  {
        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public List<String> getAllContactNames() {
        return new ArrayList<>(phonebook.keySet());
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }

    public Map<String, List<String>> getPhonebook() {
        return phonebook;
    }
}