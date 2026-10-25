package org.example.reverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseTest {

    @Test
    public void reverse_shouldReverseString_ifContainsString() {     //обычный разворот
    String result = Reverse.reverseLetters("J@va the be$t!123");
    Assertions.assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    public void reverse_shouldReturnEmptyString_ifInputIsEmpty() {   //пустая строка
        String result = Reverse.reverseLetters("");
        Assertions.assertEquals("", result);
    }

    @Test
    public void reverse_shouldReturnSameString_ifInputContainsNoLetters() {  //только символы
        String result = Reverse.reverseLetters("123-!@");
        Assertions.assertEquals("123-!@", result);
    }

    @Test
    public void reverse_shouldReturnSameString_ifInputContainsOneLetter() {  //одна буква
        String result = Reverse.reverseLetters("!a-123");
        Assertions.assertEquals("!a-123", result);
    }

    @Test
    public void reverse_shouldReverseString_ifContainsStringMixedCharacters() { //небуквенные символы
        String result = Reverse.reverseLetters("?a1-b2c!");
        Assertions.assertEquals("?c1-b2a!", result);
    }

    @Test
    public void reverse_shouldPreserveCase_ifInputContainsMixedCase() { //сохранение регистра
        String result = Reverse.reverseLetters("AbCd");
        Assertions.assertEquals("dCbA", result);
    }

    @Test
    public void reverse_shouldReverseOnlyLetters_ifInputContainsCyrillic() {  //доп. разворот кириллицы
        String result = Reverse.reverseLetters("я-бА");
        Assertions.assertEquals("А-бя", result);
    }

    @Test
    public void reverse_shouldThrowNullPointerException_ifInputIsNull() {
        Assertions.assertThrows(
                NullPointerException.class,
                () -> Reverse.reverseLetters(null)
        );
    }
}
