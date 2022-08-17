import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        //System.out.println("Hello world");
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 500, 300);
        //jFrame.setBounds(250, 150, 500, 300);
        jFrame.setTitle("this is my app");
    }
    
}