/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectoalgcalc.Calc;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author Sayuri
 */
public class Integrals extends javax.swing.JPanel {
            String eqn= "";
   //Inicia formula para calcular polinomios
    static class CalcIntegral {

    static String inteTerm(String pTerm)
    {
        String coeffStr = "", S = "";
        int i;

        for (i = 0; pTerm.charAt(i) != 'x'; i++)
          coeffStr += (pTerm.charAt(i));
        long coeff = Long.valueOf(coeffStr);

        String powStr = "";

        for (i = i + 2; i != pTerm.length(); i++)
          powStr += (pTerm.charAt(i));

        long power = Long.valueOf(powStr);
        String a, b;

        // Para ax^n se aplica la formul a*x^(n+1)/(n+1)
        a = String.valueOf(coeff);
        power++;
        b = String.valueOf(power);
        S += "(" + String.valueOf(a) + "/"
          + String.valueOf(b) + ")X^"
          + String.valueOf(b);

        return S;
    }

    static String integrationVal(String poly)
    {
        String[] is1 = poly.split(" ");
        String S = "";
        for (String pTerm : is1) {
            if (pTerm.equals("+")) {
              S += " + ";
              continue;
          }
          if (pTerm.equals("-")) {
            S += " - ";
            continue;
          }
          else
            S += inteTerm(pTerm);
        }
        return S;
    }
}
    //termina codigo

    public Integrals() {
        FlatLightLaf.setup();
        UIManager.put( "Button.arc", 999 );
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Empty = new javax.swing.JButton();
        Respuesta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Ecuation1 = new javax.swing.JTextField();
        Calc = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        animationText = new javax.swing.JTextArea();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Calculadora de Integrales Básicas Algebraicas");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 60));

        Empty.setBackground(new java.awt.Color(0, 102, 153));
        Empty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Empty.setForeground(new java.awt.Color(255, 255, 255));
        Empty.setText("Limpiar");
        Empty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmptyActionPerformed(evt);
            }
        });
        jPanel1.add(Empty, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 240, 30));

        Respuesta.setBackground(new java.awt.Color(255, 255, 255));
        Respuesta.setForeground(new java.awt.Color(51, 51, 51));
        Respuesta.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Respuesta.setActionCommand("<Not Set>");
        Respuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RespuestaActionPerformed(evt);
            }
        });
        jPanel1.add(Respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 500, 50));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Ingrese la funcion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Respuesta:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 100, -1));

        Ecuation1.setBackground(new java.awt.Color(255, 255, 255));
        Ecuation1.setForeground(new java.awt.Color(51, 51, 51));
        Ecuation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ecuation1ActionPerformed(evt);
            }
        });
        jPanel1.add(Ecuation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 400, 41));

        Calc.setBackground(new java.awt.Color(0, 102, 153));
        Calc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Calc.setForeground(new java.awt.Color(255, 255, 255));
        Calc.setText("Calcular");
        Calc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CalcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CalcMouseExited(evt);
            }
        });
        Calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcActionPerformed(evt);
            }
        });
        jPanel1.add(Calc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 240, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoalgcalc/Img/sign.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 50, 100));

        jLabel5.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("dx");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 30, 30));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Ingrese la función de la forma ax^n +/- bx^n");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        animationText.setBackground(new java.awt.Color(255, 255, 255));
        animationText.setColumns(20);
        animationText.setRows(5);
        jScrollPane1.setViewportView(animationText);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 500, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmptyActionPerformed
        // TODO add your handling code here:
        Respuesta.setText(" ");
        Ecuation1.setText(" ");
        animationText.setText("");
    }//GEN-LAST:event_EmptyActionPerformed

    private void RespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RespuestaActionPerformed

    }//GEN-LAST:event_RespuestaActionPerformed

    private void Ecuation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ecuation1ActionPerformed

    }//GEN-LAST:event_Ecuation1ActionPerformed

    private void CalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcActionPerformed
        // TODO add your handling code here:
        /* Codigo de esta clase
        String EcuationStr = Ecuation1.getText(); 
        CalcIntegral instancia = new CalcIntegral();       
        Respuesta.setText(instancia.integrationVal(EcuationStr) + " + C . ");
        */
        String ecuationStr = Ecuation1.getText();
        eqn = ecuationStr;
            TermSeperatorAndCalculator tryAnother = new TermSeperatorAndCalculator(eqn.replace(" ",""));
            tryAnother.seperateTerms();//3cosx+7sinx+10logx+8cosx-5logx
            tryAnother.calculate();//5cosx-10logx+3sinx+7cosx
            tryAnother.integrateS();
            String r =  tryAnother.integrationResult+" + C";
            Respuesta.setText("");
            animationText.setText("");
//Respuesta es solutionOutput
            //solutionOutput.append(tryAnother.showResult());
            Respuesta.setText(r );
            animationText.append(tryAnother.stepByStep);
    }//GEN-LAST:event_CalcActionPerformed

    private void CalcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalcMouseEntered
        // TODO add your handling code here:
          Calc.setBackground(Color.decode("#3592C4"));
       // TheoryFormulas.setForeground(Color.black);
    }//GEN-LAST:event_CalcMouseEntered

    private void CalcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalcMouseExited
        // TODO add your handling code here:
           Calc.setBackground(Color.decode("#3592C4"));
    }//GEN-LAST:event_CalcMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calc;
    private javax.swing.JTextField Ecuation1;
    private javax.swing.JButton Empty;
    private javax.swing.JTextField Respuesta;
    private javax.swing.JTextArea animationText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
