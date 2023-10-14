
import java.awt.*;
import java.awt.event.*;
public class AwtMove extends Frame implements KeyListener {
    int x = 200,y = 200;
            int a,b;
        public AwtMove(){
            
            setSize(500,500);
            setBackground(Color.GRAY);
            setTitle("move");

            
            addKeyListener(this);
            addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent we){
                        System.exit(0);
                }
            });
            
            
        }
        public void paint(Graphics g){
            g.drawString("x =" + x +"y =" + y , 35, 45);
            g.drawRect(45, 50, 395, 400);
            g.setColor(Color.blue);
            g.fillRect(x, y, 40, 30);
            
            
        }
 


    public void keyTyped(KeyEvent e) {
      
    }


    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch(keyCode){

           
            case KeyEvent.VK_UP:
            case KeyEvent.VK_W:
                if(y > 51)
                y = y - 5;
               
               
                
                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                if(y < 420)
                y = y + 5;
                break;
            case KeyEvent.VK_LEFT:
                case KeyEvent.VK_A:
                x = x -5;
                if(x > 40)
                break;
            case KeyEvent.VK_RIGHT:
                case KeyEvent.VK_D:
                if(x < 400)
                x = x+5;
                break;
        }
        repaint();
       
    }

    public void keyReleased(KeyEvent e) {

    }
       public static void main(String[] args) {
    new AwtMove().show();
    }
    
}
