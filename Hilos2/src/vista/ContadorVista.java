/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ContadorVista {
    private JFrame marco;
    private JButton BotonInicar;
    private JLabel etiqueta;
    
    public ContadorVista(){
        marco=new JFrame("Contador con hilos");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(300,200);
        marco.setLayout(new FlowLayout());
        
        etiqueta=new JLabel("Contador: 0");
        BotonInicar=new JButton("Iniciar");
        marco.add(etiqueta);
        marco.add(BotonInicar);
        marco.setVisible(true);
    }
    
    
    
    
    
    public void establecertexto(String texto){
        etiqueta.setText(texto);
    }
    
    public void agregarBoton(ActionListener Escuchar){
        BotonInicar.addActionListener(Escuchar);
    }
    public void deshabilitar(){
        BotonInicar.setEnabled(false);
    }
}
