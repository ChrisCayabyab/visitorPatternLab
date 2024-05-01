package visitorPatternLab.visitorPatternLab;

import java.util.HashMap;
import java.util.Map;

public class ProductCostCalculator implements ProductDetails{
    private static Map<String, Double> productPriceMap = new HashMap<>();

    static {
        productPriceMap.put("Chair", 100.0);
        productPriceMap.put("Table", 500.0);
        productPriceMap.put("Sofa", 1000.0);
    }

    private static Map<String, Double> sizeMultiplierMap = new HashMap<>();

    static {
        sizeMultiplierMap.put("Small", 1.0);
        sizeMultiplierMap.put("Medium", 1.5);
        sizeMultiplierMap.put("Large", 2.0);
    }
    @Override
    public double showPrice(String furnitureType, String furnitureSize){
     double productPrice= productPriceMap.getOrDefault(furnitureType, 0.0) *  sizeMultiplierMap.getOrDefault(furnitureSize, 0.0);
        return productPrice;
        
    }

    
}
