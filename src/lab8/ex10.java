package lab8;

import java.io.*;

public class ex10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("E:\\MyFile1.txt"), "cp1251"));
            out = new PrintWriter("E:\\MyFile2.txt", "cp1251");

            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!!!!!!");
        } finally {
            if (br != null)
                br.close();
            if (out != null)
                out.close();
        }
    }
}