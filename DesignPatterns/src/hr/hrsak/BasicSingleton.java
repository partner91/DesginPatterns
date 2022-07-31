package hr.hrsak;

import org.apache.commons.lang3.SerializationUtils;

import java.io.ObjectInputStream;
import java.io.Serializable;

public class BasicSingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private BasicSingleton(){

    }
    private static final BasicSingleton INSTANCE = new BasicSingleton();
    public static BasicSingleton getInstance(){
        return INSTANCE;
    }

    private int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    protected Object readResolve(){
        return INSTANCE;
    }

}
