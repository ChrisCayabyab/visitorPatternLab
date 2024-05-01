package visitorPatternLab.visitorPatternLab;
import java.util.HashMap;
import java.util.Map;

public class ShippingCostCalculator implements ShippingDetails {
    private static Map<String, Double> sizeFee = new HashMap<>();
    static {
        sizeFee.put("Small", 10.0);
        sizeFee.put("Medium", 15.0);
        sizeFee.put("Large", 20.0);
    }

    private static Map<String, Boolean> furnitureFee = new HashMap<>();
    static {
        furnitureFee.put("Chair", true);
        furnitureFee.put("Table", false);
        furnitureFee.put("Sofa", false);
    }

    @Override
    public double showShippingCost(double distance, String furnitureSize, String furnitureType) { 
        double baseFee = sizeFee.getOrDefault(furnitureSize, 0.0);
        boolean ItIsChair = furnitureFee.getOrDefault(furnitureType, true);
        
        if (ItIsChair) {
            return 10 * distance;
        }
        else
        {
            return baseFee * (distance);
        }
    }
}
