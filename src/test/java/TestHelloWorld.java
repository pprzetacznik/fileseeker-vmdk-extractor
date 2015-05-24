import org.apache.cloudstack.utils.qemu.QemuImgException;
import org.junit.Assert;
import org.junit.Test;
import pl.edu.agh.testsnapshot.HelloWorld;

public class TestHelloWorld {

    HelloWorld helloWorld = new HelloWorld();

    @Test
    public void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("aaa");
        Assert.assertTrue(helloWorld.getMessage().contains("aaa"));

        System.out.println("aaab");
    }

    @Test
    public void doSth() throws QemuImgException {
        helloWorld.doSth("Damn_Small_Linux-disk1.vmdk", "dsl.img");
    }

}
