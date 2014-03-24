/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.frc3620.colorpicker;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/**
 *
 * @author wegscd
 */
public class MyImageComponent extends JComponent {

    BufferedImage bufferedImage = null;
    Dimension dimension = new Dimension(360, 240);

    public MyImageComponent() {
        super();
    }

    public MyImageComponent(BufferedImage bi) {
        super();
        setImage(bi);
    }

    public void setImage(BufferedImage bi) {
        bufferedImage = bi;
        dimension = new Dimension(bufferedImage.getWidth(), bufferedImage.getHeight());
    }
    
    @Override
    public Dimension getPreferredSize() {
        return dimension;
    }

    @Override
    public Dimension getMinimumSize() {
        return dimension;
    }

    @Override
    public Dimension getMaximumSize() {
        return dimension;
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(bufferedImage, 0, 0, null);
    }

}
