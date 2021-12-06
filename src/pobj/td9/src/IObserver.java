public interface IObserver<T> {
    void update(IObservable<T> o, T oldval, T newval);
}
