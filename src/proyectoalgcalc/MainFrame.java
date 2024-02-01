
package proyectoalgcalc;
import com.formdev.flatlaf.FlatLightLaf;
import proyectoalgcalc.Calc.*;
import proyectoalgcalc.Alg.*;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends javax.swing.JFrame {
    void cambiarContenidoPanel(JPanel panel) {
        ContentPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        ContentPanel.removeAll();
        ContentPanel.add(panel);
        ContentPanel.revalidate();
        ContentPanel.repaint();
    }
    public MainFrame() {
        setTitle("Proyecto Final");
        setResizable(false);
        initComponents();
        //this.setExtendedState(this.MAXIMIZED_BOTH);
        FlatLightLaf.setup();
        UIManager.put( "Button.arc", 999 );
        Home window = new Home();
        cambiarContenidoPanel(window);
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContentPanel = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        CalcIntegrals = new javax.swing.JButton();
        theoryBtn = new javax.swing.JButton();
        CalcSysEc = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TheoryFormulas = new javax.swing.JButton();
        CalcGeneral = new javax.swing.JButton();
        Home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ContentPanel.setForeground(new java.awt.Color(51, 51, 51));
        ContentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(ContentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 860, 600));

        MenuPanel.setBackground(new java.awt.Color(0, 102, 153));
        MenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CalcIntegrals.setBackground(new java.awt.Color(0, 102, 153));
        CalcIntegrals.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CalcIntegrals.setForeground(new java.awt.Color(255, 255, 255));
        CalcIntegrals.setText("Calculadora de Integrales Básicas   ");
        CalcIntegrals.setBorder(null);
        CalcIntegrals.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CalcIntegrals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CalcIntegralsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CalcIntegralsMouseExited(evt);
            }
        });
        CalcIntegrals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcIntegralsActionPerformed(evt);
            }
        });
        MenuPanel.add(CalcIntegrals, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 320, 40));

        theoryBtn.setBackground(new java.awt.Color(0, 102, 153));
        theoryBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        theoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        theoryBtn.setText("Teoria  ");
        theoryBtn.setBorder(null);
        theoryBtn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        theoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                theoryBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                theoryBtnMouseExited(evt);
            }
        });
        theoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theoryBtnActionPerformed(evt);
            }
        });
        MenuPanel.add(theoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 320, 41));

        CalcSysEc.setBackground(new java.awt.Color(0, 102, 153));
        CalcSysEc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CalcSysEc.setForeground(new java.awt.Color(255, 255, 255));
        CalcSysEc.setText("Calculadora de Sistema de Ecuaciones  ");
        CalcSysEc.setBorder(null);
        CalcSysEc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CalcSysEc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CalcSysEcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CalcSysEcMouseExited(evt);
            }
        });
        CalcSysEc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcSysEcActionPerformed(evt);
            }
        });
        MenuPanel.add(CalcSysEc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 320, 41));

        jSeparator1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        MenuPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 330, 10));

        jSeparator2.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        MenuPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 330, 10));

        jLabel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ÁLGEBRA LINEAL");
        MenuPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 127, -1));

        jLabel3.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CÁLCULO INTEGRAL");
        MenuPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 20));

        TheoryFormulas.setBackground(new java.awt.Color(0, 102, 153));
        TheoryFormulas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TheoryFormulas.setForeground(new java.awt.Color(255, 255, 255));
        TheoryFormulas.setText("Fórmulas   ");
        TheoryFormulas.setBorder(null);
        TheoryFormulas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TheoryFormulas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TheoryFormulasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TheoryFormulasMouseExited(evt);
            }
        });
        TheoryFormulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheoryFormulasActionPerformed(evt);
            }
        });
        MenuPanel.add(TheoryFormulas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 320, 40));

        CalcGeneral.setBackground(new java.awt.Color(0, 102, 153));
        CalcGeneral.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CalcGeneral.setForeground(new java.awt.Color(255, 255, 255));
        CalcGeneral.setText("Calculadora de Ecuaciones Cuadraticas  ");
        CalcGeneral.setBorder(null);
        CalcGeneral.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CalcGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CalcGeneralMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CalcGeneralMouseExited(evt);
            }
        });
        CalcGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcGeneralActionPerformed(evt);
            }
        });
        MenuPanel.add(CalcGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 320, 40));

        Home.setBackground(new java.awt.Color(0, 102, 153));
        Home.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setText("HOME");
        Home.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        MenuPanel.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 290, 41));

        getContentPane().add(MenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcSysEcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcSysEcActionPerformed
        // TODO add your handling code here:
        Home.setFocusPainted(false);
        SysEcuations window = new SysEcuations();
        cambiarContenidoPanel(window);
    }//GEN-LAST:event_CalcSysEcActionPerformed

    private void CalcIntegralsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcIntegralsActionPerformed
        Home.setFocusPainted(false);
        Integrals window = new Integrals();
        cambiarContenidoPanel(window);
    }//GEN-LAST:event_CalcIntegralsActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
        Home window = new Home();
        cambiarContenidoPanel(window);
        Home.setFocusPainted(false);

    }//GEN-LAST:event_HomeActionPerformed

    private void TheoryFormulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TheoryFormulasActionPerformed
        // TODO add your handling code here:
        Formulas window = new Formulas();
        cambiarContenidoPanel(window);
        Home.setFocusPainted(false);

    }//GEN-LAST:event_TheoryFormulasActionPerformed

    private void CalcGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcGeneralActionPerformed
        // TODO add your handling code here:
        EcuationsGenForm window = new EcuationsGenForm();
        cambiarContenidoPanel(window);
        Home.setFocusPainted(false);
    }//GEN-LAST:event_CalcGeneralActionPerformed

    private void theoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theoryBtnActionPerformed
        Theory window = new Theory();
        Home.setFocusPainted(false);
        cambiarContenidoPanel(window);    }//GEN-LAST:event_theoryBtnActionPerformed

    private void TheoryFormulasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TheoryFormulasMouseEntered
        // TODO add your handling code here:
        TheoryFormulas.setBackground(Color.decode("#3592C4"));
    }//GEN-LAST:event_TheoryFormulasMouseEntered

    private void TheoryFormulasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TheoryFormulasMouseExited
        // TODO add your handling code here:
        TheoryFormulas.setBackground(Color.decode("#006699"));
    }//GEN-LAST:event_TheoryFormulasMouseExited

    private void CalcSysEcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalcSysEcMouseEntered
        // TODO add your handling code here:
        CalcSysEc.setBackground(Color.decode("#3592C4"));
    }//GEN-LAST:event_CalcSysEcMouseEntered

    private void CalcSysEcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalcSysEcMouseExited
        // TODO add your handling code here:
        CalcSysEc.setBackground(Color.decode("#006699"));
    }//GEN-LAST:event_CalcSysEcMouseExited

    private void CalcGeneralMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalcGeneralMouseEntered
        // TODO add your handling code here:
        CalcGeneral.setBackground(Color.decode("#3592C4"));
    }//GEN-LAST:event_CalcGeneralMouseEntered

    private void CalcGeneralMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalcGeneralMouseExited
        // TODO add your handling code here:
        CalcGeneral.setBackground(Color.decode("#006699"));
    }//GEN-LAST:event_CalcGeneralMouseExited

    private void CalcIntegralsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalcIntegralsMouseEntered
        // TODO add your handling code here:
        CalcIntegrals.setBackground(Color.decode("#3592C4"));
    }//GEN-LAST:event_CalcIntegralsMouseEntered

    private void CalcIntegralsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalcIntegralsMouseExited
        // TODO add your handling code here:
        CalcIntegrals.setBackground(Color.decode("#006699"));
    }//GEN-LAST:event_CalcIntegralsMouseExited

    private void theoryBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_theoryBtnMouseEntered
        // TODO add your handling code here:
        theoryBtn.setBackground(Color.decode("#3592C4"));
    }//GEN-LAST:event_theoryBtnMouseEntered

    private void theoryBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_theoryBtnMouseExited
        // TODO add your handling code here:
        theoryBtn.setBackground(Color.decode("#006699"));
    }//GEN-LAST:event_theoryBtnMouseExited

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        // TODO add your handling code here:
        Home.setBackground(Color.decode("#3592C4"));
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        // TODO add your handling code here:
        Home.setBackground(Color.decode("#006699"));
    }//GEN-LAST:event_HomeMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcGeneral;
    private javax.swing.JButton CalcIntegrals;
    private javax.swing.JButton CalcSysEc;
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JButton Home;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JButton TheoryFormulas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton theoryBtn;
    // End of variables declaration//GEN-END:variables
}
