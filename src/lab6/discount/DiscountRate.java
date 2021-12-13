package lab6.discount;

public class DiscountRate {
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.2;
    private static double productDiscountGold = 0.15;
    private static double productDiscountSilver = 0.1;

    public static double getServiceDiscount(String type) {
        return switch (type) {
            case "Premium" -> serviceDiscountPremium;
            case "Gold" -> serviceDiscountGold;
            case "Silver" -> serviceDiscountSilver;
            default -> 0;
        };
    }

    public static double getProductDiscount(String type) {
        return switch (type) {
            case "Premium" -> productDiscountPremium;
            case "Gold" -> productDiscountGold;
            case "Silver" -> productDiscountSilver;
            default -> 0;
        };
    }
}
