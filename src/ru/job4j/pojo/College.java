package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivanov Ivan");
        student.setDate(2020, 9, 1);
        student.setGroup("Computer Science");

        System.out.println("Ф.И.О: " + student.getName() + ", группа: "
                + student.getGroup()  + ", дата поступления: " + student.getDateForPrint());
    }
}
