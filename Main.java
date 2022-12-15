import javax.swing.JFrame;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
       // Prints "Hello, World" in the terminal window.
       System.out.println("Hello, World");
       opener();
    }
    private static void opener(){
      screenCoords screen = new screenCoords();
      MyJFrame f = new MyJFrame();
      int sWidth = screen.getScreenWidth();
      int sHeight = screen.getScreenHeight();
      f.setTitle("Drawing Graphics in Frames");
      f.setBounds(0,0,sWidth,sHeight);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
      
      
      //PCV player = new PCV(0);
      System.out.println("Load Complete");
    }
    static class MyJFrame extends JFrame {
      public void paint(Graphics g) {
        g.setColor(Color.red);
         g.drawRect(20,10,100,60);
      }
   }

    static class screenCoords{
      //makes object containing screenwidth and screeneheight
      public screenCoords() {
      }
      Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
      private int width = (int)size.getWidth();
      private int height = (int)size.getHeight();
      
      public int getScreenWidth(){
        return width;
      }
      public int getScreenHeight(){
        return height;
      }
     }
}