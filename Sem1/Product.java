public abstract class Product {
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", Cost=" + Cost +
                ", Volume=" + volume +
                ", Temperature=" + temperature +
                '}';
    }
    String name;
    Double Cost;
    Double volume;
    Integer temperature;

}
