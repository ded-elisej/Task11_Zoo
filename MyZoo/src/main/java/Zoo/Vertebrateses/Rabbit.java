package Zoo.Vertebrateses;

import Zoo.Pets;

public class Rabbit extends NonPredators implements Pets {
    String name;
    public Rabbit (String name){
        this.name = name;
    }

    @Override
    public String whoIAm() {
        String inform = "I'm vertebrates, i'm non-predator. My name is rabbit";
        return inform;
    }

    @Override
    public String iAmMoving() {
        String move = "I'm moving with 4 paws.";
        return move;
    }

    @Override
    public String iAmBreathing() {
        String breath = " I'm breathing by air.";
        return breath;
    }

    @Override
    public String iHaveSkeleton() {
        String skeleton = " I'm vertebrates. I have skeleton.";
        return skeleton;
    }

    @Override
    public String iAmMammals() {
        String type = " I'm mammals.";
        return type;
    }

    @Override
    public String iAmNonPredator() {
        String type2 = "I eat different plants.";
        return type2;
    }

    @Override
    public String canILiveAtHome() {
        String home = " I can often be a pet and live in a cage.";
        return home;
    }

    public String inform(){
        String informAboutThisAnimal = " I'm rabbit. Recently, I am a frequent pet. I'm soft and fluffy with long ears.";
        return informAboutThisAnimal;
    }
    public String toString(){
        return super.toString() + iHaveSkeleton() + iAmMammals() + iAmNonPredator() + canILiveAtHome() + "\nMy name is " + this.name + inform();
    }
}
