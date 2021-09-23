package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerTest {
@Test
public void shouldPurchaseFor3000(){
    CashbackHacker cashbackHacker = new CashbackHacker();
    int amount = 3000;

    int actual = cashbackHacker.remain(amount);
    int expected = 0;

    assertEquals(expected, actual);
}
    @Test
    public void  shouldPurchaseFor900(){
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 800;

        int actual = cashbackHacker.remain(amount);
        int expected= 200;

        assertEquals(expected, actual);
    }

}