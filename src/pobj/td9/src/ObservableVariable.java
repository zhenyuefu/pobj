public class ObservableVariable<T> extends AbstractObservable<T> {
    protected T value;
    protected IObserver<T> listener;

    public ObservableVariable(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        if (this.value.equals(value)) {
            return;
        }
        for (IObserver<T> observer : getObservers()) {
            if (observer.equals(this.value))
                observer.update(this, this.value, value);
        }
        this.value = value;
    }

    private boolean isBound() {
        return listener != null;
    }

    public boolean bind(ObservableVariable<T> other) {
        if (isBound()) {
            return false;
        }
        this.setValue(other.getValue());
        listener = new IObserver<T>() {
            @Override
            public void update(IObservable<T> observable, T oldValue, T newValue) {
                setValue(newValue);
            }
        };
        other.addObserver(listener);
        return true;
    }

    public boolean bindBidirectional(ObservableVariable<T> other) {
        if (bind(other) && other.bind(this)) {
            return true;
        }
        return false;
    }

    public boolean unbind() {
        if (!isBound()) {
            return false;
        }
        if (getObservers().remove(listener)) {
            listener = null;
            return true;
        }
        return false;
    }

}
