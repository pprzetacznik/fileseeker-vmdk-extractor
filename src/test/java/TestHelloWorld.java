import org.apache.cloudstack.utils.qemu.QemuImg;
import org.apache.cloudstack.utils.qemu.QemuImgException;
import org.apache.cloudstack.utils.qemu.QemuImgFile;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pl.edu.agh.testsnapshot.HelloWorld;

import java.io.File;
import java.util.Map;
import java.util.UUID;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Piotrek
 * Date: 14.09.13
 * Time: 02:16
 * To change this template use File | Settings | File Templates.
 */
public class TestHelloWorld {

    @Autowired
    HelloWorld helloWorld;

    @Test
    public void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("aaa");
        Assert.assertTrue(helloWorld.getMessage().contains("aaa"));

        System.out.println("aaab");
    }

    @Test
    public void doSth() throws QemuImgException {
        helloWorld.doSth("abc", "def");
    }

}
