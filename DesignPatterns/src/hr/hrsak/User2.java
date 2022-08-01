package hr.hrsak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class User2 {
    static List<String> strings = new ArrayList<>();
    private int[] names;

    public User2(String fullName) {

        Function<String, Integer> getOrAdd = (String s) ->{
            int idx= strings.indexOf(s);
            if (idx != -1) return idx;
            else{
                strings.add(s);
                return  strings.size()-1;
            }
        };
        names = Arrays.stream(fullName.split(" "))
                .mapToInt(s -> getOrAdd.apply(s))
                .toArray();

    }

    @Override
    public String toString() {
        return strings.get(names[0]) + " " + strings.get(names[1]);
    }
}
