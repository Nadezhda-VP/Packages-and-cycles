package ru.netoiogy.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RestServicesTest {
    @Test
    public void restServices(){
        RestServices services = new RestServices();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int actual = services.calculate(income,expenses,threshold);
        Assertions.assertEquals(actual,expected);
    }


}
