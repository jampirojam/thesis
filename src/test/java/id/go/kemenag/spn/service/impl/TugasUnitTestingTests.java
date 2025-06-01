package id.go.kemenag.spn.service.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class TugasUnitTestingTests {

    private int angkaPositif;
    private int angkaNegatif;
    private String expectedString;

    @BeforeEach
    void setUp(TestInfo testInfo) {
        angkaPositif = 10;
        angkaNegatif = -5;
        expectedString = "Halo Dunia";
        System.out.println("▶️  Sedang menjalankan test: " + testInfo.getDisplayName());
    }

    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println("✅  Selesai menjalankan test: " + testInfo.getDisplayName());
    }

    @Test
    void assertFalseTest() {
        boolean hasil = angkaPositif < 0;
        assertFalse(hasil, "Angka positif seharusnya tidak kurang dari 0");
    }

    @Test
    void assertTrueTest() {
        boolean hasil = angkaNegatif < 0;
        assertTrue(hasil, "Angka negatif seharusnya kurang dari 0");
    }

    @Test
    void assertEqualsTest() {
        String actual = "Halo " + "Dunia";
        assertEquals(expectedString, actual, "String seharusnya sama");
    }

    @Test
    void assertThrowTest() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        }, "Pembagian dengan nol harus melempar ArithmeticException");
    }

    @Test
    void assertWithMessageTest() {
        int result = angkaPositif + angkaNegatif;
        assertEquals(5, result, "Hasil penjumlahan 10 + (-5) seharusnya 5");
    }

    @ParameterizedTest(name = "Perbandingan antar elemen dari kategori yang berbeda")
    @MethodSource("dataSource")
    void checkElementMatch_betweenCategories_test(List<List<String>> categories) {
        int trueTotal = 0;
        int falseTotal = 0;

        for (int i = 0; i < categories.size(); i++) {
            List<String> category1 = categories.get(i);
            for (int j = i + 1; j < categories.size(); j++) {
                List<String> category2 = categories.get(j);

                for (String element1 : category1) {
                    for (String element2 : category2) {
                        boolean result = element1.equals(element2);
                        System.out.println(element1 + " -> " + element2 + " -- " + result);

                        if (!result) {
                            trueTotal += 1;
                        } {
                            falseTotal +=1;
                        }
                    }
                }
            }
        }

        System.out.println("Total sama: " + trueTotal);
        System.out.println("Total beda: " + falseTotal);
    }

    static Stream<Arguments> dataSource() {
        return Stream.of(
            Arguments.of(List.of(
                List.of("Lari", "Sepeda", "Fotografi", "Renang"),
                List.of("Lari", "Sepeda", "Memasak", "Menjahit"),
                List.of("Renang", "Membaca"),
                List.of("Renang", "Menjahit", "Badminton")
            )),
            Arguments.of(List.of(
                List.of("Sepeda", "Membaca", "Berenang"),
                List.of("Berenang", "Memasak", "Menjahit"),
                List.of("Fotografi", "Berenang"),
                List.of("Fotografi", "Badminton", "Menjahit")
            ))
        );
    }
}