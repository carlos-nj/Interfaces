/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author Alumno
 */
public class Juego3EnRaya extends javax.swing.JFrame {

    
    public Juego3EnRaya() {
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonArribaIzquierda = new javax.swing.JButton();
        botonArribaCentro = new javax.swing.JButton();
        botonArribaDerecha = new javax.swing.JButton();
        botnonIzquierda = new javax.swing.JButton();
        botonCentro = new javax.swing.JButton();
        botonDerecha = new javax.swing.JButton();
        botonAbajoIzquierda = new javax.swing.JButton();
        botonAbajoCentro = new javax.swing.JButton();
        botonAbajoDerecha = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        empezarDeNuevo = new javax.swing.JMenuItem();
        mostrarResultados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new java.awt.GridLayout(3, 3));
        panel.add(botonArribaIzquierda);
        panel.add(botonArribaCentro);
        panel.add(botonArribaDerecha);
        panel.add(botnonIzquierda);
        panel.add(botonCentro);
        panel.add(botonDerecha);
        panel.add(botonAbajoIzquierda);
        panel.add(botonAbajoCentro);
        panel.add(botonAbajoDerecha);

        menuJuego.setText("Juego");
        menuJuego.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        empezarDeNuevo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        empezarDeNuevo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alumno\\Downloads\\lanzamiento-de-cohete(1).png")); // NOI18N
        empezarDeNuevo.setText("Empezar de nuevo");
        empezarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empezarDeNuevoActionPerformed(evt);
            }
        });
        menuJuego.add(empezarDeNuevo);

        mostrarResultados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mostrarResultados.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alumno\\Downloads\\tabla-de-datos(1).png")); // NOI18N
        mostrarResultados.setText("Mostrar tabla de resultados");
        menuJuego.add(mostrarResultados);
        menuJuego.add(jSeparator1);

        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alumno\\Downloads\\salida(1).png")); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menuJuego.add(salir);

        barraMenu.add(menuJuego);

        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empezarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarDeNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empezarDeNuevoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego3EnRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego3EnRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego3EnRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego3EnRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego3EnRaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botnonIzquierda;
    private javax.swing.JButton botonAbajoCentro;
    private javax.swing.JButton botonAbajoDerecha;
    private javax.swing.JButton botonAbajoIzquierda;
    private javax.swing.JButton botonArribaCentro;
    private javax.swing.JButton botonArribaDerecha;
    private javax.swing.JButton botonArribaIzquierda;
    private javax.swing.JButton botonCentro;
    private javax.swing.JButton botonDerecha;
    private javax.swing.JMenuItem empezarDeNuevo;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenuItem mostrarResultados;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
