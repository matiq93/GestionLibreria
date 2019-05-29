/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.swing.JTextField;

/**
 *
 * @author Matias
 */
public class TxtMayusculas {
    
    private static TxtMayusculas aux;
    
    private TxtMayusculas() {
    }

    public static void soloMayus(JTextField aux) {
        if (aux == null) {
            new TxtMayusculas();
        }
        aux.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Character c = evt.getKeyChar();
                if (Character.isLetter(c)) {
                    evt.setKeyChar(Character.toUpperCase(c));
                }
            }
        });
    }
}
