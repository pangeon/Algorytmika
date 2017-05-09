/*
Proszę uruchomić i prześledzić działanie poniższego programu. 
Kiedy działa błędnie i jak temu zaradzić?
*/
package Zad13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import static java.lang.System.out;

public class ReadBytes {

    public static void main(String[] args) throws IOException {
        //działa błędnie gdy używam polskich znaków.
        char data4[] = new char[10];
        String napis = "";
        
        System.out.println("Napisz kilka znaków  ");
        // System.in.read(data4);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Writer out = new BufferedWriter(new OutputStreamWriter(System.out));
        reader.read();
        
        //System.out.print("Wprowadziłeś:  ");
        
        for(int i=0; i < data4.length; i++) {
            napis = napis + (char) data4[i] + reader.read();
          
            System.out.print(napis);
            //System.out.print(data4[i]);
            //out.write(napis);
            
        }
    }
    // prędzej zgłupieje niż wyświetle znaki polskie
}
