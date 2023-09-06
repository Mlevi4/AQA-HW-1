package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testWhen400ToAdd() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 600;

        int actual = cashbackHackService.remain(amount);
        int expected = 400;

        assertEquals(expected, actual);
    }

    @Test
    public void testWhenNothingToAdd() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testWhen1000ToAdd() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

}