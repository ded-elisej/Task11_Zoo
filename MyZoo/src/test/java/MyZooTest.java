import Zoo.Animals;
import Zoo.Flying;
import Zoo.Vertebrateses.Eagle;
import Zoo.Vertebrateses.Rabbit;
import Zoo.Vertebrateses.Tiger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class MyZooTest {
    static Map<Integer, Animals> myZoo = new HashMap<Integer, Animals>();
    int count = 0;

    @Test
    public void animalShouldAddToMap(){
        Animals indianTiger = new Tiger("Sharhan");
        myZoo.put(11, indianTiger);
        count++;

        Assert.assertEquals(count, myZoo.size());

    }

    @Test
    public void tigerShouldMoveWith4Paws(){
        Animals siberianTiger = new Tiger("Amur");
        myZoo.put(12, siberianTiger);

        String expectedMove = "I'm moving with 4 paws.";
        String actualMove = siberianTiger.iAmMoving();

        Assert.assertEquals(actualMove, expectedMove);
    }

    @Test
    public void eagleShouldFlying(){
        Animals greyEagle = new Eagle("Greys");
        myZoo.put(13, greyEagle);
        String expectedFly = "I can fly!";
        String actualFly = ((Eagle) greyEagle).canIFly();

        Assert.assertEquals(actualFly, expectedFly);

    }

    @Test
    public void rabbitShouldNotFlying(){
        Animals whiteRabbit = new Rabbit("Bugz Bunny");
        myZoo.put(14, whiteRabbit);
        Class<?> classOfWhiteRabbit = Rabbit.class;
        boolean expectedFly = false;
        boolean actualFly = Flying.class.isAssignableFrom(classOfWhiteRabbit);

        Assert.assertTrue(actualFly == expectedFly);

    }
}
