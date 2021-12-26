package FileIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class Reader {

    void FileInput(){
        try {
            FileInputStream fi = new FileInputStream("C:/MTFX/test.txt");
            byte[] b = new byte[1024];
            fi.read(b);
            System.out.println(new String(b));
            fi.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    void useBuffer(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/MTFX/test.txt"));
            while (true){
                String line = br.readLine();
                if(line==null)
                    break;

                System.out.println(line);
            }
            br.close();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        Reader r = new Reader();
        //r.FileInput();
        r.useBuffer();
    }
}
