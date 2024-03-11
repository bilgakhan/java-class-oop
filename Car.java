public class Car {
    private String color;
    private String modeli;
    private double price;
    private String karobka;

    public Car(String color, String modeli, double price, String karobka) {
        this.color = color;
        this.modeli = modeli;
        this.price = price;
        this.karobka = karobka;
    }

    public String getcolor() {
        return color;
    }

    public String getModel() {
        return modeli;
    }

    public double getprice() {
        return price;
    }

    public String getKarobka() {
        return karobka;
    }

    public String toString() {
        return "Model: " + modeli + "\ncolor: " + color + "\nprice: " + price + "\nkarobka: " + karobka;
    }
}