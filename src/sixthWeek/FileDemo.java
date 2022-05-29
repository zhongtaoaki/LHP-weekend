import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileDemo {

    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        List<Student> students = new ArrayList<>();
        students.add(new Student("satou", 80));
        students.add(new Student("suzuki", 92));
        students.add(new Student("tanaka", 34));
        students.add(new Student("kojima", 59));
        students.add(new Student("matsumura", 60));
        students.add(new Student("yamasita", 61));
        students.add(new Student("tomiyama", 90));
        students.add(new Student("izumi", 100));

        // FileWriter fw = new FileWriter(file);
        // students.forEach(e -> {
        // try {
        // fw.write(e.toString());
        // fw.write("\n");
        // } catch (IOException e1) {
        // e1.printStackTrace();
        // }
        // });

        // fw.close();

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String s = "";

        while (s != null) {
            s = br.readLine();
            if (s != null) {
                System.out.println(s);
            }
        }

        br.close();

        Scanner scanner = new Scanner(System.in);
        scanner.close();

        System.out.println(1);

    }
}
