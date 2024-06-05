package org.example;

/*Автомобили
      Интерфейс Printable
Определить интерфейс Printable, содержащий метод void print().
Определить класс Book, реализующий интерфейс Printable.
Определить класс Magazine, реализующий интерфейс Printable.
Создать массив типа Printable, который будет содержать книги и журналы.
В цикле пройти по массиву и вызвать метод print() для каждого объекта.
Создать статический метод printMagazines(Printable[] printable) в классе Magazine, который выводит на консоль названия только журналов.
Создать статический метод printBooks(Printable[] printable) в классе Book, который выводит на консоль названия только книг. Используем оператор instanceof..*/
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        phone.number = 10;
        phone.model = "iphone";
        phone.weight = 1000;
    //    System.out.println(phone.toString());
        Printable[] printables = new Printable[6];
        printables[0] = new Book("Harry poter 1");
        printables[1] = new Magazine("Magazine 1");
        printables[2] = new Book("Rfafdasf");
        printables[3] = new Magazine("MAgazine 2");
        printables[4] = new Jurnal("2151515");
        printables[5] = new Jurnal("214214214");
        for (int i = 0; i < printables.length; i++) {
           if (printables[i].getClass() == Jurnal.class) {
               printables[i].print();}
        }



    }
}
