interface Product {
    double getPrice();
    double getDiscount();
}
class FoodProduct implements Product {
    private double price;

    public FoodProduct(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return price * 0.15;
    }
}
class ElectronicsProduct implements Product {
    private double price;

    public ElectronicsProduct(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return price * 0.10;
    }
}
class ClothingProduct implements Product {
    private double price;

    public ClothingProduct(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return price * 0.25;
    }
}
class DiscountCalculator {
    public double calculateTotalDiscount(Product product) {
        return product.getDiscount();
    }
}
public class Main {
    public static void main(String[] args) {
        Product foodProduct = new FoodProduct(110.0);
        Product electronicsProduct = new ElectronicsProduct(225.0);
        Product clothingProduct = new ClothingProduct(200.0);

        DiscountCalculator discountCalculator = new DiscountCalculator();

        double foodDiscount = discountCalculator.calculateTotalDiscount(foodProduct);
        double electronicsDiscount = discountCalculator.calculateTotalDiscount(electronicsProduct);
        double clothingDiscount = discountCalculator.calculateTotalDiscount(clothingProduct);


        System.out.println("Discount on food: " + foodDiscount);
        System.out.println("Discount on electronics: " + electronicsDiscount);
        System.out.println("Discount on clothes: " + clothingDiscount);
    }
}
