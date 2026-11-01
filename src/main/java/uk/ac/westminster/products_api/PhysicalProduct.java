package uk.ac.westminster.products_api;

import javax.swing.plaf.PanelUI;

public class PhysicalProduct extends Product implements Discountable {
    private double weightkg;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct(Long id, String name, double price, double weightkg, String dimensions) {
        super(id, name, price);

        this.weightkg = weightkg;
        this.dimensions = dimensions;
    }

    public double getWeightkg() {
        return weightkg;
    }

    public void setWeightkg(double weightkg){
        this.weightkg=weightkg;
    }


    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions){
        this.dimensions=dimensions;
    }

    @Override
    public String getSummary(){
        return "Product Name: "+getName()
                +"Price: " +getPrice()
                +"Weight Kg: "+getWeightkg()
                +"Dimensions: "+getDimensions();

    }

    public void applyDiscount(double rate){
        double capped= Math.min(rate, 0.20);
        discountedPrice= getPrice()*(1-capped);
    }

    public double getDiscountedPrice(){
        return getDiscountedPrice();
    }

    public void setDiscouuntedPrice(double discouuntedPrice){
        this.discountedPrice=discouuntedPrice;
    }

}
