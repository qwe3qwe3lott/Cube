import javax.swing.*;
import java.awt.*;
public class CubeFrame extends JFrame {
    Cube cube;
    public CubeFrame(Cube cube){
        this.cube = cube;
        JFrame f = new JFrame("Куб");
        f.setSize(666, 666);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        System.out.println(2354);
        cube.draw(g);
    }
}
