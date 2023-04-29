package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TextCleanerTest {
    public static final TextCleaner TEXT_CLEANER=new TextCleaner();
    public static final String INPUT = "f you're interested in the world"
            +" of hacking and cracking, you might want to check out some of the" +
            " websites dedicated to this field. One such site is ХХХ (http://www.xxx.com)," +
            " which offers a variety of resources related to hacking and cybersecurity. " +
            "Another site worth checking out is Charmes (http://www.charmes.com), " +
            "which provides news and analysis on the latest developments in the world of cybersecurity.\n";

    public static final String EXPECTED = "f you're interested in the world"
            +" of hacking and cracking, you might want to check out some of the" +
            " websites dedicated to this field. One such site is ХХХ (*link deleted*)," +
            " which offers a variety of resources related to hacking and cybersecurity. " +
            "Another site worth checking out is Charmes (*link deleted*), " +
            "which provides news and analysis on the latest developments in the world of cybersecurity.\n";
    @Test
    void textUrlCleaning() {
        String result= TEXT_CLEANER.textUrlCleaning(INPUT);
        assertEquals(EXPECTED,result);
    }
}