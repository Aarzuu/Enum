public enum Beverages {
    beer(2.55),
    chocoMilk(0.95),
    cocaCola(1.40),
    coffee(1.60),
    orangeJuice(1.40),
    pepsi(1.39),
    water(0.40);

    private final Double price;

    Beverages(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }
}
