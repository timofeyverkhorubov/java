package lab8;

import java.io.*;

public class ex8 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("E:\\KLA\\KLADR_46.txt"), "cp1251"));
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("E:\\KLA\\KLADR_46_new.txt"), "cp1251"));

            String s;
            int k = 0;
            while ((s = br.readLine()) != null) {
                k++;
                System.out.println(k + " " + s);
                bw.write(s);
                bw.newLine();
                bw.flush();
            }
            br.close();
            bw.close();

        } catch (IOException e) {
            System.out.println("Ошибка!!!!!!!");
        }
    }
}