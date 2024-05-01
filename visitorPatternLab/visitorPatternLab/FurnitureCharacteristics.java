package visitorPatternLab.visitorPatternLab;

public interface FurnitureCharacteristics {
    public double accept(ProductDetails productDetails, String furnitureSize, String furnitureType);
    public double accept(ShippingDetails shippingDetails, String furnitureSize);
}