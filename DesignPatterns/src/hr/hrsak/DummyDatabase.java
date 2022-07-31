package hr.hrsak;


import java.util.Dictionary;
import java.util.Hashtable;

public class DummyDatabase implements Database {

    private Dictionary<String, Integer> data = new Hashtable<>();

    public DummyDatabase(){
        data.put("alpha",1);
        data.put("beta",2);
        data.put("gama",3);

    }

    @Override
    public int getPopulation(String name) {
        return data.get(name);
    }
}
