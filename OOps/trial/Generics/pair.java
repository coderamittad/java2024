package OOps.trial.Generics;

import java.util.ArrayList;

public class pair <t extends Object> {
    public void setValue(t value) {
        this.value=value;
    }

    public void setKey(t key) {
        this.key = key;
    }

    private t key;
    private t value;

    public t getKey() {
        return key;
    }

    public t getValue() {
        return value;
    }

}
