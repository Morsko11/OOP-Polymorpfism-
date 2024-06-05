package org.example;

public class Magazine implements Printable {

    @Override
    public void print() {
        System.out.println("its Magazine "+ name);
    }

    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void printMagazines(Printable[] printable) {

        for (int i = 0; i < printable.length ; i++) {
            if (printable[i] instanceof Magazine) {
              Magazine magazine = (Magazine) printable[i];
            System.out.println(magazine.getName());
            }
        }
    }

}
