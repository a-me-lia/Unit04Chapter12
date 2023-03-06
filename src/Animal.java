public abstract class Animal implements Comparable<Animal>{
    private int numLegs;
    private boolean hasFur, avian, canBeEaten;
    private String color;
    private int classification; //1 mammal, 2 reptile, 3 insect, 4 amphibian, 5 fish, 6 bird

    public Animal(int numLegs, boolean hasFur, boolean avian, boolean canBeEaten, String color, int classification) {
        this.numLegs = numLegs;
        this.hasFur = hasFur;
        this.avian = avian;
        this.canBeEaten = canBeEaten;
        this.color = color;
        this.classification = classification;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public boolean isAvian() {
        return avian;
    }

    public boolean isCanBeEaten() {
        return canBeEaten;
    }

    public String getColor() {
        return color;
    }

    public int getClassification() {
        return classification;
    }

    public abstract String speak();

    public String toString(){
        return "A " + getClass()
                .getName()
                .toLowerCase()
        + " says " + speak();
    }
}