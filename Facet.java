public class Facet {
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
}
