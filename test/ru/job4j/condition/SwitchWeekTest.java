package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void when3thanWednesday() {
        String out = SwitchWeek.nameOfDay(3);
        Assert.assertEquals("Среда", out);
    }

    @Test
    public void when8thanError() {
        String out = SwitchWeek.nameOfDay(8);
        Assert.assertEquals("Ошибка", out);
    }
}