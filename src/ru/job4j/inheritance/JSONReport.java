package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    public String generate(String name, String body) {
        return "{" + System.lineSeparator()
                + "\"" + name + "\"" + " : " + "\"" + name + "\"" + ","
                + System.lineSeparator()
                + "\"" + body + "\"" + " : " + "\"" + body + "\""
                + System.lineSeparator() + "}";
    }

    public static void main(String[] args) {
        System.out.println(new JSONReport().generate("name", "body"));

    }
}

        /*{
        "name" : "name",
        "body" : "body"
        }*/