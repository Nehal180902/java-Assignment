package Assessment;

import java.util.Scanner;

public class total {
    public static void main(String args[]){
        Scanner pob=new Scanner(System.in);
        System.out.println("The cost of pencil is:");
        float pencil=pob.nextFloat();

        System.out.println("The cost of pen is:");
        float pen=pob.nextFloat();

        System.out.println("The cost of eraser is:");
        float eraser=pob.nextFloat();

        float total=pencil+pen+eraser;
        System.out.println("The total without gst is "+total);

        float gst = total*0.18f;
        float finalwithgst=total+gst;
        System.out.println("The  gst is "+ gst);
        System.out.println("The finalwithgst is "+ finalwithgst);

    }
}
