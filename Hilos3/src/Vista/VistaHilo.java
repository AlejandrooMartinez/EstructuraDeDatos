/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author fredy
 */
public class VistaHilo extends JFrame {

    private JTextField campoHilo1, campoHilo2, campoHilo3;
    private JButton botonIniciar;

    public VistaHilo() {
        setTitle("Simulacion Hilos");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Duracion hilo 1 (segundo)"));
        campoHilo1 = new JTextField();
        add(campoHilo1);

        add(new JLabel("Duracion hilo 2 (segundo)"));
        campoHilo2 = new JTextField();
        add(campoHilo2);

        add(new JLabel("Duracion hilo 3 (segundo)"));
        campoHilo3 = new JTextField();
        add(campoHilo3);
        botonIniciar = new JButton("Iniciar Simulacion");
        add(botonIniciar);

        setVisible(true);

    }

    public JTextField getCampoHilo1() {
        return campoHilo1;
    }

    public JTextField getCampoHilo2() {
        return campoHilo2;
    }

    public JTextField getCampoHilo3() {
        return campoHilo3;
    }

    public JButton getBotonIniciar() {
        return botonIniciar;
    }

}
