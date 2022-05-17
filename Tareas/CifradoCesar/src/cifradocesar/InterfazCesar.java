/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradocesar;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author elies
 */
public class InterfazCesar extends JFrame{
  JTextField mensaje;
    JTextField desplazamiento;
    JTextField resultado;
    JLabel mensajeCifrado;
    JButton boton;
    String cifrado = "abcdefghijklmnñopqrstuvwxyz";
    public InterfazCesar()throws HeadlessException {
        setTitle("Cifrado César");
        setSize(410, 150);
        setLayout(new FlowLayout(FlowLayout.LEADING));
        mensaje = new JTextField(30);
        desplazamiento = new JTextField(5);
        boton = new JButton("Cifre su texto");
        boton.setBackground(Color.WHITE);
        resultado = new JTextField(30);
        resultado.setBackground(Color.WHITE);
        mensaje.setToolTipText("Ingrese el texto que se va a cifrar");
        mensaje.setBackground(Color.WHITE);
        desplazamiento.setToolTipText("Letras a desplazar");
        desplazamiento.setBackground(Color.WHITE);
       mensajeCifrado =new JLabel("Mensaje Cifrado");
       mensajeCifrado.setBackground(Color.WHITE);
       mensajeCifrado.setBounds(450, 70, 200, 500);
        this.getContentPane().add(mensaje);
        this.getContentPane().add(desplazamiento);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
         this.getContentPane().add(mensajeCifrado);
    
        this.validate();
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String textoCifrado = "";
                String textoCifrar = mensaje.getText();
                String despla = desplazamiento.getText();
                int num = Integer.parseInt(despla);
                char caracter;
                try {
                    textoCifrar = textoCifrar.toLowerCase();
                    for(int i = 0; i < textoCifrar.length(); i++){
                    caracter = textoCifrar.charAt(i);
                    int pos = cifrado.indexOf(caracter);
                    if(pos == -1){
                        textoCifrado += caracter;
                    }else{
                        textoCifrado += cifrado.charAt((pos + num )% cifrado.length());
                    }
                }
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            resultado.setText(textoCifrado);
            }
            
        });
    }
    
}
    

