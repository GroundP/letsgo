package StandardIO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    void InputStreamPrac(){
        try {
            InputStream in = System.in;
            int a;

            a = in.read();
            System.out.println(a);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    void InputStreamReader(){
        try{
            InputStream in = System.in;
            InputStreamReader reader = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(reader);
            //BufferedInputStream bi = new BufferedInputStream(in);

            String a = br.readLine();
            System.out.println(a);

            //bi.readAllBytes();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    void ScannerPrac(){
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
    }
    public static void main(String[] args) {
        Input i = new Input();
        //i.InputStreamPrac();
        //i.InputStreamReader();

        i.ScannerPrac();
    }
}
