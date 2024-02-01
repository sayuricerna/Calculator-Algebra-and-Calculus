/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectoalgcalc.Alg;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Sayuri
 */
public class SysEcuations extends javax.swing.JPanel {
    private double[][] coeficientes;
    private double[] solucion;
    private final String[] variables = {"x", "y", "z", "w"};
    private JTextField[][] coeficientesField;
    public SysEcuations() {
        initComponents();
    } 
    private double[][] obtenerCoeficientes(int n) {
        
        
    coeficientes = new double[n][n + 1];
    coeficientesField = new JTextField[n][n + 1];
    inputPanel.removeAll();

    // Grid filas de acuerdo al nfield y los gaps entre cada uno no aumentar el gap se sobresale
    inputPanel.setLayout(new java.awt.GridLayout(n, n * 2 + 1,5, 5));

    // Casilleros para coeficientes desde 3 a 20
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            coeficientesField[i][j] = new JTextField(5);
            inputPanel.add(coeficientesField[i][j]);
            JLabel variableLabel = new JLabel(variables[j]);
            inputPanel.add(variableLabel);
        }
        JLabel igualLabel = new JLabel("=");
        inputPanel.add(igualLabel);
        coeficientesField[i][n] = new JTextField(5);
        inputPanel.add(coeficientesField[i][n]);
    }
    inputPanel.revalidate();
    inputPanel.repaint();
    return coeficientes;

    }
    //eliminacion
    private void resolverEcuacionesLineales(double[][] coeficientes, int n) {
        for (int i = 0; i < n; i++) {
            double divisor = coeficientes[i][i];
            for (int j = 0; j < n + 1; j++) {
                coeficientes[i][j] /= divisor;
            }
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = coeficientes[k][i];
                    for (int j = 0; j < n + 1; j++) {
                        coeficientes[k][j] -= factor * coeficientes[i][j];
                    }
                }
            }
            mostrarProceso(coeficientes, n); 
            System.out.println();
        }
        //No mover es para la solucion
        double[] solucion = new double[n];
        for (int i = 0; i < n; i++) {
            solucion[i] = coeficientes[i][n];
        }
        mostrarSolucion(n, solucion); 
    }
    private void mostrarProceso(double[][] coeficientes, int n) {
        
          procesoTextArea.append("\n");

    for (int i = 0; i < n; i++) {
        procesoTextArea.append("Paso " + (i + 1) + ":\n");

        // Imprimir la matriz en este paso
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n + 1; col++) {
                procesoTextArea.append(coeficientes[row][col] + "\t");
            }
            procesoTextArea.append("\n");
        }
        procesoTextArea.append("\n");

        if (i < n - 1) {
            procesoTextArea.append("Operaciones:\n");

            // Mostrar las operaciones realizadas en este paso para los ceros y la matriz diagonal
            for (int k = i + 1; k < n; k++) {
                double factor = coeficientes[k][i] / coeficientes[i][i];
                procesoTextArea.append("Fila " + (k + 1) + " = Fila " + (k + 1) + " - " +
                        factor + " * Fila " + (i + 1) + "\n");

                // Aplicar la operación en la fila k
                for (int j = 0; j < n + 1; j++) {
                    coeficientes[k][j] -= factor * coeficientes[i][j];
                }
            }
            procesoTextArea.append("\n");
        }
    }//no codigo alterno en caso se cambie a textfield
       //  mostrarSolucion(n, solucion);
        // Mostrar la solución en el procesoTextArea
        //Respuesta.setText(RespuestaTxt);
    }
