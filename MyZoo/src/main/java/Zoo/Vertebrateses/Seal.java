package Zoo.Vertebrateses;

import Zoo.Water;

public class Seal extends Predators implements Water {
    String name;
    public Seal (String name){
        this.name = name;
    }

    @Override
    public String whoIAm() {
        String inform = "I'm vertebrates, i'm predator. My name is seal";
        return inform;
    }

    @Override
    public String iAmMoving() {
        String move = "I'm moving with fins and tail.";
        return move;
    }

    @Override
    public String iAmBreathing() {
        String breath = "I'm breathing by air.";
        return breath;
    }

    @Override
    public String iHaveSkeleton() {
        String skeleton = "I'm vertebrates. I have skeleton.";
        return skeleton;
    }

    @Override
    public String iAmMammals() {
        String type = "I'm mammals.";
        return type;
    }

    @Override
    public String iAmPredator() {
        String type2 = "I hunt other fish and animals";
        return type2;
    }

    @Override
    public String canYouSwim() {
        String swim = "I can swim!";
        return swim;
    }

    public String inform(){
        String informAboutThisAnimal = " I'm seal. We are marine predators that swim great. But we also love to bask on the shore.";
        return informAboutThisAnimal;
    }
    public String toString(){
        return super.toString() + iHaveSkeleton() + iAmMammals() + iAmPredator() + canYouSwim() + "\nMy name is " + this.name + inform();
    }
}
