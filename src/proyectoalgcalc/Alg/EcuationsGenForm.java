/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectoalgcalc.Alg;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author Sayuri
 */
public class EcuationsGenForm extends javax.swing.JPanel {

    public EcuationsGenForm() {
        FlatLightLaf.setup();
        UIManager.put( "Button.arc", 999 );
        initComponents();
    }
    
    private void actualizar(){
        labelA.setText("(" + txtA.getText() + ")");
        labelA1.setText("(" + txtA.getText() + ")");
        labelB.setText("-(" + txtB.getText() + ")");
        labelB2.setText("(" + txtB.getText() + ")²");
        labelC.setText("(" + txtC.getText() + ")");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContentPanel = new javax.swing.JPanel();
        panelform = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        labelB2 = new javax.swing.JLabel();
        labelA = new javax.swing.JLabel();
        labelC = new javax.swing.JLabel();
        labelA1 = new javax.swing.JLabel();
        xtxt = new javax.swing.JLabel();
        signotxt = new javax.swing.JLabel();
        cuatrotxt = new javax.swing.JLabel();
        sqrttxt = new javax.swing.JLabel();
        partxt = new javax.swing.JLabel();
        dostxt = new javax.swing.JLabel();
        labelB = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelcalcu = new javax.swing.JPanel();
        paneldatos = new javax.swing.JPanel();
        txtX1 = new javax.swing.JTextField();
        x1txt = new javax.swing.JLabel();
        x2txt = new javax.swing.JLabel();
        txtX2 = new javax.swing.JTextField();
        atxt = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        ctxt = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        btxt = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        btnCal = new javax.swing.JButton();
        btnpasos = new javax.swing.JButton();

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ContentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelform.setBackground(new java.awt.Color(255, 255, 255));
        panelform.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelform.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 51, 510, 7));

        labelB2.setBackground(new java.awt.Color(255, 255, 255));
        labelB2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelB2.setForeground(new java.awt.Color(0, 0, 0));
        labelB2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB2.setText("(b)²");
        panelform.add(labelB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 62, 33));

        labelA.setBackground(new java.awt.Color(255, 255, 255));
        labelA.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelA.setForeground(new java.awt.Color(0, 0, 0));
        labelA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA.setText("(a)");
        panelform.add(labelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 8, 57, 33));

        labelC.setBackground(new java.awt.Color(255, 255, 255));
        labelC.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelC.setForeground(new java.awt.Color(0, 0, 0));
        labelC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelC.setText("(c)");
        panelform.add(labelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 9, 51, -1));

        labelA1.setBackground(new java.awt.Color(255, 255, 255));
        labelA1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelA1.setForeground(new java.awt.Color(0, 0, 0));
        labelA1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelA1.setText("(a)");
        panelform.add(labelA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 67, 88, 33));

        xtxt.setBackground(new java.awt.Color(255, 255, 255));
        xtxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        xtxt.setForeground(new java.awt.Color(0, 0, 0));
        xtxt.setText("x =");
        panelform.add(xtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 27, 50, 43));

        signotxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        signotxt.setForeground(new java.awt.Color(0, 0, 0));
        panelform.add(signotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        cuatrotxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        cuatrotxt.setForeground(new java.awt.Color(0, 0, 0));
        cuatrotxt.setText("(4)");
        panelform.add(cuatrotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 8, -1, 33));

        sqrttxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        sqrttxt.setForeground(new java.awt.Color(0, 0, 0));
        sqrttxt.setText("sqrt(");
        panelform.add(sqrttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        partxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        partxt.setForeground(new java.awt.Color(0, 0, 0));
        partxt.setText(")");
        panelform.add(partxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 7, 20, 35));

        dostxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        dostxt.setForeground(new java.awt.Color(0, 0, 0));
        dostxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dostxt.setText("(2)");
        panelform.add(dostxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 66, 72, 36));

        labelB.setBackground(new java.awt.Color(255, 255, 255));
        labelB.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelB.setForeground(new java.awt.Color(0, 0, 0));
        labelB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelB.setText("-(b)");
        panelform.add(labelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 69, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-");
        panelform.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 18, 36));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoalgcalc/Img/formul1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        panelform.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 20, 60));

        ContentPanel.add(panelform, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        panelcalcu.setBackground(new java.awt.Color(255, 255, 255));
        panelcalcu.setLayout(new java.awt.GridBagLayout());
        ContentPanel.add(panelcalcu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        paneldatos.setBackground(new java.awt.Color(255, 255, 255));
        paneldatos.setLayout(new java.awt.GridBagLayout());
        ContentPanel.add(paneldatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        txtX1.setEditable(false);
        txtX1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ContentPanel.add(txtX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 189, 38));

        x1txt.setBackground(new java.awt.Color(255, 255, 255));
        x1txt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        x1txt.setForeground(new java.awt.Color(0, 0, 0));
        x1txt.setText("x1 =");
        ContentPanel.add(x1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 50, 43));

        x2txt.setBackground(new java.awt.Color(255, 255, 255));
        x2txt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        x2txt.setForeground(new java.awt.Color(0, 0, 0));
        x2txt.setText("x2 =");
        ContentPanel.add(x2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 50, 43));

        txtX2.setEditable(false);
        txtX2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ContentPanel.add(txtX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 189, 38));

        atxt.setBackground(new java.awt.Color(255, 255, 255));
        atxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        atxt.setForeground(new java.awt.Color(0, 0, 0));
        atxt.setText("a =");
        ContentPanel.add(atxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 40, 30));

        txtA.setBackground(new java.awt.Color(255, 255, 255));
        txtA.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAKeyReleased(evt);
            }
        });
        ContentPanel.add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 120, 40));

        ctxt.setBackground(new java.awt.Color(255, 255, 255));
        ctxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        ctxt.setForeground(new java.awt.Color(0, 0, 0));
        ctxt.setText("b =");
        ContentPanel.add(ctxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 40, 30));

        txtB.setBackground(new java.awt.Color(255, 255, 255));
        txtB.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBKeyReleased(evt);
            }
        });
        ContentPanel.add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 120, 40));

        btxt.setBackground(new java.awt.Color(255, 255, 255));
        btxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btxt.setForeground(new java.awt.Color(0, 0, 0));
        btxt.setText("c =");
        ContentPanel.add(btxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 40, 30));

        txtC.setBackground(new java.awt.Color(255, 255, 255));
        txtC.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCKeyReleased(evt);
            }
        });
        ContentPanel.add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 120, 40));

        btnCal.setBackground(new java.awt.Color(255, 255, 255));
        btnCal.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnCal.setForeground(new java.awt.Color(0, 0, 0));
        btnCal.setText("Calcular");
        btnCal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCalMouseExited(evt);
            }
        });
        btnCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalActionPerformed(evt);
            }
        });
        ContentPanel.add(btnCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 164, 42));

        btnpasos.setBackground(new java.awt.Color(255, 255, 255));
        btnpasos.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnpasos.setForeground(new java.awt.Color(0, 0, 0));
        btnpasos.setText("Mostrar Pasos");
        btnpasos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnpasosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnpasosMouseExited(evt);
            }
        });
        btnpasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpasosActionPerformed(evt);
            }
        });
        ContentPanel.add(btnpasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 205, 42));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalMouseEntered
        btnCal.setBackground(Color.decode("#0099CC"));
        btnCal.setForeground(Color.white);
    }//GEN-LAST:event_btnCalMouseEntered

    private void btnCalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalMouseExited
        btnCal.setBackground(Color.white);
        btnCal.setForeground(Color.black);
    }//GEN-LAST:event_btnCalMouseExited

    private void btnCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalActionPerformed
        //Manejo de Errores en caso de 
        try {
            int a = Integer.parseInt(txtA.getText());
            int b = Integer.parseInt(txtB.getText());
            int c = Integer.parseInt(txtC.getText());

            double Determinante = Math.pow(b, 2) - (4 * a * c);
            if (Determinante > 0) {
                double x1 = ((b * (-1)) + Math.sqrt(Determinante)) / (2 * a);
                double x2 = ((b * (-1)) - Math.sqrt(Determinante)) / (2 * a);
                txtX1.setText(Double.toString(x1));
                txtX2.setText(Double.toString(x2));

            } else {
                JOptionPane.showMessageDialog(null, "Cálculo Incorrecto","¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campos Vacios o Incompletos. Por favor llene los campos.","¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalActionPerformed

    private void btnpasosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpasosMouseEntered
        btnpasos.setBackground(Color.decode("#0099CC"));
        btnpasos.setForeground(Color.white);
    }//GEN-LAST:event_btnpasosMouseEntered

    private void btnpasosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpasosMouseExited
        btnpasos.setBackground(Color.white);
        btnpasos.setForeground(Color.black);
    }//GEN-LAST:event_btnpasosMouseExited

    private void btnpasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpasosActionPerformed
        try{
            Pasos ventana = new Pasos(txtA.getText(), txtB.getText(), txtC.getText());
        ContentPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        ContentPanel.removeAll();
        ContentPanel.add(ventana);
        ContentPanel.revalidate();
        ContentPanel.repaint();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campos Vacios o Incompletos. Por favor llene los campos.","¡ERROR!", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnpasosActionPerformed

    private void txtAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAKeyReleased
        actualizar();
    }//GEN-LAST:event_txtAKeyReleased

    private void txtBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBKeyReleased
        actualizar();
    }//GEN-LAST:event_txtBKeyReleased

    private void txtCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCKeyReleased
        actualizar();
    }//GEN-LAST:event_txtCKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JLabel atxt;
    private javax.swing.JButton btnCal;
    private javax.swing.JButton btnpasos;
    private javax.swing.JLabel btxt;
    private javax.swing.JLabel ctxt;
    private javax.swing.JLabel cuatrotxt;
    private javax.swing.JLabel dostxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelA;
    private javax.swing.JLabel labelA1;
    private javax.swing.JLabel labelB;
    private javax.swing.JLabel labelB2;
    private javax.swing.JLabel labelC;
    private javax.swing.JPanel panelcalcu;
    private javax.swing.JPanel paneldatos;
    private javax.swing.JPanel panelform;
    private javax.swing.JLabel partxt;
    private javax.swing.JLabel signotxt;
    private javax.swing.JLabel sqrttxt;
    public static javax.swing.JTextField txtA;
    public static javax.swing.JTextField txtB;
    public static javax.swing.JTextField txtC;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    private javax.swing.JLabel x1txt;
    private javax.swing.JLabel x2txt;
    private javax.swing.JLabel xtxt;
    // End of variables declaration//GEN-END:variables
}
