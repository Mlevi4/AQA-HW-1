package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testWhen400ToAdd() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 600;

        int actual = cashbackHackService.remain(amount);
        int expected = 400;

        assertEquals(actual, expected);
    }

    @Test
    public void testWhen1000ToAdd() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void testWhenNothingToAdd() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}