/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio87.pkg95;

/**
 *
 * @author Alejandro
 */
public class Formulario1 extends javax.swing.JFrame {

    /**
     * Creates new form Formulario1
     */
    public Formulario1() {
        initComponents();
        panel.removeAll();
        panel.add(jComboBox1);
        panel.add(labelradio);
        panel.add(txtradio);
        panel.add(labelarea);
        panel.add(txtarea);
        panel.add(labelperimetro);
        panel.add(txtperimetro);
        panel.add(btncalcular);
        panel.add(btnborrar);
        panel.add(btnsalir);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        labelradio = new javax.swing.JLabel();
        labellado = new javax.swing.JLabel();
        labelaltura = new javax.swing.JLabel();
        labelarea = new javax.swing.JLabel();
        labelperimetro = new javax.swing.JLabel();
        btncalcular = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        txtradio = new javax.swing.JTextField();
        txtbase = new javax.swing.JTextField();
        txtaltura = new javax.swing.JTextField();
        txtarea = new javax.swing.JTextField();
        txtperimetro = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtlado = new javax.swing.JTextField();
        labelbase = new javax.swing.JLabel();
        labeltipotriangulo = new javax.swing.JLabel();
        txttipotriangulo = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelradio.setText("Radio");

        labellado.setText("Lado");

        labelaltura.setText("Altura");

        labelarea.setText("Área");

        labelperimetro.setText("Perímetro");

        btncalcular.setText("Calcular");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        btnborrar.setText("Borrar");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        txtradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtradioActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Círculo", "Rectángulo", "Cuadrado", "Triángulo" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        labelbase.setText("Base");

        labeltipotriangulo.setText("Tipo de Triángulo");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelradio)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labellado)
                                .addComponent(labelbase)))
                        .addGap(120, 120, 120))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelarea)
                            .addComponent(labelaltura))
                        .addGap(124, 124, 124)))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtbase, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(txtaltura, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(txtarea, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(txtperimetro, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(txtradio, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(txtlado, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(txttipotriangulo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btncalcular)
                        .addGap(133, 133, 133)
                        .addComponent(btnborrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(btnsalir)
                        .addGap(84, 84, 84))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labeltipotriangulo)
                            .addComponent(labelperimetro))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtradio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelradio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labellado)
                    .addComponent(txtlado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelbase))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelaltura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelarea)
                    .addComponent(txtarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelperimetro)
                    .addComponent(txtperimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeltipotriangulo)
                    .addComponent(txttipotriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncalcular)
                    .addComponent(btnborrar)
                    .addComponent(btnsalir))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

          String figuraSeleccionada = (String) jComboBox1.getSelectedItem();
          
          panel.removeAll();

        if (figuraSeleccionada.equals("Círculo")) {
            panel.add(jComboBox1);
            panel.add(labelradio);
            panel.add(txtradio);
            panel.add(labelarea);
            panel.add(txtarea);
            panel.add(labelperimetro);
            panel.add(txtperimetro);
            panel.add(btncalcular);
            panel.add(btnborrar);
            panel.add(btnsalir);
        } else if (figuraSeleccionada.equals("Rectángulo")) {
            panel.add(jComboBox1);
            panel.add(labelbase);
            panel.add(txtbase);
            panel.add(labelaltura);
            panel.add(txtaltura);
            panel.add(labelarea);
            panel.add(txtarea);
            panel.add(labelperimetro);
            panel.add(txtperimetro);
            panel.add(btncalcular);
            panel.add(btnborrar);
            panel.add(btnsalir);
        }else if (figuraSeleccionada.equals("Cuadrado")) {
            panel.add(jComboBox1);
            panel.add(labellado);
            panel.add(txtlado);
            panel.add(labelarea);
            panel.add(txtarea);
            panel.add(labelperimetro);
            panel.add(txtperimetro);
            panel.add(btncalcular);
            panel.add(btnborrar);
            panel.add(btnsalir);
        }else if (figuraSeleccionada.equals("Triángulo")) {
            panel.add(jComboBox1);
            panel.add(labelbase);
            panel.add(txtbase);
            panel.add(labelaltura);
            panel.add(txtaltura);
            panel.add(labelarea);
            panel.add(txtarea);
            panel.add(labelperimetro);
            panel.add(txtperimetro);
            panel.add(txttipotriangulo);
            panel.add(labeltipotriangulo);
            panel.add(btncalcular);
            panel.add(btnborrar);
            panel.add(btnsalir);
        }

        panel.revalidate();
        panel.repaint();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtradioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtradioActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        // TODO add your handling code here:
        String figuraSeleccionada = (String) jComboBox1.getSelectedItem();
        
        if (figuraSeleccionada.equals("Círculo")){
            double radio, area,perimetro;
            radio= Double.parseDouble(txtradio.getText());

            area= Math.PI*Math.pow(radio,2);
            perimetro= 2*Math.PI*radio;

            txtarea.setText(String.format("%.2f",area));
            txtperimetro.setText(String.format("%.2f",perimetro));
        }
        
        else if(figuraSeleccionada.equals("Cuadrado")){
            
            double lado, area,perimetro;
            lado= Double.parseDouble(txtlado.getText());

            area= Math.pow(lado,2);
            perimetro= 4*lado;

            txtarea.setText(String.format("%.2f",area));
            txtperimetro.setText(String.format("%.2f",perimetro));
    }
        
        
        else if(figuraSeleccionada.equals("Rectángulo")){
            
            double base,altura,area,perimetro;
            base= Double.parseDouble(txtbase.getText());
            altura= Double.parseDouble(txtaltura.getText());
            
            area= base*altura;
            perimetro= (base+altura)*2;

            txtarea.setText(String.format("%.2f",area));
            txtperimetro.setText(String.format("%.2f",perimetro));
    }   
        
        
        
        else if(figuraSeleccionada.equals("Triángulo")){
            
            double base,altura,area,perimetro,hipotenusa;
            base= Double.parseDouble(txtbase.getText());
            altura= Double.parseDouble(txtaltura.getText());
            
            area= base*altura/2;
            hipotenusa=Math.pow(base*base+altura*altura, 0.5);
            perimetro= (base+altura+hipotenusa);

            txtarea.setText(String.format("%.2f",area));
            txtperimetro.setText(String.format("%.2f",perimetro));
            
            if(base==altura & base==hipotenusa){
                
                txttipotriangulo.setText("Triángulo Equilátero");
            }
            
            else if(base!=altura & base!=hipotenusa & altura!=hipotenusa){
                
                txttipotriangulo.setText("Triángulo Escaleno");
                
            }
            
            else{
                
                txttipotriangulo.setText("Triángulo Isósceles");
            }
    }   
        
        
        
        
    }//GEN-LAST:event_btncalcularActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        // TODO add your handling code here:
        
        txtradio.setText("");
        txtbase.setText("");
        txtlado.setText("");
        txtaltura.setText("");
        txtarea.setText("");
        txtperimetro.setText("");
        txttipotriangulo.setText("");
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelaltura;
    private javax.swing.JLabel labelarea;
    private javax.swing.JLabel labelbase;
    private javax.swing.JLabel labellado;
    private javax.swing.JLabel labelperimetro;
    private javax.swing.JLabel labelradio;
    private javax.swing.JLabel labeltipotriangulo;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtaltura;
    private javax.swing.JTextField txtarea;
    private javax.swing.JTextField txtbase;
    private javax.swing.JTextField txtlado;
    private javax.swing.JTextField txtperimetro;
    private javax.swing.JTextField txtradio;
    private javax.swing.JTextField txttipotriangulo;
    // End of variables declaration//GEN-END:variables
}
