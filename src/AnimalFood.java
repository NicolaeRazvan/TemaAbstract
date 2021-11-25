public class AnimalFood {
    private String name;
    private double price;
    private int quantity;
    private boolean isAvailable;

    public void print(){
        System.out.println("name: " +name + ", price: " +price + ",quantity: " +quantity + ", isAvailable: " +isAvailable);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
