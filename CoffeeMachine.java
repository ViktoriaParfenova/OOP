import java.util.ArrayList;

public class CoffeeMachine implements ProductMachine {
    ArrayList<Coffee> array = new ArrayList<>();

    @Override
    public void initProduct(ArrayList<Coffee> arrayProduct) {
        array = arrayProduct;

    }

    @Override
    public Coffee GetProduct(String name) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).name.equals(name)) {
                return array.get(i);
            }

        }
        return null;
    }

    public Coffee GetProduct(String name, Integer temperature, Double volume) {
        for (Coffee coffee : array){
            if(coffee.name.equals(name) &&
            coffee.temperature.equals(temperature) &&
            coffee.volume.equals(volume)){
                return coffee;
            }
        }
            return null;
    }


}
