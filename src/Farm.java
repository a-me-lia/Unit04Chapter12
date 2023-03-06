import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
public class Farm {
    public static void main(String[] args) {
        ArrayList<Animal> myAnimals = new ArrayList<>();
        myAnimals.add(new Cow(4, true, true, false, "brown", 1, 10));
        myAnimals.add(new Chicken(2, false, true, true, "white", 6, 2));


        for(Animal a : myAnimals){
            System.out.println(a.toString());
        }
    }

}
