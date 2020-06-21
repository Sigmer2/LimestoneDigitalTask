package test.java.com;

import com.Converter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    @Test
    public void shouldReturnOneDigit() {
        Converter converter = new Converter();
        String actual = converter.convert(2);
        assertEquals("2", actual);
    }

    @Test
    public void shouldReturnTwoConsecutiveDigitsFromTwo() {
        Converter converter = new Converter();
        String actual = converter.convert(56);
        assertEquals("5-6", actual);
    }

    @Test
    public void shouldReturnTwoNonConsecutiveDigitsFromTwo() {
        Converter converter = new Converter();
        String actual = converter.convert(24);
        assertEquals("2,4", actual);
    }

    @Test
    public void shouldReturnTwoConsecutiveDigitsFromThree() {
        Converter converter = new Converter();
        String actual = converter.convert(123);
        assertEquals("1-3", actual);
    }

    @Test
    public void shouldReturnThreeNonConsecutiveDigitsFromThree() {
        Converter converter = new Converter();
        String actual = converter.convert(135);
        assertEquals("1,3,5", actual);
    }

    @Test
    public void shouldReturnSequenceAndNotSequence() {
        Converter converter = new Converter();
        String actual = converter.convert(125);
        assertEquals("1-2,5", actual);
    }

    @Test
    public void shouldReturnSequenceAndNotSequenceAndSequence() {
        Converter converter = new Converter();
        String actual = converter.convert(12367);
        assertEquals("1-3,6-7", actual);
    }

    @Test
    public void shouldReturnNotSequenceAndSequence() {
        Converter converter = new Converter();
        String actual = converter.convert(134567);
        assertEquals("1,3-7", actual);
    }
}
