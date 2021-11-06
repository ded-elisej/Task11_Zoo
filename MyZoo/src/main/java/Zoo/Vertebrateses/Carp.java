package Zoo.Vertebrateses;

import Zoo.Water;

public class Carp extends Fish implements Water {
    String name;
    public Carp (String name){
        this.name = name;
    }

    @Override
    public String whoIAm() {
        String inform = "I am fish carp";
        return inform;
    }

    @Override
    public String iAmBreathing() {
        String breath = "I am breathing with gills.";
        return breath;
    }

    @Override
    public String iAmMoving() {
        String move = "I swim in water.";
        return move;
    }

    @Override
    public String iHaveSkeleton() {
        String skeleton = "I'm vertebrates. I have sceleton.";
        return skeleton;
    }

    @Override
    public String iAmFish() {
        String type = "I'm fish. I swim in water.";
        return type;
    }

    @Override
    public String canYouSwim() {
        String swim = "I can swim!";
        return swim;
    }

    public String inform(){
        String informAboutThisAnimal = " I'm carp. I am a freshwater fish. I am very tasty, but very bony.";
        return informAboutThisAnimal;
    }
    public String toString(){
        return super.toString() + iHaveSkeleton() + iAmFish() + canYouSwim() + "\nMy name is " + this.name + inform();
    }
}
