package com.ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author acabezaslopez
 */
public class Ventana {

    JFrame marco;
    JPanel panel;
    JButton boton1;

    public Ventana() {
        marco = new JFrame("Ventana eventos boletin 23");
        panel = new JPanel();
        boton1 = new JButton("premer");
        // Se dan las características a los objetos:
        marco.setSize(300, 200);
        panel.add(boton1);
        marco.add(panel);
        mostrarMensaje mens = new mostrarMensaje();
        // Se añade al botón el ActionListener
        boton1.addActionListener(mens);
        //visibilidad
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    public class mostrarMensaje implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            /*
         * Para poder diferenciar que botón es el pulsado utilizamos para el
         * ActionEvent su método .getSource.
             */
            Object boton = ae.getSource();
            if (boton == boton1) {
                JOptionPane.showMessageDialog(null, "premiches o botón");
            }
        }
    }
}
