public class StringAffichable extends ObservableVariable<String> {

    private int version = 0;

    public StringAffichable(String value) {
        super(value);
        this.addObserver(new IObserver<String>() {
            @Override
            public void update(IObservable<String> o, String oldval, String newval) {
                System.out.println("Version: " + version++ + " : " + newval);
            }
        });
    }

    @Override
    public void setValue(String value) {
        super.setValue(value);
    }

}
