package OOps.trial.Generics;

public class StringContainer<t> implements container<t>{
    private t item;
    @Override
    public void add(t item) {
        this.item=item;
    }

    @Override
    public t get() {
        return item;
    }
}
