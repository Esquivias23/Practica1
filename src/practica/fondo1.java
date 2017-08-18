package practica;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class fondo1 extends javax.swing.JPanel{
    
    public fondo1 ()     
    {
     this.setSize(1000, 700);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        Dimension tamanio= getSize();
        ImageIcon imagenFondo=new ImageIcon(getClass().getResource("thunder.jpg"));
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width,tamanio.height,null);
        setOpaque(false);
        super.paintComponent(g);
        
      
    }
}
