package FileIO;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Writer {
    void FileOutput(){
        try {
            FileOutputStream fo = new FileOutputStream("C:/MTFX/test.txt");
            for ( int i = 0; i < 11; i++)
            {
                String data = i + "번 줄입니다.\n";
                fo.write(data.getBytes(StandardCharsets.UTF_8));
            }
            fo.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    void FileWriter(){
        try {
            FileWriter fw = new FileWriter("C:/MTFX/test.txt");
            for ( int i = 0; i < 20; i++)
            {
                String data = i + "번 줄입니다.\n";
                fw.write(data);
            }
            fw.close();

            FileWriter fw2 = new FileWriter("C:/MTFX/test.txt", true);
            for(int i=0; i<20; i++) {
                String data = i+" 번째 줄 추가입니다.\r\n";
                fw2.write(data);
            }
            fw2.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    void PrintWriter(){
        try {
            PrintWriter pw = new PrintWriter("C:/MTFX/test.txt");
            for ( int i = 0; i < 30; i++)
            {
                String data = i + "번 줄입니다.";
                pw.println(data);
            }
            pw.close();

            PrintWriter pw2 = new PrintWriter(new FileWriter("C:/MTFX/test.txt", true));
            for(int i=0; i<30; i++) {
                String data = i+" 번째 줄 추가입니다.";
                pw2.println(data);
            }
            pw2.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Writer w = new Writer();
        w.FileOutput();
        //w.FileWriter();
        //w.PrintWriter();
    }
}
