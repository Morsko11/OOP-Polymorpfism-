package org.example;

public class Book implements Printable {
    @Override
    public void print() {
        System.out.println("its Book");
    }

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static void printBooks(Printable[] printable) {

        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Book) {
                Book book = (Book) printable[i];
                System.out.println(book.getName());
            }
        }
    }
}

