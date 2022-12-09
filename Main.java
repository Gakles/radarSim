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
      JFrame frame = new JFrame("FrameDemo");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //frame.getContentPane().add("nah", BorderLayout.CENTER);
      frame.pack();
      frame.setSize(width,height);
      frame.setVisible(true);
      JFrame.setDefaultLookAndFeelDecorated(true);
    }
    static class screenCoords{
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