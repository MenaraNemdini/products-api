package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {
    private  String downloadurl;
    private double fileSizeMB;


    public DigitalProduct(Long id,String name,double price,String downloadurl,double fileSizeMB ){
        super(id,name,price);
        this.downloadurl= downloadurl;
        this.fileSizeMB= fileSizeMB;
    }

    public String getDownloadurl() {
        return downloadurl;
    }

    public double getFileSizeMB(){
        return fileSizeMB;
    }

}
