import org.junit.Assert;
import org.junit.Test;
import pl.edu.agh.testsnapshot.HelloWorld;

/**
 * Created with IntelliJ IDEA.
 * User: Piotrek
 * Date: 14.09.13
 * Time: 02:16
 * To change this template use File | Settings | File Templates.
 */
public class TestHelloWorld {

    @Test
    public void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("aaa");
        Assert.assertTrue(helloWorld.getMessage().contains("aaa"));

        System.out.println( "dupa" );
    }
}
