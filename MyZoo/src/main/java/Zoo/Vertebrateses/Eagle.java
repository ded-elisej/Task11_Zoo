package Zoo.Vertebrateses;

import Zoo.Flying;

public class Eagle extends Birds implements Flying {
    String name;
    public Eagle (String name){
        this.name = name;
    }

    @Override
    public String whoIAm() {
        String inform = "I am bird eagle.";
        return inform;
    }

    @Override
    public String iAmBreathing() {
        String breath = "I'm breath by air.";
        return breath;
    }

    @Override
    public String iAmMoving() {
        String move = "I usually fly with my wings.";
        return move;
    }

    @Override
    public String iHaveSkeleton() {
        String skeleton = "I'm vertebrates. I have skeleton.";
        return skeleton;
    }

    @Override
    public String iAmBird() {
        String type = "I'm bird.";
        return type;
    }

    @Override
    public String canIFly() {
        String fly = "I can fly!";
        return fly;
    }

    public String inform(){
        String informAboutThisAnimal = " I'm eagle. I fly great. I look better in profile than in full face.";
        return informAboutThisAnimal;
    }

    public String toString(){
        return super.toString() + iHaveSkeleton() + iAmBird() + canIFly() + "\nMy name is " + this.name + inform();
    }
}
