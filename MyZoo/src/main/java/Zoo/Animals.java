package Zoo;

public abstract class Animals {
    String name;
    public abstract String whoIAm();
    public abstract String iAmBreathing();
    public abstract String iAmMoving();

    public String toString(){
        return this.whoIAm() + this.iAmBreathing() + this.iAmMoving();
    }
}
