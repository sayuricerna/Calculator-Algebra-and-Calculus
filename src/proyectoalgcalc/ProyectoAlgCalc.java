/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoalgcalc;
import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Sayuri
 */
public class ProyectoAlgCalc {
    private void ButtonAnimation(JButton boton, Color fondo, Color texto) {
        boton.setBackground(fondo);
        boton.setForeground(texto);
    }
    public static void main(String[] args) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}
