package Zoo;

import Zoo.Vertebrateses.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Map<Integer, Animals> myZoo = new HashMap<Integer, Animals>();

    public static void main(String[] args) {

        Animals indianTiger = new Tiger("Stripy");
        Animals greyWolf = new Volf("Wolfy");
        Animals tulen = new Seal("Sea kitty");
        Animals zebra1 = new Zebra("Black & white");
        Animals whiteRat = new Rat("Splinter");
        Animals rabbit1 = new Rabbit("Roger");
        Animals carp1 = new Carp("Carpich");
        Animals goldenEagle = new Eagle("Reshka");
        Animals froggy = new Frog("Crazy");
        Animals kingPenguin = new Penguin("King");
        Animals blackMamba = new Snake("Bill");

        myZoo.put(1, indianTiger);
        myZoo.put(2, greyWolf);
        myZoo.put(3, tulen);
        myZoo.put(4, zebra1);
        myZoo.put(5, whiteRat);
        myZoo.put(6, rabbit1);
        myZoo.put(7, carp1);
        myZoo.put(8, froggy);
        myZoo.put(9, blackMamba);
        myZoo.put(10, goldenEagle);
        myZoo.put(11, kingPenguin);

        zooListCall();
        getInformAboutAnimalFromZooList();
    }

    static void zooListCall(){
        for (Map.Entry<Integer, Animals> number : myZoo.entrySet()) {
            System.out.printf("Key: %d  Value: %s \n", number.getKey(), number.getValue().getClass().getSimpleName());
        }
    }

    static void getInformAboutAnimalFromZooList(){
        System.out.print("Please, choose menu number: ");
        int menuNumber = new Scanner(System.in).nextInt();
        System.out.println(myZoo.get(menuNumber));

    }
}

