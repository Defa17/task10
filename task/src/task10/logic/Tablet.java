package task10.logic;

public class Tablet {
    private final String name;
    private final int memory;
    private final int rate;
    private final double price;

    public Tablet(String name, int memory, int rate, double price) {
        this.name = name;
        this.memory = memory;
        this.rate = rate;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", " + memory + ", " + rate + ", " + price;
    }

    public String getName() {
        return name;
    }

    public int getMemory() {
        return memory;
    }

    public int getRate() {
        return rate;
    }

    public double getPrice() {
        return price;
    }
}
