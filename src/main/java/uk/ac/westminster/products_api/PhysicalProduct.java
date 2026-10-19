package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product{
    private double weightkg;
    private String dimensions;

    public PhysicalProduct(Long id,String name,double price,double weightkg, String dimensions){
        super(id,name,price);

        this.weightkg= weightkg;
        this.dimensions=dimensions;
    }

    public double getWeightkg(){
        return weightkg;
    }

    public String getDimensions(){
        return dimensions;
    }
}
