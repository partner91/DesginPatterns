package hr.hrsak;

import org.javatuples.Triplet;

import java.util.List;

public class Research {

    public Research(RelationshipBrowser browser){
        List<Person> john = browser.findAllChildrenOf("John");
        for(Person child: john){
            System.out.println("John has a child " + child.name );
        }
    }
}
