/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tubesrploot.xblock.button;

import java.awt.Dimension;
import javax.swing.JToolBar;

/**
 *
 * @author USER
 */
public class ArrowToolBar extends JToolBar{
    private int nHeight;
    private int nWidth;
    
    public ArrowToolBar(){
        super();
        
        setOrientation(JToolBar.VERTICAL);
        setToolTipText("arrow toolbar");
    }
    
    public void initDimension(){
        Dimension dimension = new Dimension(nWidth, nHeight);
        setPreferredSize(dimension);
    }

    
    public void setNHeight(int nHeight) {
        this.nHeight = nHeight;
    }
    
    public void setNWidth(int nWidth) {
        this.nWidth = nWidth;
    }
}
