/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.button;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;

/**
 *
 * @author Isjhar-pc
 */
 //pembuatan tambahan panel sebelah kanan
public class ToolBarExtensionPanel extends JPanel{
    private static final int N_HEIGHT = 600;
    private static final int N_WIDTH = 100;
    private final int padding = 0;
    
    public ToolBarExtensionPanel(){
        super();
        initDimension();
        initLayout();
    }
    //pengaturan ukuran panel sebelah 
    private void initDimension(){
        Dimension dimension = new Dimension(N_WIDTH, N_HEIGHT);
        setPreferredSize(dimension);
    }
    //pengaturan tata letak dimension agar lebih rapi
    private void initLayout(){
        FlowLayout layout = new FlowLayout();
        layout.setHgap(padding);
        layout.setVgap(padding);
        setLayout(layout);
    }
   
    /**
     * @return the HEIGHT
     */
    public int getNHeight() {
        return N_HEIGHT;
    }

    /**
     * @return the WIDTH
     */
    public int getNWidth() {
        return N_WIDTH;
    }
    
    
}
