package subject;

import observer.CustomObserver;

import java.util.Observer;

interface Subject {
    void attach(CustomObserver o);
    void detach(CustomObserver o);
    void notifyObservers();
}