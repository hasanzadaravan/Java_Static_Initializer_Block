import javax.print.attribute.standard.MediaSizeName;
import java.util.Scanner;

import static javax.print.attribute.standard.MediaSizeName.B;


public class Solution {


    static Scanner scanner = new Scanner(System.in);
    public static int B = scanner.nextInt();
    public static int H = scanner.nextInt();


    public static void main(String[] args) {
        if (B>0 && H>0) {
            int area = B * H;
            System.out.print(area);
        }
        else  if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }//end of main

}//end of class
