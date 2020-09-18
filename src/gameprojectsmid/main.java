package gameprojectsmid;


import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class main extends javax.swing.JFrame {
    	  public static void main(String[] args){
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Design().setVisible(true);
            }
        });
} 
   public  main(){
		JFrame ob=new JFrame();
		
		GameRun objGame=new GameRun();
		Design obj=new Design();
		int width=700;
		int height=600;
		
		ob.setBounds(10,10,width,height);
        ob.setTitle("DX Ball");
        ob.setResizable(false);
        ob.setVisible(true);
        
        /////////This Code For Windows Center........
        int scrWidth=(int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int scrHeight=(int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        
        System.out.println("After scrWidth="+scrWidth);
        System.out.println("After scrHeight="+scrHeight);
        
        ob.setSize(width, height);
        ob.setLocation((scrWidth/2)-(width/2), (scrHeight/2)-(height/2));
        
        
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ////////Adding Game Run Class here..........
        ob.add(obj);
        ob.add(objGame);
	}
  }


