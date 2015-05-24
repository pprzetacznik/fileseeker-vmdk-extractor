package pl.edu.agh.testsnapshot;

import org.apache.cloudstack.utils.qemu.QemuImgFile;

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public String getMessage(){
        System.out.println("Your Message : " + message);
        return message;
    }

    public void doSth() {
//        QemuImgFile qemuImgFile = new QemuImgFile("dsl.vmdk", QemuImg.PhysicalDiskFormat.VMDK );
    }
}