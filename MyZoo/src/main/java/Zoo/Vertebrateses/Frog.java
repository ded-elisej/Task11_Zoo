package Zoo.Vertebrateses;

public class Frog extends Amphibians {
    String name;
    public Frog (String name){
        this.name = name;
    }

    @Override
    public String whoIAm() {
        String inform = "I am amphibians frog";
        return inform;
    }

    @Override
    public String iAmBreathing() {
        String breath = "I'm breath by air.";
        return breath;
    }

    @Override
    public String iAmMoving() {
        String move = "I usually jump with my paws.";
        return move;
    }

    @Override
    public String iHaveSkeleton() {
        String skeleton = "I'm vertebrates. I have skeleton.";
        return skeleton;
    }

    @Override
    public String iAmAmphibians() {
        String type = "Hi, i'm amphibian.";
        return type;
    }

    public String inform(){
        String informAboutThisAnimal = " I'm frog. I usually jump and catch flies with my lingering tongue.";
        return informAboutThisAnimal;
    }
    public String toString(){
        return super.toString() + iHaveSkeleton() + iAmAmphibians()+ "\nMy name is " + this.name + inform();
    }
}

