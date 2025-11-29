package subject;

import observer.CustomObserver;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private List<CustomObserver> observers = new ArrayList<>();
    private String symbol;
    private double price;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public double getPrice() { return price; }

    @Override
    public void attach(CustomObserver o) {
        observers.add(o);
    }

    @Override
    public void detach(CustomObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (CustomObserver o : observers) {
            o.update(this);
        }
    }
}