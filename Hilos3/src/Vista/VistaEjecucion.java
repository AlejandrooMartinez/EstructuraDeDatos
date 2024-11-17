package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author fredy
 */
public class VistaEjecucion extends JFrame{
    private JLabel etiquetaContador;
    private JPanel panelAnimacion;
    private int posx=0;
    
    public VistaEjecucion(){
        setTitle("Ejecion de hilos animacion ");
        setSize (900, 400);
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        
        etiquetaContador=new JLabel("tiempo: 0s");
        etiquetaContador.setHorizontalAlignment(SwingConstants.CENTER);
        add(etiquetaContador, BorderLayout.NORTH);
        
        panelAnimacion=new JPanel(){
            protected void pintarcomponentes(Graphics g){
              super.paintComponent(g);
              g.setColor(Color.BLUE);
              g.fillOval(posx, getHeight()/2 - 15, 30, 30);
            }
        };
        add(panelAnimacion, BorderLayout.CENTER);
        setVisible(true);
    }
    public void actualizarContador (int segundos){
        etiquetaContador.setText("Tiempo:" + segundos + "s" );
        posx +=10;
        if (posx>panelAnimacion.getWidth()) {
            posx=0;
        }
        panelAnimacion.repaint();
    }
}