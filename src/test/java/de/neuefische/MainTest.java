package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void calcSum_shouldReturn15_whenCalledWith10And5(){
        //GIVEN -> Welche Informationen geben wir vor/ kennen wir?
        int a = 10;
        int b = 5;
        int expected = 15;
        //WHEN -> Tatsächlichen Aufruf der Methode
        int actual = Main.calcSum(a, b);
        //THEN -> Assertion, also wir vergleichen unsere Erwartungen mit der Realität!
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isEven_shouldReturnTrue_whenCalledWith10(){
        //GIVEN
        int a = 10;
        //WHEN
        boolean actual = Main.isEven(a);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void isEven_shouldReturnFalse_whenCalledWith1(){
        //GIVEN
        int a = 1;
        //WHEN
        boolean actual = Main.isEven(a);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void calcProd_shouldReturn50_whenCalledWith10And5(){
        //GIVEN
        int a = 5;
        int b = 10;
        int expected = 50;
        //WHEN
        int actual = Main.calcProd(a, b);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stringUp_shouldReturnUppercase_whenCalledWithLowercase(){
        //GIVEN
        String str = "hello world";
        String expected = "HELLO WORLD";
        //WHEN
        String actual = Main.stringUp(str);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isPositive_shouldReturnTrue_whenNumber10(){
        //GIVEN
        int a = 10;
        //WHEN
        boolean actual = Main.checkPositive(a);
        //THEN
        Assertions.assertTrue(actual);
    }



}