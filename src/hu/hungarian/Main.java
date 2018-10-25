package hu.hungarian;


import javafx.scene.paint.Color;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        SmartLightBulb s = new SmartLightBulb();
        System.out.println(s.toString());

        SmartLightBulb dan1 = new SmartLightBulb();
        dan1.setColor(Color.PINK);
        dan1.setLightPercent((short)99);
        System.out.println(dan1.toString());

        SmartLightBulb dan2 = new SmartLightBulb();
        dan2.setLightPercent((short)26);
        dan2.setColor(Color.BLACK);
        System.out.println(dan2.toString());
    }
}