private void limpiarCampos(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n + 1; j++) {
            coeficientesField[i][j].setText("");
        }
    }
    RespuestaTextField.setText("");
    procesoTextArea.setText("");
    nField.setText("");
}
    
    private void mostrarSolucion(int n, double[] solucion) {
        
        StringBuilder result = new StringBuilder("\n");
        for (int i = 0; i < n; i++) {
            result.append(variables[i]).append(" = ").append(solucion[i]).append("\n");
        }
       RespuestaTextField.setText(result.toString());
        //RespuestaTextField.setText("Holiiii pruebaaaaa");

        //return result.toString(); //agregado
        //JOptionPane.showMessageDialog(this, result.toString());
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        procesoScrollPane = new javax.swing.JScrollPane();
        procesoTextArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        LIMPIAR = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        RespuestaTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Calculadora de Sistema de Ecuaciones");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 435, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Ecuación de la forma  ax + bx = c ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Respuesta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));

        nField.setBackground(new java.awt.Color(255, 255, 255));
        nField.setForeground(new java.awt.Color(0, 0, 0));
        nField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 50, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Enter");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 130, -1));

        procesoTextArea.setBackground(new java.awt.Color(255, 255, 255));
        procesoTextArea.setColumns(20);
        procesoTextArea.setRows(5);
        procesoScrollPane.setViewportView(procesoTextArea);

        jPanel1.add(procesoScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 460, 140));

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Ingrese el número de ecuaciones (2-4):");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        inputPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(inputPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 470, 110));

        LIMPIAR.setBackground(new java.awt.Color(255, 255, 255));
        LIMPIAR.setForeground(new java.awt.Color(0, 0, 0));
        LIMPIAR.setText("LIMPIAR");
        LIMPIAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LIMPIARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LIMPIARMouseExited(evt);
            }
        });
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });
        jPanel1.add(LIMPIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 120, 30));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("CALCULAR");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 120, 30));

        RespuestaTextField.setBackground(new java.awt.Color(255, 255, 255));
        RespuestaTextField.setBorder(null);
        jPanel1.add(RespuestaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 460, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Proceso");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     int n = Integer.parseInt(nField.getText());
    if (n >= 1 && n <= 4) {
        coeficientes = obtenerCoeficientes(n);
    } else {
        JOptionPane.showMessageDialog(SysEcuations.this, "Ingrese un número válido de ecuaciones (2-4).");
    }       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nFieldActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
    int n = Integer.parseInt(nField.getText());
    limpiarCampos(n);        // TODO add your handling code here:
    }//GEN-LAST:event_LIMPIARActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //BOTON CALCULAR
        int n = Integer.parseInt(nField.getText());
        if (true) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n + 1; j++) {
                    coeficientes[i][j] = Double.parseDouble(coeficientesField[i][j].getText());
                }
            }
        } else {
        JOptionPane.showMessageDialog(SysEcuations.this, "Por favor Ingrese datos");
        }
        resolverEcuacionesLineales(coeficientes, n);       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        jButton4.setBackground(Color.decode("#3592C4"));
        jButton4.setForeground(Color.white);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        jButton4.setBackground(Color.white);
        jButton4.setForeground(Color.black);

    }//GEN-LAST:event_jButton4MouseExited

    private void LIMPIARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LIMPIARMouseEntered
        // TODO add your handling code here:
        LIMPIAR.setBackground(Color.decode("#3592C4"));
        LIMPIAR.setForeground(Color.white);
                        
    }//GEN-LAST:event_LIMPIARMouseEntered

    private void LIMPIARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LIMPIARMouseExited
        // TODO add your handling code here:
        LIMPIAR.setBackground(Color.white);
        LIMPIAR.setForeground(Color.black);

    }//GEN-LAST:event_LIMPIARMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(Color.decode("#3592C4"));
        jButton1.setForeground(Color.white);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(Color.white);
        jButton1.setForeground(Color.black);
    }//GEN-LAST:event_jButton1MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LIMPIAR;
    private javax.swing.JTextField RespuestaTextField;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nField;
    private javax.swing.JScrollPane procesoScrollPane;
    private javax.swing.JTextArea procesoTextArea;
    // End of variables declaration//GEN-END:variables
}
