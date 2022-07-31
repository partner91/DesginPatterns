package hr.hrsak;


import org.junit.Test;
import org.junit.Assert;

import java.util.List;

public class Tests {

    @Test
    public void dependentPopulationTest()
    {
        final DummyDatabase db = new DummyDatabase();
        final ConfigurableRecordFinder rf = new ConfigurableRecordFinder(db);
        Assert.assertEquals(4, rf.getTotalPopulation(
                List.of("alpha", "gama")
        ));


    }
}
