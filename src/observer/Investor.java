package observer;

import subject.Stock;

public class Investor implements CustomObserver {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(Stock stock) {
        System.out.println("Hello " + name + ", Stock price updated to: " + stock.getPrice());
    }
}