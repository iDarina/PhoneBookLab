import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBookTest {

    PhoneBook phoneBook;

    @BeforeEach
    void setUp(){
        phoneBook = new PhoneBook();
    }


    @Test
    void createPhoneBookWithoutParameters(){
        //Given


        //When

        //Then
        Assertions.assertTrue(phoneBook.getMap() instanceof HashMap);
    }

    @Test
    void addAllTest() {
        //Given
        String name = "Joe";
        String[] phoneNumbers = {
                "302-453-04-84",
                "403-373-39-49",
                "564-675-46-47",
                "403-564-03-73"
        };

        //When
        phoneBook.addAll(name, phoneNumbers);
       List<String> actual = phoneBook.lookup(name);

        //Then
        Assertions.assertEquals(Arrays.asList(phoneNumbers), actual);
    }

    @Test
    void reverseLookup() {
        //Given
        String phoneNumber = "302-543-67-34";
        String expectedName = "Bub";

        phoneBook.addAll(expectedName, phoneNumber);


        //When
        String actual = phoneBook.reverseLookup(phoneNumber);


        //Then
        Assertions.assertEquals(expectedName, actual);
    }
}
