package Zoo.Vertebrateses;

public class Zebra extends NonPredators {
    String name;
    public Zebra (String name){
        this.name = name;
    }

    @Override
    public String whoIAm() {
        String inform = "I'm vertebrates, i'm non-predator. My name is zebra.";
        return inform;
    }

    @Override
    public String iAmMoving() {
        String move = "I'm moving with 4 legs.";
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
    public String iAmNonPredator() {
        String type2 = "I eat grass. I don't hunt other animals.";
        return type2;
    }

    public String inform(){
        String informAboutThisAnimal = " I'm zebra. My distinguishing feature is the striped black and white colors. I live in Africa and feed on plants.";
        return informAboutThisAnimal;
    }
    public String toString(){
        return super.toString() +  iHaveSkeleton() + iAmMammals() + iAmNonPredator() + "\nMy name is " + this.name + inform();
    }
}
