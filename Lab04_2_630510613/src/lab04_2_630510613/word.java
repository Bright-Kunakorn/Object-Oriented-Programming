package lab04_2_630510613;
import java.util.Scanner;

public class word {
    String str;
    String w;
    public void Secret(String str){
        Scanner input = new Scanner(System.in);
        char[] ch = new char[str.length()]; 
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        for  (int j =0;j < str.length();j++)
        {
            if (j%3 == 0 && j != 0)
                System.out.print(" ");
            
            int ascii = (int) ch[j];
            ascii += 3;
            w = String.valueOf((char)ascii);
            System.out.print(w.toUpperCase());

        }
        for (int k = 0;k < 3-str.length()%3;k++)
        {
            System.out.print("#");
        }
        System.out.print("\n");
    }
}

