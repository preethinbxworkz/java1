class SunGlasses {
    String name;
    String type;
    double price;

    public boolean create(String name, String type, double price) {
        boolean isSunGlassesCreated = false;
        if (name != null && type != null && price > 0.0d) {
            this.name = name;
            this.type = type;
            this.price = price;
            isSunGlassesCreated = true;
        }
        return isSunGlassesCreated;
    }

    public void getDetails() {
        System.out.println("Name of sunglasses: " + this.name);
        System.out.println("Type of sunglasses: " + this.type);
        System.out.println("Price of sunglasses: " + this.price);
    }
}
