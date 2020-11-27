package ru.job4j.inheritance;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class JSONReportTest {

    @Test
    public void generate() {
        String expected = "{\n name" + System.lineSeparator() + " : " + "name" + ",\n" + "body" + " : " + "body" + "}";
        String out = new JSONReport().generate("name", "body");
        Assert.assertThat(out, is(expected));
    }
}