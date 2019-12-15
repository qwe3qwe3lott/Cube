import javax.swing.*;
import java.awt.*;
public class Frame extends JFrame {
    Cube cube;
    public Frame(Cube cube){
        JFrame frame = new JFrame("Куб");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(666, 666);
        frame.setVisible(true);
        this.cube = cube;
    }
    public void paint(Graphics g){
        System.out.println(2354);
        cube.draw(g);
    }
}
