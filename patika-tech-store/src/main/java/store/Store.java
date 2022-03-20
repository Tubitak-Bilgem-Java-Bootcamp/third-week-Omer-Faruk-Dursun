package store;

import brand.Brand;
import product.Notebook;
import product.Product;
import product.Smartphone;

import java.util.ArrayList;
import java.util.Comparator;

public class Store {
    private final static String STORE_NAME = "Patika Magaza";

    private static ArrayList<Brand> brands = new ArrayList<>();

    static {
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "Hp"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));
    }

    private static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Notebook(1, "Notebook-1","Casper", 5,700,8000,128, 24,8));
        products.add(new Notebook(2, "Notebook-2","Asus",3,800,25000,128, 27,16));
        products.add(new Notebook(3, "Notebook-3","Monster",35,1000,28000,512, 24,32));

        products.add(new Smartphone(4, "Smartphone-1","Xiaomi",25,1000,8000,128, 8,8, "Red",2500,8));
        products.add(new Smartphone(5, "Smartphone-2","Samsung",15,1200,12000,512, 9,12, "White",3000,16));
        products.add(new Smartphone(6, "Smartphone-3","Apple",3,1500,17000,256, 9,16, "Black",2600,12));
    }

    public static void listBrands(){
        brands.stream().sorted(Comparator.comparing(Brand::getName)).forEach(System.out::println);
    }

    public static void listNotebooks(){
        products.stream().filter(p -> p instanceof Notebook).forEach(System.out::println);
    }
    public static void listSmartPhones(){
        products.stream().filter(p -> p instanceof Smartphone).forEach(System.out::println);
    }

    public static void addProduct(Product product){
        products.add(product);
    }

    public static void deleteProduct(int i){
        products.remove(i-1);
    }

    public static Product getProductById(int i){
        return products.get(i);
    }
}
