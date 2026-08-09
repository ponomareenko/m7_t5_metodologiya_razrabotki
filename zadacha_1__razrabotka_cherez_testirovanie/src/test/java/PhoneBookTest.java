import org.junit.jupiter.api.*;
import ru.netology.PhoneBook;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    PhoneBook phoneBook;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("beforeEach");
        phoneBook = new PhoneBook();
    }

    @AfterEach
    public void afterEach() {
        System.out.println("afterEach");
        phoneBook = null;
    }

    @Test
    public void addTest() {
        System.out.println("addTest");

        // Arrange
//        Map<String, String> listContacts = new HashMap<>();
        int expected = 2;

        // Act
//        listContacts.put("Данил", "79624602075");
//        listContacts.put("Настя", "79624222661");

        int result = phoneBook.add();

        // Assert
        assertEquals(expected, result);
    }
}
