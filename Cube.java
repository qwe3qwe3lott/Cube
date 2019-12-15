import java.awt.*;

public class Cube {
    private static Facet[] facets;
    public Cube() {
        facets = new Facet[6];
        facets[0] = new Facet(new R3Vector(0,0,0), new R3Vector(1,0,0), new R3Vector(1,1,0), new R3Vector(0,1,0));
        facets[1] = new Facet(new R3Vector(1,1,1), new R3Vector(1,1,0), new R3Vector(1,0,0), new R3Vector(1,0,1));
        facets[2] = new Facet(new R3Vector(0,1,1), new R3Vector(1,1,1), new R3Vector(1,0,1), new R3Vector(0,0,1));
        facets[3] = new Facet(new R3Vector(0,1,0), new R3Vector(0,1,1), new R3Vector(0,0,1), new R3Vector(0,0,0));
        facets[4] = new Facet(new R3Vector(0,1,0), new R3Vector(1,1,0), new R3Vector(1,1,1), new R3Vector(0,1,1));
        facets[5] = new Facet(new R3Vector(0,0,0), new R3Vector(1,0,0), new R3Vector(1,0,1), new R3Vector(0,0,1));
    }

    public void rotateOX(double angle){
        facets[0].rotateOX(angle);
        facets[1].rotateOX(angle);
        facets[2].rotateOX(angle);
        facets[3].rotateOX(angle);
        facets[4].rotateOX(angle);
        facets[5].rotateOX(angle);
    }
    public void rotateOY(double angle){
        facets[0].rotateOY(angle);
        facets[1].rotateOY(angle);
        facets[2].rotateOY(angle);
        facets[3].rotateOY(angle);
        facets[4].rotateOY(angle);
        facets[5].rotateOY(angle);
    }
    public void rotateOZ(double angle){
        facets[0].rotateOZ(angle);
        facets[1].rotateOZ(angle);
        facets[2].rotateOZ(angle);
        facets[3].rotateOZ(angle);
        facets[4].rotateOZ(angle);
        facets[5].rotateOZ(angle);
    }
    public void rotate(double angleX, double angleY, double angleZ){
        rotateOX(angleX);
        rotateOY(angleY);
        rotateOZ(angleZ);
    }

    public void multiplication(double k) {
        facets[0].multiplication(k);
        facets[1].multiplication(k);
        facets[2].multiplication(k);
        facets[3].multiplication(k);
        facets[4].multiplication(k);
        facets[5].multiplication(k);
    }

    public void travelOX(double x){
        facets[0].travelOX(x);
        facets[1].travelOX(x);
        facets[2].travelOX(x);
        facets[3].travelOX(x);
        facets[4].travelOX(x);
        facets[5].travelOX(x);
    }
    public void travelOY(double y){
        facets[0].travelOY(y);
        facets[1].travelOY(y);
        facets[2].travelOY(y);
        facets[3].travelOY(y);
        facets[4].travelOY(y);
        facets[5].travelOY(y);
    }
    public void travelOZ(double z){
        facets[0].travelOZ(z);
        facets[1].travelOZ(z);
        facets[2].travelOZ(z);
        facets[3].travelOZ(z);
        facets[4].travelOZ(z);
        facets[5].travelOZ(z);
    }
    public void travel(double x, double y, double z){
        travelOX(x);
        travelOY(y);
        travelOZ(z);
    }

    public void draw(Graphics g){
        facets[0].draw(g);
        facets[1].draw(g);
        facets[2].draw(g);
        facets[3].draw(g);
        facets[4].draw(g);
        facets[5].draw(g);
    }
}
