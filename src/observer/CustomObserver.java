package observer;

import subject.Stock;

public interface CustomObserver {
    void update(Stock stock);
}
