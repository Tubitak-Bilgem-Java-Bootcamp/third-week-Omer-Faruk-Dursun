package product;

public class Product {
    private final int id;
    private final String name;
    private final String brand;
    private int discountPercentage;
    private int stockNumber;
    private int price;
    private final int storage;
    private final int screenSize;
    private final int ramCapacity;

    public Product(int id, String name, String brand, int discountPercentage, int stockNumber, int price, int storage, int screenSize, int ramCapacity) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.discountPercentage = discountPercentage;
        this.stockNumber = stockNumber;
        this.price = price;
        this.storage = storage;
        this.screenSize = screenSize;
        this.ramCapacity = ramCapacity;
    }

    @Override
    public String toString() {
        return " ID " + id +
                " Name " + name +
                " Brand " + brand +
                " Discount Percentage " + discountPercentage +
                " Stock Number " + stockNumber +
                " Price " + price +
                " Storage " + storage +
                " Screen " + screenSize +
                " Ram " + ramCapacity;
    }
}
