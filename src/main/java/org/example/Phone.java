package org.example;

public class Phone {
    int number;
    String model;
    int weight;

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone() {
      this(213,"4244",555);

    }
    public Phone(int number, String model) {
       this(number,model,33);
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void receiveCall(String name){
        System.out.println("Звонит "+name);
    }
    public void getNumber(int number){
        System.out.println(number);
    }
}
