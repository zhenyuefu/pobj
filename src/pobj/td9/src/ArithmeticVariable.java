public class ArithmeticVariable extends ObservableVariable<Integer> {

    ArithmeticVariable(Integer value) {
        super(value);
    }

    public void sum(final ArithmeticVariable... variables) {
        this.listener = new IObserver<Integer>() {
            @Override
            public void update(IObservable<Integer> o, T oldval, T newval) {
                setValue(getValue() + newval - oldval);
            }
        };
        Integer sum = 0;
        for (ArithmeticVariable variable : variables) {
            sum += variable.getValue();
            variable.addObserver(listener);
        }
        this.setValue(sum);
    }
}
