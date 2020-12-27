package ru.job4j.inheritance;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class JSONReportTest {

    @Test
    public void generate() {
        String expected = "{" + System.lineSeparator()
                + "\"" + "name" + "\"" + " : " + "\"" + "name" + "\"" + ","
                + System.lineSeparator()
                + "\"" + "body" + "\"" + " : " + "\"" + "body" + "\""
                + System.lineSeparator() + "}";
        String out = new JSONReport().generate("name", "body");
        Assert.assertThat(out, is(expected));
    }
}