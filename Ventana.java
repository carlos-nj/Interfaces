package codigo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel etiqueta;
    private JButton botonRojo, botonVerde, botonAzul;
    private int pulsador = 0;
    private int contRojo=0, contVerde=0, contAzul=0;
    
    public Ventana(){
        setSize(600,400);
        setTitle("Juego de colores");
        setLocationRelativeTo(null);
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    private void iniciarComponentes(){
        cuadrarPanel();
        cuadrarEtiqueta();
        cuadrarBotones();
        
    }
    private void cuadrarPanel(){
        
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        
        ruedaRaton();
        
        
    }
    private void cuadrarEtiqueta(){
        etiqueta = new JLabel("Color (Rojo, Verde, Azul)");
        etiqueta.setBounds(100, 30, 400, 50);
        etiqueta.setFont(new Font("arial",0,20));
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta);
        
    }
    private void cuadrarBotones(){
        
        /*
        pulsador = 1 -> botonRojo
        pulsador = 2 -> botonVerde
        pulsador = 3 -> botonAzul
        */
        botonRojo = new JButton("Rojo");
        botonRojo.setBounds(50, 230, 130, 50);
        botonRojo.setForeground(Color.red);
        botonRojo.setFont(new Font("arial rounded mt bold",0,20));
        panel.add(botonRojo);
        botonRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsador = 1;
                
            }
        });
        
        botonVerde = new JButton("Verde");
        botonVerde.setBounds(230, 230, 130, 50);
        botonVerde.setForeground(Color.green);
        botonVerde.setFont(new Font("arial rounded mt bold",0,20));
        panel.add(botonVerde);
        botonVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsador = 2;
            }
        });
        
        botonAzul = new JButton("Azul");
        botonAzul.setBounds(410, 230, 130, 50);
        botonAzul.setForeground(Color.blue);
        botonAzul.setFont(new Font("arial rounded mt bold",0,20));
        panel.add(botonAzul);
        botonAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsador = 3;
            }
        });
        
    }
    private void ruedaRaton(){
        MouseWheelListener rueda = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(pulsador != 0){ // Si se ha pulsado algun boton
                    switch (pulsador) {
                        case 1:
                            //Se ha pulsado el botonRojo
                            contRojo += e.getWheelRotation();
                            if(contRojo < 0){
                                contRojo = 0;
                            }   if(contRojo > 255){
                                contRojo = 255;
                            }   break;
                        case 2:
                            //Se ha pulsado el botonVerde
                            contVerde += e.getWheelRotation();
                            if(contVerde < 0){
                                contVerde = 0;
                            }   if(contVerde > 255){
                                contVerde = 255;
                            }   break;
                        default:
                            //Se ha pulsado el botonAzul
                            contAzul += e.getWheelRotation();
                            if(contAzul < 0){
                                contAzul = 0;
                            }   if(contAzul > 255){
                                contAzul = 255;
                            }   break;
                    }
                    
                }
                etiqueta.setText("Color (Rojo = "+contRojo+", Verde = "+contVerde+", Azul = "+contAzul);
                panel.setBackground(new Color(contRojo, contVerde,contAzul));                
            }
        };
        panel.addMouseWheelListener(rueda);
    }
}
