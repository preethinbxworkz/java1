class Shampoo {
    String brandName;
    int qty;
    String type;
    double price;
    String mgfDate;
    String expDate;

    public Shampoo(String brandName, int qty, String type, double price, String mgfDate, String expDate) {

            this.brandName = brandName;
            this.qty = qty;
            this.type = type;
            this.price = price;
            this.mgfDate = mgfDate;
            this.expDate = expDate;
        
    }

    public void getDetails() {
        System.out.println("Brand Name of shampoo is: " + this.brandName);
        System.out.println("Quantity of shampoo is: " + this.qty);
        System.out.println("Type of shampoo is: " + this.type);
        System.out.println("Price of shampoo is: " + this.price);
        System.out.println("Manufacturing Date of shampoo is: " + this.mgfDate);
        System.out.println("Expiry Date of shampoo is: " + this.expDate);
    }
}
