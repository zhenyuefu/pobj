package pobj.td9;

public interface IObserver<T> {
    void update(IObservable<T> o, T oldval, T newval);
}
