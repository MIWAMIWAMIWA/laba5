package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
class TextCleanerTest {
    public static final TextCleaner TEXT_CLEANER = new TextCleaner();
    public static final String INPUT1 = "f you're interested in the world"
            + " of hacking and cracking, you might want to check out some of the" +
            " websites dedicated to this field. One such site is ХХХ (http://www.fweg235xxxgvreh.com)," +
            " which offers a variety of resources related to hacking and cybersecurity. " +
            "Another site worth checking out is Charmes (http://www.GGgrcharmesgrfdrg45.com), " +
            "which provides news and analysis on the latest developments in the world of cybersecurity.";

    public static final String EXPECTED1 = "f you're interested in the world"
            + " of hacking and cracking, you might want to check out some of the" +
            " websites dedicated to this field. One such site is ХХХ (*link deleted*)," +
            " which offers a variety of resources related to hacking and cybersecurity. " +
            "Another site worth checking out is Charmes (*link deleted*), " +
            "which provides news and analysis on the latest developments in the world of cybersecurity.";
    public static final String INPUT2 = "%8r2(*r5_=http://www.grgwCRaCk.com.hacking.com^8ter";

    public static final String EXPECTED2 = "%8r2(*r5_=*link deleted*.hacking.com^8ter";
    public static final String WRONG_INPUT = "http://wwv.xxx.com";

    @ParameterizedTest
    @MethodSource("provideParameters")
    void textUrlCleaning1(String input,String expected) {
        assertEquals(expected, TEXT_CLEANER.textUrlCleaning(input));
    }
    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(INPUT1, EXPECTED1),
                Arguments.of(INPUT2, EXPECTED2),
                Arguments.of(WRONG_INPUT, WRONG_INPUT)
                );
    }
}