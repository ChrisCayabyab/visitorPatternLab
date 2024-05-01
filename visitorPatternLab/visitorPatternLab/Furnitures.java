package visitorPatternLab.visitorPatternLab;

public class Furnitures implements FurnitureCharacteristics{
    
    private String furnitureType;
    private String furnitureSize;
    private double distance;

    public Furnitures(String furnitureType, String furnitureSize, double distance){
        this.furnitureType = furnitureType;
        this.furnitureSize = furnitureSize;
        this.distance = distance;
    }

    public String getFurnitureType(){
        return furnitureType;
    }
    public String getFurnitureSize(){
        return furnitureSize;
    }
    public Integer getDistance(){
        return distance;
    }

    @Override
    public double accept(ProductDetails productDetails, String furnitureSize, String furnitureType){
        return productDetails.showPrice(furnitureType, furnitureSize);
    }

    @Override
    public double accept(ShippingDetails shippingDetails, String furnitureSize){
        return shippingDetails.showShippingCost(distance, furnitureSize, furnitureType);
    }

}