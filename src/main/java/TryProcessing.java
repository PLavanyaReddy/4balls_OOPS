import processing.core.PApplet;

import java.util.ArrayList;

public class TryProcessing extends PApplet{
    // static
    int k =1;
    ArrayList<Balls>  b = new ArrayList<>();
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;


    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();

        size(WIDTH,HEIGHT);
        for(int i=0;i<4;i++)
        {
            b.add(new Balls(this));
        }
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        // super.draw();
        b.get(0).drawCircle(k,HEIGHT,1);
        b.get(1).drawCircle(k,HEIGHT,2);
        b.get(2).drawCircle(k,HEIGHT,3);
        b.get(3).drawCircle(k,HEIGHT,4);
        k++;
    }


}

class Balls
{


    private PApplet pApplet;

    public Balls(PApplet pApplet)
    {
        this.pApplet = pApplet;
    }

    public void drawCircle(int k,int height,int speed) {
        pApplet.ellipse(k*speed,height*speed/5,10,10);

    }

}

