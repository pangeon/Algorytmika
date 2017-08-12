
package Polidrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PolidromeString {

    public static void main(String[] args) throws IOException {
       String strn;  
       int flag=0;  
       System.out.println("Enter the string:");  
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
       strn=br.readLine();  
       System.out.println("Result string is:");
       // sprawdzamy czy napis jest pildromem czyli jego odwrotność jest taka sama
       // jak napis np. level - level, ono - ono ; aneta już nie bo atena
        for (int i = 0; i < strn.length(); i++) {
            if ((strn.charAt(i)) == strn.charAt((strn.length() - 1) - i)) {
                flag += i;
//                for(flag == (strn.length() - i)) {
//                    
//                }
//                if (flag == strn.length()) {
//                    flag = 1;
//                } else {
//                    flag = 0;
//                }
                
            }
//            System.out.println("i = " + i + "| letter = " + strn.charAt(i));
//            System.out.println("---");
//            System.out.println("i last = " + ((strn.length() - 1) - i)
//              + "| letter = " + strn.charAt((strn.length() - 1) - i));
            
       }
       if(flag==1)  
           System.out.print("palindrome");  
       else   
           System.out.print("not a palindrome2");  
    }
    
}
