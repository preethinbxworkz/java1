class SunGlasses {
    String name;
    String type;
    double price;

    public SunGlasses(String name, String type, double price) {
      
            this.name = name;
            this.type = type;
            this.price = price;
    }

    public void getDetails() {
        System.out.println("Name of sunglasses: " + this.name);
        System.out.println("Type of sunglasses: " + this.type);
        System.out.println("Price of sunglasses: " + this.price);
    }
}
