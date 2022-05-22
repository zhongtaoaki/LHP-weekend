package random;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {

    public static void main(String[] args) throws IOException {
        
        File file = new File("object.txt");
        if (file.exists()) {
            file.delete();
            System.out.println("object.txt has been deleted");
        }
        file.createNewFile();
        System.out.println("object.txt has been created");
        FileOutputStream outFile = new FileOutputStream("object.txt");
        ObjectOutputStream outObject = new ObjectOutputStream(outFile);

        List<Bean> list = new ArrayList<>();
        list.add(new Bean("缪同学", 1));
        list.add(new Bean("姜同学", 1));
        list.add(new Bean("王聪同学", 1));
        list.add(new Bean("王洋同学", 1));
        list.add(new Bean("李源同学", 1));
        list.add(new Bean("康同学", 1));
        list.add(new Bean("荊健耘同学", 1));
        list.add(new Bean("苑承祖光同学", 1));
        list.add(new Bean("兰同学", 1));
        list.add(new Bean("宋同学", 1));
        list.add(new Bean("吕同学", 1));
        list.add(new Bean("汪雪同学", 1));

        outObject.writeObject(list);
        outObject.close();
        outFile.close();
    }
    
}
