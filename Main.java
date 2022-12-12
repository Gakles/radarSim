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
      sJFrame(screen.getScreenWidth(), screen.getScreenHeight());
      

      System.out.println("Load Complete");
    }
    private static void sJFrame(int width, int height){
      //the bare minimum making window to screenwidth and screenheight
      JFrame frame = new JFrame("Radar Sim");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setSize(width,height);
      frame.setVisible(true);
      JFrame.setDefaultLookAndFeelDecorated(true);
      
      frame.getContentPane().setBackground(Color.decode("#070B0C"));
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