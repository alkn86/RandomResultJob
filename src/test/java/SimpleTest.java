package src.test.java;

import junit.framework.Assert;
import org.junit.Test;
import java.util.Random;


/**
 * Created by gadiel on 15/11/2016.
 */
public class SimpleTest {
      
      public void sayHallo(){ Assert.assertEquals(5,4);}

      
//Some new thing
      public void alwaysPass4()
   {
       Assert.assertEquals(1, 1);
   }
   
   @Test
   public void alwaysPass3()
   {
       Assert.assertEquals(1, 1);
   }
   
   @Test
   public void alwaysPass1()
   {
       Assert.assertEquals(1, 1);
   }

     @Test
    public void alwaysPass2()
    {
       
        Assert.assertEquals(1, 1);
    }
  

     //@Test
    public void alwaysFail1()
    {
        Assert.assertEquals(1, 0);
    }

    @Test
    public void alwaysFail2()
    {
        Assert.assertEquals(1, 0);
    }

     @Test
    public void sometimesPass1()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFifee, true);
    }

    //@Test
    public void sometimesPass2()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFifee, true);
    }
      
}
