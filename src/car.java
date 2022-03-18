class cardemo {
    String model, brand,colour;
    int year,quantity;
    double price;

    cardemo(String brand, String model,
        int year, String colour,int quantity , double price){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.colour=colour;
        this.quantity=quantity;
        this.price=price;

    }

    public String getModel() {
        return model=model;
    }

    public String getBrand() {
        return brand=brand;
    }

    public double getPrice() {
        return price=price;
    }

    public int getQuantity() {
        return quantity=quantity;
    }

    public int getYear() {
        return year=year;
    }

    public String getColour() {
        return colour=colour;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setYear(int year) {
        this.year = year;
    }
    void delievery(int increment){
        this.quantity=quantity += increment;

    }
    void sell(int decrease){
        this.quantity=quantity-=decrease;
    }

    @Override
    public String toString() {
        return "car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}

public class car{
    public static void main(String[] args){
        cardemo tj = new cardemo("Bugatti","Chiron",2016,"black",1,2000000.00);

        System.out.println(tj.toString());

        tj.setQuantity(23);
        System.out.println("");
        System.out.println(tj.toString());

        tj.setModel("Ferrari");
        System.out.println("");
        System.out.println(tj.toString());

    }
}