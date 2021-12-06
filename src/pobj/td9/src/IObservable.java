import java.util.Collection;

public interface IObservable<T> {
    void addObserver(IObserver<T> observer);

    Collection<IObserver<T>> getObservers();

    void deleteObservers();

    int countObservers();
}
