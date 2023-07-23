package ru.netoiogy.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RestServicesTest {
    //@ParameterizedTest()
    //@CsvSource({"3,10_000,3_000,20_000,"})
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/restTest.scv")
    public void restServices(int expected, int income, int expenses, int threshold) {
        RestServices services = new RestServices();
        int actual = services.calculate(income,expenses,threshold);

        Assertions.assertEquals(actual,expected);

    }



}
