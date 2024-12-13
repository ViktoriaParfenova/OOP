import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee();
        coffee1.name = "Cappuccino";
        coffee1.Cost = 225.00;
        coffee1.volume = 400.0;
        coffee1.temperature = 70;
        Coffee coffee2 = new Coffee();
        coffee2.name = "Espresso";
        coffee2.Cost = 250.00;
        coffee2.volume = 200.0;
        coffee2.temperature = 50;
        Coffee coffee3 = new Coffee();
        coffee3.name = "Americano";
        coffee3.Cost = 225.00;
        coffee3.volume = 300.0;
        coffee3.temperature = 40;
        ArrayList<Coffee> arrayList = new ArrayList<>(List.of(coffee1, coffee2, coffee3));
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.initProduct(arrayList);
        System.out.println(coffeeMachine.GetProduct("Cappuccino", 70, 400.0));

    }

}