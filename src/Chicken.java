public class Chicken  extends Animal{
    private int numEggsPerDay;

    public Chicken(int numLegs, boolean hasFur, boolean avian, boolean canBeEaten, String color, int classification, int numEggs) {
        super(numLegs, hasFur, avian, canBeEaten, color, classification);
        numEggsPerDay = numEggs;
    }

    public String speak(){
        return "cluck and lays " + numEggsPerDay + " EGGS PER DAY";
    }

    public int compareTo(Animal other){
        if(other instanceof Chicken)
            return numEggsPerDay - ((Chicken)other).numEggsPerDay;
        return 0;
    }
}
