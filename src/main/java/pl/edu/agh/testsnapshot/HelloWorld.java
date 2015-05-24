package pl.edu.agh.testsnapshot;

import org.apache.cloudstack.utils.qemu.QemuImg;
import org.apache.cloudstack.utils.qemu.QemuImgException;
import org.apache.cloudstack.utils.qemu.QemuImgFile;

import java.util.Map;

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public String getMessage(){
        System.out.println("Your Message : " + message);
        return message;
    }

    public void doSth(String srcFileName, String destFileName) throws QemuImgException {
        QemuImg.PhysicalDiskFormat srcFormat = QemuImg.PhysicalDiskFormat.VMDK;
        QemuImg.PhysicalDiskFormat destFormat = QemuImg.PhysicalDiskFormat.RAW;

        QemuImgFile srcFile = new QemuImgFile(srcFileName, srcFormat);
        QemuImgFile destFile = new QemuImgFile(destFileName, destFormat);

        QemuImg qemu = new QemuImg(0);
        qemu.convert(srcFile, destFile);

        Map<String, String> info = qemu.info(destFile);

        QemuImg.PhysicalDiskFormat infoFormat = QemuImg.PhysicalDiskFormat.valueOf(info.get(new String("format")).toUpperCase());
        System.out.println("infoFormat: " + infoFormat);
        System.out.println("destFormat: " + destFormat);

        Long infoSize = Long.parseLong(info.get(new String("virtual_size")));
        System.out.println("Long.valueOf(infoSize): " + Long.valueOf(infoSize));
    }
}