package Zoo.Vertebrateses;

import Zoo.Animals;

public class Snake extends Reptiles {
    String name;
    public Snake (String name){
        this.name = name;
    }

    @Override
    public String whoIAm() {
        String inform = "I am reptiles snake.";
        return inform;
    }

    @Override
    public String iAmBreathing() {
        String breath = "I'm breath by air.";
        return breath;
    }

    @Override
    public String iAmMoving() {
        String move = "I move with my body without legs.";
        return move;
    }

    @Override
    public String iHaveSkeleton() {
        String skeleton = "I'm vertebrates. I have skeleton.";
        return skeleton;
    }

    @Override
    public String iAmReptiles() {
        String type = "Hi, i'm reptile.";
        return type;
    }

    public String inform(){
        String informAboutThisAnimal = " I'm snake. I have no limbs, my sizes are very diverse. I live everywere.";
        return informAboutThisAnimal;
    }

    public String toString(){
        return super.toString() + iHaveSkeleton() + this.iAmReptiles() + "\nMy name is " + this.name + this.inform();
    }
}
