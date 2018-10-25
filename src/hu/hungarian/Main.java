package hu.hungarian;


import javafx.scene.paint.Color;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        SmartLight s = new SmartLight();
        System.out.println(s.toString());

        SmartLight dan1 = new SmartLight();
        dan1.setColor(Color.PINK);
        dan1.setLightPercent((short)99);
        System.out.println(dan1.getColor());
        System.out.println(s.toString());

        SmartLight dan2 = new SmartLight();
        dan2.setLightPercent((short)26);
        dan2.setColor(Color.BLACK);
        System.out.println(s.toString());
    }
}
