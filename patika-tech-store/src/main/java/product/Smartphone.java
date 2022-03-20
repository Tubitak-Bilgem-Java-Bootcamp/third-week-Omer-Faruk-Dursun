package product;

public class Smartphone extends Product{

    private final String color;
    private final int batteryCapacity;
    private final int cameraMegapixels;

    public Smartphone(int id,
                      String name,
                      String brand,
                      int discountPercentage,
                      int stockNumber,
                      int price,
                      int storage,
                      int screenSize,
                      int ramCapacity,
                      String color,
                      int batteryCapacity,
                      int cameraMegapixels) {

        super(id, name, brand, discountPercentage, stockNumber, price, storage, screenSize, ramCapacity);
        this.color = color;
        this.batteryCapacity = batteryCapacity;
        this.cameraMegapixels = cameraMegapixels;
    }

    @Override
    public String toString() {
        String text = super.toString() +
                " Color " + color +
                " Battery Capacity" + batteryCapacity +
                " Camera Megapixels " + cameraMegapixels;

        return text;
    }
}
