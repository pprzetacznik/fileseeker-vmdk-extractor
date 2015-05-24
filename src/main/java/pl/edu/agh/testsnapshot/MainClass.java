package pl.edu.agh.testsnapshot;

import org.apache.cloudstack.utils.qemu.QemuImgException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main( String[] args ) throws QemuImgException {
        System.out.println( "MainClass::main" );

        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();
        obj.doSth(args[0], args[1]);
    }
}