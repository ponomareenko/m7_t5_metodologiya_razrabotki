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
        int sizeList;
        int expected = 2;

        // Act
        sizeList = phoneBook.add("Данил", "79624602075");
        sizeList = phoneBook.add("Настя", "79624222661");

        int result = sizeList;

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void findByNumberTest() {
        System.out.println("findByNumberTest");

        // Arrange
        phoneBook.add("Данил", "79624602075");
        phoneBook.add("Настя", "79624222661");
        String expected = "Данил";

        // Act
        String result = phoneBook.findByNumber("79624602075");

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void findByNameTest() {
        System.out.println("findByNameTest");

        // Arrange
        phoneBook.add("Данил", "79624602075");
        phoneBook.add("Настя", "79624222661");
        String expected = "79624602075";

        // Act
        String result = phoneBook.findByName();

        // Assert
        assertEquals(expected, result);
    }
}
