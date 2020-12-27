package ru.job4j.pojo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Student {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private String name;
    private LocalDate date;
    private String group;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDateForPrint() {
        return this.getDate().format(this.getFormatter());
    }

    public void setDate(int year, int month, int day) {
        date = LocalDate.of(year, month, day);
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }
}
