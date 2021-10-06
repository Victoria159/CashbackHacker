package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {
    @Test
    public void shouldPurchaseFor2000() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 2000;

        int actual = cashbackHacker.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldPurchaseFor900() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 900;

        int actual = cashbackHacker.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }
}