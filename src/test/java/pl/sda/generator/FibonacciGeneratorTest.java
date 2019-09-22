package pl.sda.generator;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FibonacciGeneratorTest {


    private Generator generator;

    @Before
    public void setUp(){
        generator = new FibonacciGenerator();
    }

    @Test
    public void shouldReturn5At5thCall() {

        //given
        final int attemptes = 5 ;
        final BigDecimal expectedResult = new BigDecimal(5);

        //when
        BigDecimal result = null;
        for(int i =1; i <= attemptes; i++){
            result = generator.next();
        }


        //then
        assertNotNull(result);
        assertEquals(expectedResult,result);

    }
    @Test
    public void shouldReturn0At1thCall() {

        //given
        final int attemptes = 1 ;
        final BigDecimal expectedResult = new BigDecimal(0);

        //when
        BigDecimal result = null;
        for(int i =1; i <= attemptes; i++){
            result = generator.next();
        }


        //then
        assertNotNull(result);
        assertEquals(expectedResult,result);

    }
    @Test
    public void shouldReturn1At2thCall() {

        //given
        final int attemptes = 2 ;
        final BigDecimal expectedResult = new BigDecimal(1);

        //when
        BigDecimal result = null;
        for(int i =1; i <= attemptes; i++){
            result = generator.next();
        }


        //then
        assertNotNull(result);
        assertEquals(expectedResult,result);

    }
}