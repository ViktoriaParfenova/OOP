import java.util.ArrayList;

public interface ProductMachine {

    //    ArrayList<Product> array = new ArrayList<Product>();
//    public void initProduct(ArrayList<Product> arrayProduct){
//        array = arrayProduct;
//
//    }
//
//    public Product GetProduct(String name){
//        for (int i = 0; i <= array.size(); i++) {
//            if (array.get(i).name.equals(name)){
//                return array.get(i);
//            }
//
//        }
//        return null;
//
//    }
    public void initProduct(ArrayList<Coffee> arrayProduct);

    public Coffee GetProduct(String name);

}
