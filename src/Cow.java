public class Cow extends Animal{
    private int stinkFactor;

    public Cow(int numLegs, boolean hasFur, boolean avian, boolean canBeEaten, String color, int classification, int stink) {
        super(numLegs, hasFur, avian, canBeEaten, color, classification);
        stinkFactor = stink;
    }

    public String speak(){
        return "moo";
    }

    public int compareTo(Animal other){
        if(other instanceof Cow)
            return stinkFactor - ((Cow)other).stinkFactor;
        return 0;
    }
}
