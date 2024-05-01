package visitorPatternLab.visitorPatternLab;

public class WoodShop {
    public static void main(String[] args) {
        Furnitures customer_one = new Furnitures("Chair", "Small", 10);
        Furnitures customer_two = new Furnitures("Chair", "Large", 10);
        Furnitures customer_three = new Furnitures("Table", "Medium", 10);
        Furnitures customer_four = new Furnitures("Table", "Large", 15);
        
        ProductDetails productDetails = new ProductCostCalculator();
        ShippingDetails ShippingDetails = new ShippingCostCalculator();

        System.out.println("Deer Customer, Your order of a " + customer_one.getFurnitureSize() + "-size " + customer_one.getFurnitureType() + " is successfully processed.");
        System.out.println("The amount for the product is: Php" + customer_one.accept(productDetails, customer_one.getFurnitureSize(), customer_one.getFurnitureType()));
        System.out.println("The Shipping Fee will be: " + customer_one.accept(ShippingDetails, customer_one.getFurnitureSize()));

        System.out.println("\nDeer Customer, Your order of a " + customer_two.getFurnitureSize() + "-size " + customer_two.getFurnitureType() + " is successfully processed.");
        System.out.println("The amount for the product is: Php" + customer_two.accept(productDetails, customer_two.getFurnitureSize(), customer_two.getFurnitureType()));
        System.out.println("The Shipping Fee will be: " + customer_two.accept(ShippingDetails, customer_two.getFurnitureSize()));

        System.out.println("\nDeer Customer, Your order of a " + customer_three.getFurnitureSize() + "-size " + customer_three.getFurnitureType() + " is successfully processed.");
        System.out.println("The amount for the product is: Php" + customer_three.accept(productDetails, customer_three.getFurnitureSize(), customer_three.getFurnitureType()));
        System.out.println("The Shipping Fee will be: " + customer_three.accept(ShippingDetails, customer_three.getFurnitureSize()));

        System.out.println("\nDeer Customer, Your order of a " + customer_four.getFurnitureSize() + "-sized " + customer_four.getFurnitureType() + " is successfully processed.");
        System.out.println("The amount for the product is: Php" + customer_four.accept(productDetails, customer_four.getFurnitureSize(), customer_four.getFurnitureType()));
        System.out.println("The Shipping Fee will be: " + customer_four.accept(ShippingDetails, customer_four.getFurnitureSize()));
        

    }
    
}
