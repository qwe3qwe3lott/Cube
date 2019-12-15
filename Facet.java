import java.awt.*;

public class Facet {
    private final int C = 200;
    private R3Vector[] points;
    //Color color;
    public Facet(R3Vector v1, R3Vector v2, R3Vector v3, R3Vector v4) {
        points = new R3Vector[]{v1, v2, v3, v4};
    }
    public void show() {
        System.out.println("Первое ребро: " + "начало - " + points[0].getX() + " " + points[0].getY() + " " + points[0].getZ() + ", конец - " + points[1].getX() + " " + points[1].getY() + " " + points[1].getZ());
        System.out.println("Второе ребро: " + "начало - " + points[1].getX() + " " + points[1].getY() + " " + points[1].getZ() + ", конец - " + points[2].getX() + " " + points[2].getY() + " " + points[2].getZ());
        System.out.println("Третье ребро: " + "начало - " + points[2].getX() + " " + points[2].getY() + " " + points[2].getZ() + ", конец - " + points[3].getX() + " " + points[3].getY() + " " + points[3].getZ());
        System.out.println("Четвёртое ребро: " + "начало - " + points[3].getX() + " " + points[3].getY() + " " + points[3].getZ() + ", конец - " + points[0].getX() + " " + points[0].getY() + " " + points[0].getZ());
    }
    public void rotate(double angleX, double angleY, double angleZ) {
        rotateOX(angleX);
        rotateOY(angleY);
        rotateOZ(angleZ);
    }

    public void rotateOX(double angle){
        points[0].rotateOX(angle);
        points[1].rotateOX(angle);
        points[2].rotateOX(angle);
        points[3].rotateOX(angle);
    }
    public void rotateOY(double angle){
        points[0].rotateOY(angle);
        points[1].rotateOY(angle);
        points[2].rotateOY(angle);
        points[3].rotateOY(angle);
    }
    public void rotateOZ(double angle){
        points[0].rotateOZ(angle);
        points[1].rotateOZ(angle);
        points[2].rotateOZ(angle);
        points[3].rotateOZ(angle);
    }

    public void multiplication(double k) {
        points[0].multiplication(k);
        points[1].multiplication(k);
        points[2].multiplication(k);
        points[3].multiplication(k);
    }

    public void travelOX(double x){
        points[0].travelOX(x);
        points[1].travelOX(x);
        points[2].travelOX(x);
        points[3].travelOX(x);
    }
    public void travelOY(double y){
        points[0].travelOY(y);
        points[1].travelOY(y);
        points[2].travelOY(y);
        points[3].travelOY(y);
    }
    public void travelOZ(double z){
        points[0].travelOZ(z);
        points[1].travelOZ(z);
        points[2].travelOZ(z);
        points[3].travelOZ(z);
    }
    public void travel(double x, double y, double z){
        travelOX(x);
        travelOY(y);
        travelOZ(z);
    }
    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.drawLine((int)  Math.round(C-points[0].getX()), (int)  Math.round(C-points[0].getX()), (int)  Math.round(C-points[0].getY()),(int)  Math.round(C-points[0].getY()));
        g.drawLine((int)  Math.round(C-points[1].getX()), (int)  Math.round(C-points[1].getX()), (int)  Math.round(C-points[1].getY()),(int)  Math.round(C-points[1].getY()));
        g.drawLine((int)  Math.round(C-points[2].getX()), (int)  Math.round(C-points[2].getX()), (int)  Math.round(C-points[2].getY()),(int)  Math.round(C-points[2].getY()));
        g.drawLine((int)  Math.round(C-points[3].getX()), (int)  Math.round(C-points[3].getX()), (int)  Math.round(C-points[3].getY()),(int)  Math.round(C-points[3].getY()));
    }
}
