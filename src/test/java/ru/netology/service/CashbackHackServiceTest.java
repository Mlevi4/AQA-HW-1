package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 600;

        int actual = cashbackHackService.remain(amount);
        int expected = 400;

        assertEquals(actual, expected);
    }
}