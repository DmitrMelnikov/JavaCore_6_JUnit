import org.JavaCore6Test.JobWithString;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class JobWithStringTest {
    JobWithString jobWithString = null;

    @BeforeAll
    public static void before() {
        System.out.println("Тесты стартовали!");
    }

    @BeforeEach
    public void beforeEachTest() {
        jobWithString = new JobWithString();
        System.out.println("Создан объект класса работы со строками jobWithString.");
    }

    @AfterAll
    public static void after() {
        System.out.println("Тесты закончены!");
    }

    @AfterEach
    public void afterEachTest() {
        jobWithString = null;
        System.out.println("Уничтожен объект класса работы со строками jobWithString.");
    }

    @Test
    public void addTwoStringsTest() {

        String strOne = "Привет ";
        String strTwo = "Мир!";
        String resultatAddStr = "Привет Мир!";
        String resault = jobWithString.addTwoStrings(strOne, strTwo);

        Assertions.assertArrayEquals(resultatAddStr.toCharArray(), resault.toCharArray());
        System.out.println("Отработан тест addTwoStringsTest()");
    }

    @Test

    public void lengthStringTest() {

        String str = "Привет ";
        int lengthStr = 7;

        Assertions.assertEquals(lengthStr, jobWithString.lengthString(str));
        System.out.println("Отработан тест lengthStringTest()");

    }

    @Test
    public void stringIsNullTest() {

        String str = "";
        boolean[] booleanStr = {jobWithString.stringIsNull(str)};
        boolean[] expected = {true};

        Assertions.assertArrayEquals(expected, booleanStr);
        Assertions.assertFalse(!str.isEmpty());
        System.out.println("Отработан тест stringIsNullTest()");

    }

    @Test
    public void occurrenceStrings() {

        String strOne = "Привет ";
        String strTwo = "П";

        boolean[] booleanStr = {jobWithString.occurrenceStrings(strOne, strTwo)};
        boolean[] expected = {true};

        Assertions.assertArrayEquals(expected, booleanStr);
        System.out.println("Отработан тест occurrenceStrings()");
    }

    @ParameterizedTest
    @MethodSource("addTestParametrs")
    public void occurrenceStringsWithParametrs(String strOne, String strTwo, boolean strResult) {

        boolean[] booleanStr = {jobWithString.occurrenceStrings(strOne, strTwo)};
        boolean[] expected = {strResult};

        Assertions.assertArrayEquals(expected, booleanStr);

        System.out.println("Отработан тест occurrenceStringsWithParametrs()");

    }

    public static Stream<Arguments> addTestParametrs() {
        return Stream.of(Arguments.of("Привет", "П", true),
                Arguments.of("ДОК", "Ц", false),
                Arguments.of("ДОК", "Д", false));
    }

}
