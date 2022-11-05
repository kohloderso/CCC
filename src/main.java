import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class main {

    public static void main(String[] args) throws IOException {
        File dir = new File ("input");
        File[] files = dir.listFiles();
        for (File file : files) {
            computeMin(file);
        }
    }


    public static void computeMin(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();

        String test = scanner.nextLine();

    int min = Integer.MAX_VALUE;

    int minIndex = -1;
    for (int i = 0; i < n; i++) {
        if (arr[i] < min) {
            min = arr[i];
            minIndex = i;
        }
    }
    System.out.println(minIndex);
        File outputFile = new File("./"+file.getName()+".out");
        PrintWriter out = new PrintWriter(outputFile);
        out.println(minIndex);
        out.close();
        scanner.close();
    }




}
