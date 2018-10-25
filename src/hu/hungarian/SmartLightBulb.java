package hu.hungarian;


import javafx.scene.paint.Color;

public class SmartLightBulb {
    private short lightPercent;
    private Color color;


    public SmartLightBulb() {
        this.color = Color.WHITESMOKE;
        this.lightPercent = 0;
    }



    public void turnUp()
    {lightPercent+=20;
    if (lightPercent>100)
    {lightPercent=100;}
    }

    public void turnDown() {
        lightPercent -= 20;
    if (lightPercent < 0)
    lightPercent = 0;
    }
    public String toString()
    {
     return "The color of the SmartLightBulb is " + this.getColor() + " and the light percent is at " + this.getLightPercent();
    }

    public short getLightPercent() {
        return this.lightPercent;
    }

    public void setLightPercent(short lightPercent) {
        if (lightPercent > 100)
        {lightPercent=100;}
        if (lightPercent < 0)
        {lightPercent=0;}
        this.lightPercent = lightPercent;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        if (color == Color.BLACK)
        {color = Color.WHITESMOKE;}
        this.color = color;
    }
}
