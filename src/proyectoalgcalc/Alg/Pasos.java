/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectoalgcalc.Alg;
import proyectoalgcalc.Alg.EcuationsGenForm;
import java.awt.FlowLayout;

/**
 *
 * @author Sayuri
 */
public class Pasos extends javax.swing.JPanel {

    /**
     * Creates new form Pasos
     */
    public Pasos(String a, String b, String c) {
        initComponents();

        recA.setText(a);
        recB.setText(b);
        recC.setText(c);
        actualizarInterfaz();
    }

    private void actualizarInterfaz() {
    labelA.setText("(" + recA.getText() + ")");
    labelA1.setText("(" + recA.getText() + ")");
    labelB.setText("-(" + recB.getText() + ")");
    labelB2.setText("(" + recB.getText() + ")²");
    labelC.setText("(" + recC.getText() + ")");
    //primer paso
    labelA1.setText("(" + recA.getText() + ")");
    
    double a = Double.parseDouble(recA.getText());
    double b = Double.parseDouble(recB.getText());
    double c = Double.parseDouble(recC.getText());

    double total = 4 * (a * c);
    recAC.setText(String.valueOf(total));

    double total1 = b * b;
    LabelB2.setText(String.valueOf(total1));

    double total2 = -1 * b;
    labelB1.setText(String.valueOf(total2));
    labelb4.setText(String.valueOf(total2));
    labelB7.setText(String.valueOf(total2));
    labelB8.setText(String.valueOf(total2));
    labelB9.setText(String.valueOf(total2));
    labelB10.setText(String.valueOf(total2));
    labelB11.setText(String.valueOf(total2));

    double total3 = total1 - total;
    labelbac.setText(String.valueOf(total3));

    double total4 = 2 * a;
    label2a.setText(String.valueOf(total4));
    Label2a2.setText(String.valueOf(total4));
    Label2a3.setText(String.valueOf(total4));
    Label2a4.setText(String.valueOf(total4));
    Label2a5.setText(String.valueOf(total4));
    Label2a6.setText(String.valueOf(total4));

    double total5 = Math.sqrt(total3);
    labelsqrt.setText(String.valueOf(total5));
    labelsqrt1.setText(String.valueOf(total5));
    labelsqrt2.setText(String.valueOf(total5));

    double total6 = total2 + total5;
    labelB7.setText(String.valueOf(total6));

    double total7 = total6 / total4;
    totalx1.setText(String.valueOf(total7));

    double total8 = total2 - total5;
    labelB9.setText(String.valueOf(total8));

    double total9 = total8 / total4;
    totalx2.setText(String.valueOf(total9));
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContentPanel = new javax.swing.JPanel();
        atxt = new javax.swing.JLabel();
        recA = new javax.swing.JTextField();
        ctxt = new javax.swing.JLabel();
        recB = new javax.swing.JTextField();
        btxt = new javax.swing.JLabel();
        recC = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
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
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        LabelB2 = new javax.swing.JLabel();
        labelA3 = new javax.swing.JLabel();
        xtxt1 = new javax.swing.JLabel();
        signotxt1 = new javax.swing.JLabel();
        recAC = new javax.swing.JLabel();
        sqrttxt1 = new javax.swing.JLabel();
        partxt1 = new javax.swing.JLabel();
        dostxt1 = new javax.swing.JLabel();
        labelB1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        labelbac = new javax.swing.JLabel();
        xtxt2 = new javax.swing.JLabel();
        signotxt2 = new javax.swing.JLabel();
        sqrttxt2 = new javax.swing.JLabel();
        partxt2 = new javax.swing.JLabel();
        label2a = new javax.swing.JLabel();
        labelb4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        xtxt3 = new javax.swing.JLabel();
        signotxt3 = new javax.swing.JLabel();
        labelsqrt = new javax.swing.JLabel();
        labelB7 = new javax.swing.JLabel();
        Label2a2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        xtxt4 = new javax.swing.JLabel();
        labelsqrt1 = new javax.swing.JLabel();
        labelB8 = new javax.swing.JLabel();
        Label2a3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        xtxt5 = new javax.swing.JLabel();
        labelsqrt2 = new javax.swing.JLabel();
        labelB9 = new javax.swing.JLabel();
        Label2a5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        xtxt6 = new javax.swing.JLabel();
        labelB10 = new javax.swing.JLabel();
        Label2a4 = new javax.swing.JLabel();
        x1txt1 = new javax.swing.JLabel();
        totalx1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        xtxt7 = new javax.swing.JLabel();
        labelB11 = new javax.swing.JLabel();
        Label2a6 = new javax.swing.JLabel();
        x1txt2 = new javax.swing.JLabel();
        totalx2 = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ContentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atxt.setBackground(new java.awt.Color(255, 255, 255));
        atxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        atxt.setForeground(new java.awt.Color(0, 0, 0));
        atxt.setText("a =");
        ContentPanel.add(atxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        recA.setEditable(false);
        recA.setBackground(new java.awt.Color(204, 255, 255));
        recA.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ContentPanel.add(recA, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        ctxt.setBackground(new java.awt.Color(255, 255, 255));
        ctxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        ctxt.setForeground(new java.awt.Color(0, 0, 0));
        ctxt.setText("b =");
        ContentPanel.add(ctxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        recB.setEditable(false);
        recB.setBackground(new java.awt.Color(204, 255, 255));
        recB.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ContentPanel.add(recB, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, -1));

        btxt.setBackground(new java.awt.Color(255, 255, 255));
        btxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btxt.setForeground(new java.awt.Color(0, 0, 0));
        btxt.setText("c =");
        ContentPanel.add(btxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        recC.setEditable(false);
        recC.setBackground(new java.awt.Color(204, 255, 255));
        recC.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        recC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recCActionPerformed(evt);
            }
        });
        ContentPanel.add(recC, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelB2.setBackground(new java.awt.Color(255, 255, 255));
        labelB2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelB2.setForeground(new java.awt.Color(0, 0, 0));
        labelB2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB2.setText("(b)²");

        labelA.setBackground(new java.awt.Color(255, 255, 255));
        labelA.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelA.setForeground(new java.awt.Color(0, 0, 0));
        labelA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA.setText("(a)");

        labelC.setBackground(new java.awt.Color(255, 255, 255));
        labelC.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelC.setForeground(new java.awt.Color(0, 0, 0));
        labelC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelC.setText("(c)");

        labelA1.setBackground(new java.awt.Color(255, 255, 255));
        labelA1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelA1.setForeground(new java.awt.Color(0, 0, 0));
        labelA1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelA1.setText("(a)");

        xtxt.setBackground(new java.awt.Color(255, 255, 255));
        xtxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        xtxt.setForeground(new java.awt.Color(0, 0, 0));
        xtxt.setText("x =");

        signotxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        signotxt.setForeground(new java.awt.Color(0, 0, 0));

        cuatrotxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        cuatrotxt.setForeground(new java.awt.Color(0, 0, 0));
        cuatrotxt.setText("(4)");

        sqrttxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        sqrttxt.setForeground(new java.awt.Color(0, 0, 0));
        sqrttxt.setText("sqrt(");

        partxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        partxt.setForeground(new java.awt.Color(0, 0, 0));
        partxt.setText(")");

        dostxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        dostxt.setForeground(new java.awt.Color(0, 0, 0));
        dostxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dostxt.setText("(2)");

        labelB.setBackground(new java.awt.Color(255, 255, 255));
        labelB.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelB.setForeground(new java.awt.Color(0, 0, 0));
        labelB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelB.setText("-(b)");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoalgcalc/Img/formul1.png"))); // NOI18N
        jLabel2.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signotxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sqrttxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelB2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dostxt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelA1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cuatrotxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelA, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(partxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(76, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(xtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(signotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cuatrotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelC)
                                .addComponent(partxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelB2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sqrttxt)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dostxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(labelA1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(53, Short.MAX_VALUE)))
        );

        ContentPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 648, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LabelB2.setBackground(new java.awt.Color(255, 255, 255));
        LabelB2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        LabelB2.setForeground(new java.awt.Color(0, 0, 0));
        LabelB2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelB2.setText("b");

        labelA3.setBackground(new java.awt.Color(255, 255, 255));
        labelA3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelA3.setForeground(new java.awt.Color(0, 0, 0));
        labelA3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelA3.setText("(a)");

        xtxt1.setBackground(new java.awt.Color(255, 255, 255));
        xtxt1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        xtxt1.setForeground(new java.awt.Color(0, 0, 0));
        xtxt1.setText("x =");

        signotxt1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        signotxt1.setForeground(new java.awt.Color(0, 0, 0));

        recAC.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        recAC.setForeground(new java.awt.Color(0, 0, 0));
        recAC.setText("a*c");

        sqrttxt1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        sqrttxt1.setForeground(new java.awt.Color(0, 0, 0));
        sqrttxt1.setText("sqrt(");

        partxt1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        partxt1.setForeground(new java.awt.Color(0, 0, 0));
        partxt1.setText(")");

        dostxt1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        dostxt1.setForeground(new java.awt.Color(0, 0, 0));
        dostxt1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dostxt1.setText("(2)");

        labelB1.setBackground(new java.awt.Color(255, 255, 255));
        labelB1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelB1.setForeground(new java.awt.Color(0, 0, 0));
        labelB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB1.setText("-(b)");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("-");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoalgcalc/Img/formul1.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signotxt1)
                .addGap(6, 6, 6)
                .addComponent(sqrttxt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelB2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recAC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(partxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(xtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(96, 96, 96)
                            .addComponent(dostxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(labelA3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(labelB1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(121, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sqrttxt1)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LabelB2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(signotxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(recAC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(partxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(58, 58, 58))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap(15, Short.MAX_VALUE)
                            .addComponent(labelB1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dostxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(labelA3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(xtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(15, 15, 15)))
        );

        ContentPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 547, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelbac.setBackground(new java.awt.Color(255, 255, 255));
        labelbac.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelbac.setForeground(new java.awt.Color(0, 0, 0));
        labelbac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelbac.setText("b-a*c");

        xtxt2.setBackground(new java.awt.Color(255, 255, 255));
        xtxt2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        xtxt2.setForeground(new java.awt.Color(0, 0, 0));
        xtxt2.setText("x =");

        signotxt2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        signotxt2.setForeground(new java.awt.Color(0, 0, 0));

        sqrttxt2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        sqrttxt2.setForeground(new java.awt.Color(0, 0, 0));
        sqrttxt2.setText("sqrt(");

        partxt2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        partxt2.setForeground(new java.awt.Color(0, 0, 0));
        partxt2.setText(")");

        label2a.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        label2a.setForeground(new java.awt.Color(0, 0, 0));
        label2a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2a.setText("2*a");

        labelb4.setBackground(new java.awt.Color(255, 255, 255));
        labelb4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelb4.setForeground(new java.awt.Color(0, 0, 0));
        labelb4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelb4.setText("b");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoalgcalc/Img/formul1.png"))); // NOI18N
        jLabel6.setText("jLabel1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xtxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(signotxt2)
                        .addGap(6, 6, 6)
                        .addComponent(sqrttxt2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelbac, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(partxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(label2a, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(labelb4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(63, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(signotxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sqrttxt2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(partxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelbac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(label2a, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(xtxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(labelb4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(38, Short.MAX_VALUE)))
        );

        ContentPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 429, 70));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        xtxt3.setBackground(new java.awt.Color(255, 255, 255));
        xtxt3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        xtxt3.setForeground(new java.awt.Color(0, 0, 0));
        xtxt3.setText("x =");

        signotxt3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        signotxt3.setForeground(new java.awt.Color(0, 0, 0));

        labelsqrt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelsqrt.setForeground(new java.awt.Color(0, 0, 0));
        labelsqrt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelsqrt.setText("sqrt(");

        labelB7.setBackground(new java.awt.Color(255, 255, 255));
        labelB7.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelB7.setForeground(new java.awt.Color(0, 0, 0));
        labelB7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB7.setText("-(b)");

        Label2a2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Label2a2.setForeground(new java.awt.Color(0, 0, 0));
        Label2a2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label2a2.setText("2*a");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoalgcalc/Img/formul1.png"))); // NOI18N
        jLabel7.setText("jLabel1");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xtxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signotxt3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelsqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(labelB7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(Label2a2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(82, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(xtxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signotxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelsqrt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(labelB7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Label2a2)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        ContentPanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 350, 100));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        xtxt4.setBackground(new java.awt.Color(255, 255, 255));
        xtxt4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        xtxt4.setForeground(new java.awt.Color(0, 0, 0));
        xtxt4.setText("x1 =");

        labelsqrt1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelsqrt1.setForeground(new java.awt.Color(0, 0, 0));
        labelsqrt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelsqrt1.setText("sqrt(");

        labelB8.setBackground(new java.awt.Color(255, 255, 255));
        labelB8.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelB8.setForeground(new java.awt.Color(0, 0, 0));
        labelB8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB8.setText("-(b)");

        Label2a3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Label2a3.setForeground(new java.awt.Color(0, 0, 0));
        Label2a3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label2a3.setText("2*a");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("+");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelsqrt1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(xtxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(labelB8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(Label2a3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(94, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelsqrt1)
                    .addComponent(jLabel5))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(xtxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(labelB8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Label2a3)))
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        ContentPanel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        xtxt5.setBackground(new java.awt.Color(255, 255, 255));
        xtxt5.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        xtxt5.setForeground(new java.awt.Color(0, 0, 0));
        xtxt5.setText("x2 =");

        labelsqrt2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelsqrt2.setForeground(new java.awt.Color(0, 0, 0));
        labelsqrt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelsqrt2.setText("sqrt(");

        labelB9.setBackground(new java.awt.Color(255, 255, 255));
        labelB9.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelB9.setForeground(new java.awt.Color(0, 0, 0));
        labelB9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB9.setText("-(b)");

        Label2a5.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Label2a5.setForeground(new java.awt.Color(0, 0, 0));
        Label2a5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label2a5.setText("2*a");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("-");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(xtxt5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(labelB9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(labelsqrt2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(Label2a5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(89, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(xtxt5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelB9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(labelsqrt2)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Label2a5)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        ContentPanel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, 100));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        xtxt6.setBackground(new java.awt.Color(255, 255, 255));
        xtxt6.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        xtxt6.setForeground(new java.awt.Color(0, 0, 0));
        xtxt6.setText("x1 =");

        labelB10.setBackground(new java.awt.Color(255, 255, 255));
        labelB10.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelB10.setForeground(new java.awt.Color(0, 0, 0));
        labelB10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB10.setText("-(b)");

        Label2a4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Label2a4.setForeground(new java.awt.Color(0, 0, 0));
        Label2a4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label2a4.setText("2*a");

        x1txt1.setBackground(new java.awt.Color(255, 255, 255));
        x1txt1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        x1txt1.setForeground(new java.awt.Color(0, 0, 0));
        x1txt1.setText("x1 =");

        totalx1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        totalx1.setForeground(new java.awt.Color(0, 0, 0));
        totalx1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalx1.setText("Res");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Label2a4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(x1txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalx1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(xtxt6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(labelB10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(186, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label2a4)
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x1txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalx1))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(xtxt6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(labelB10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ContentPanel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        xtxt7.setBackground(new java.awt.Color(255, 255, 255));
        xtxt7.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        xtxt7.setForeground(new java.awt.Color(0, 0, 0));
        xtxt7.setText("x2 =");

        labelB11.setBackground(new java.awt.Color(255, 255, 255));
        labelB11.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelB11.setForeground(new java.awt.Color(0, 0, 0));
        labelB11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB11.setText("-(b)");

        Label2a6.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Label2a6.setForeground(new java.awt.Color(0, 0, 0));
        Label2a6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label2a6.setText("2*a");

        x1txt2.setBackground(new java.awt.Color(255, 255, 255));
        x1txt2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        x1txt2.setForeground(new java.awt.Color(0, 0, 0));
        x1txt2.setText("x2 =");

        totalx2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        totalx2.setForeground(new java.awt.Color(0, 0, 0));
        totalx2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalx2.setText("Res");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Label2a6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(x1txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalx2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(xtxt7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(labelB11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(181, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label2a6)
                .addContainerGap())
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x1txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalx2))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(xtxt7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(labelB11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        ContentPanel.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, -1, -1));

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        ContentPanel.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void recCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recCActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
        EcuationsGenForm window = new EcuationsGenForm();
        ContentPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        ContentPanel.removeAll();
        ContentPanel.add(window);
        ContentPanel.revalidate();
        ContentPanel.repaint();
    }//GEN-LAST:event_RegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JLabel Label2a2;
    private javax.swing.JLabel Label2a3;
    private javax.swing.JLabel Label2a4;
    private javax.swing.JLabel Label2a5;
    private javax.swing.JLabel Label2a6;
    private javax.swing.JLabel LabelB2;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel atxt;
    private javax.swing.JLabel btxt;
    private javax.swing.JLabel ctxt;
    private javax.swing.JLabel cuatrotxt;
    private javax.swing.JLabel dostxt;
    private javax.swing.JLabel dostxt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel label2a;
    private javax.swing.JLabel labelA;
    private javax.swing.JLabel labelA1;
    private javax.swing.JLabel labelA3;
    private javax.swing.JLabel labelB;
    private javax.swing.JLabel labelB1;
    private javax.swing.JLabel labelB10;
    private javax.swing.JLabel labelB11;
    private javax.swing.JLabel labelB2;
    private javax.swing.JLabel labelB7;
    private javax.swing.JLabel labelB8;
    private javax.swing.JLabel labelB9;
    private javax.swing.JLabel labelC;
    private javax.swing.JLabel labelb4;
    private javax.swing.JLabel labelbac;
    private javax.swing.JLabel labelsqrt;
    private javax.swing.JLabel labelsqrt1;
    private javax.swing.JLabel labelsqrt2;
    private javax.swing.JLabel partxt;
    private javax.swing.JLabel partxt1;
    private javax.swing.JLabel partxt2;
    public static javax.swing.JTextField recA;
    private javax.swing.JLabel recAC;
    public static javax.swing.JTextField recB;
    public static javax.swing.JTextField recC;
    private javax.swing.JLabel signotxt;
    private javax.swing.JLabel signotxt1;
    private javax.swing.JLabel signotxt2;
    private javax.swing.JLabel signotxt3;
    private javax.swing.JLabel sqrttxt;
    private javax.swing.JLabel sqrttxt1;
    private javax.swing.JLabel sqrttxt2;
    private javax.swing.JLabel totalx1;
    private javax.swing.JLabel totalx2;
    private javax.swing.JLabel x1txt1;
    private javax.swing.JLabel x1txt2;
    private javax.swing.JLabel xtxt;
    private javax.swing.JLabel xtxt1;
    private javax.swing.JLabel xtxt2;
    private javax.swing.JLabel xtxt3;
    private javax.swing.JLabel xtxt4;
    private javax.swing.JLabel xtxt5;
    private javax.swing.JLabel xtxt6;
    private javax.swing.JLabel xtxt7;
    // End of variables declaration//GEN-END:variables

}
