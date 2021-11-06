package Zoo.Vertebrateses;

public class Volf extends Predators {
    String name;
    public Volf (String name){
        this.name = name;
    }

    @Override
    public String whoIAm() {
        String inform = "I'm vertebrates, i'm predator. My name is wolf.";
        return inform;
    }

    @Override
    public String iAmMoving() {
        String move = "I'm moving with 4 paws.";
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
        String type2 = "I hunt other animals";
        return type2;
    }

    public String inform(){
        String informAboutThisAnimal = " I'm wolf. I live everywhere. I am the orderly of the forest. I howl often wooo!";
        return informAboutThisAnimal;
    }
    public String toString(){
        return super.toString() + iHaveSkeleton() + iAmMammals() + iAmPredator() + "\nMy name is " + this.name + inform();
    }
}
