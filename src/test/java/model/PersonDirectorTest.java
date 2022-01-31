package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonDirectorTest {
    PersonDirector person;

    @BeforeEach
    void setUpTests(){
        person = new PersonDirector("Miss", "Vic", "Mrg", "Vikki",
                "Wales", "welsh", "Jan", "Director");
    }

    @Test
    void testPersonDirectorFullNameContainsOnlyAlphabeticalCharacters(){
        String expected = "VAM";

        person.setFullForename("VAM");

        String actual = person.getFullForename();

        assertEquals(expected, actual);


    }
    @Test
    void testPersonDirectorFullNameContainsOnlyAlphabeticalCharactersThrowsException(){
        assertThrows(RuntimeException.class, () -> {
            person.setFullForename("V4M");
        });
    }
}
