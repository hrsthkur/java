public class Main {


    public static void main(String[] args){

        Car toyota = new Car("Toyota",100000,2020,"Green");
        Car anotherToyota = new Car(toyota);
        toyota.setColor("New color - black");
        System.out.println(toyota.getMake() +" - " + toyota.getPrice() +" - " + toyota.getColor());

    }
}