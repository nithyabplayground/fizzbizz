package com.example;

import jdk.internal.joptsimple.internal.Strings;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;
    @BeforeEach
    public void setup(){
        solution = new Solution();
    }

    @AfterEach
    public void tearDown(){
        solution = null;
    }

    @Test
    public void test_When_inputRange_Is_0(){
        String perform = solution.perform(0);
        assertTrue(Strings.isNullOrEmpty(perform));
    }

    @Test
    public void test_When_inputRange_Is_20(){
        String perform = solution.perform(20);
        assertEquals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz", perform);
    }
}