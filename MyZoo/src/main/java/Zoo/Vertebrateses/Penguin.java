package Zoo.Vertebrateses;

import Zoo.Water;

public class Penguin extends Birds implements Water {
    String name;
    public Penguin (String name){
        this.name = name;
    }

    @Override
    public String whoIAm() {
        String inform = "I am bird penguin";
        return inform;
    }

    @Override
    public String iAmBreathing() {
        String breath = "I'm breath by air.";
        return breath;
    }

    @Override
    public String iAmMoving() {
        String move = "I move with my lower legs. Sometimes I swim.";
        return move;
    }

    @Override
    public String iHaveSkeleton() {
        String skeleton = "I'm vertebrates. I have skeleton.";
        return skeleton;
    }

    @Override
    public String iAmBird() {
        String type = "I'm bird, but i can't fly.";
        return type;
    }

    @Override
    public String canYouSwim() {
        String swim = "I can swim!";
        return swim;
    }

    public String inform(){
        String informAboutThisAnimal = " I'm penguin. I can't fly, but I can swim perfectly. I live in Antarctica.";
        return informAboutThisAnimal;
    }
    public String toString(){
        return super.toString() + iHaveSkeleton() + iAmBird() + canYouSwim() + "\nMy name is " + this.name + inform();
    }
}
