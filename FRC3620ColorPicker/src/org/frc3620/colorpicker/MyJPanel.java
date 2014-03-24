/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.frc3620.colorpicker;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author WEGSCD
 */
public class MyJPanel extends JPanel {
    static Dimension defaultSize = new Dimension (360, 240);

    public MyJPanel() {
        super();
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));                
    }
    
        Component i1 = null;

    @Override
    public Dimension getMinimumSize() {
        return s();
    }

    @Override
    public Dimension getMaximumSize() {
        return s();
    }

    @Override
    public Dimension getPreferredSize() {
        return s();
    }
    
    private Dimension s() {
        if (i1 != null) {
        Dimension d = new Dimension(i1.getPreferredSize());
        d.width *= 2;
        System.out.println (i1.getPreferredSize() + " -> " + d);
        return d;
        } else {
            return defaultSize;
        }
    }

    @Override
    public Component add(Component comp) {
        if (i1 == null) i1 = comp;
        return super.add(comp);
    }


    
}
