package pobj.td9;

import java.util.ArrayList;
import java.util.Collection;

public class AbstractObservable<T> implements IObservable<T> {
    private Collection<IObserver<T>> observers = new ArrayList<>();

    public void addObserver(IObserver<T> observer) {
        observers.add(observer);
    }

    public Collection<IObserver<T>> getObservers() {
        return observers;
    }

    public void deleteObservers() {
        observers.clear();
    }

    public int countObservers() {
        return observers.size();
    }

}
