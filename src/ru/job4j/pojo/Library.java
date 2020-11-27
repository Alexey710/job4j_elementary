package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book0 = new Book("Clean code", 1500);
        Book book1 = new Book("Thinking in Java", 1200);
        Book book2 = new Book("Effective Java", 1000);
        Book book3 = new Book("Design patterns", 700);

        Book[] books = new Book[4];
        books[0] = book0;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName());
        }

        Book temp;
        temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        System.out.println();

        System.out.println("После замены 0 на 3 : ");

        for (Book elem : books) {
            System.out.println(elem.getName());
        }

        System.out.println();

        System.out.println("Книги с именем \"Clean code\" : ");

        for (Book elem : books) {
            if (elem.getName().equals("Clean code")) {
                System.out.println(elem.getName());
            }
        }
    }
}
