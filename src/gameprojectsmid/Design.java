package gameprojectsmid;

import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.Toolkit;




public class Design extends javax.swing.JFrame{

    public Design() {
        initComponents();
        setTitle("Dx Ball");
        this.setResizable(false);
       
        this.setLocationRelativeTo(null);// center form in the screen
        Toolkit toolkit=getToolkit();
        Dimension size =toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        
    }
    
   
    private GameRun object_;
    private AreaGenerator obA;
    public Design(GameRun object){
        object_=object;
    }
    public void frame1(){
        setVisible(false);
        JFrame ob=new JFrame();
		
		GameRun objGame=new GameRun();
                
		int width=700;
		int height=600;
		
		ob.setBounds(10,10,width,height);
        ob.setTitle("DX Ball");
        ob.setResizable(false);
        ob.setVisible(true);
        
        /////////This Code For Windows Center........
        int scrWidth=(int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int scrHeight=(int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        
        
        ob.setSize(width, height);
        ob.setLocation((scrWidth/2)-(width/2), (scrHeight/2)-(height/2));
        
        
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ////////Adding Game Run Class here..........
        ob.add(objGame);
    }
    
    
    
    public void frame2(){
       GameRun obGame=new GameRun();
    
      /*  if(!obGame.play){
            obGame.play=true;
            obGame.playerX=310;
            obGame.ballposX=350;
            obGame.ballposY=500;
            obGame.ballXdir=-1;
            obGame.ballYdir=-2;
            obGame.playerX=310;
            if(obGame.count==1) {
                                 obGame.score=0;
				obGame.totalBricks=21;
				obA=new AreaGenerator(3,7);//// Passing arguments AreaGenerator Constructor.......
				}
				
				if(obGame.count==2) {
                                    obGame.score=21*5;
					obGame.totalBricks=32;
					obA=new AreaGenerator(4,8);//// Passing arguments AreaGenerator Constructor.......
					}
				if(obGame.count==3) {
                                    obGame.score=32*5;
					obGame.totalBricks=40;
					obA=new AreaGenerator(5,8);//// Passing arguments AreaGenerator Constructor.......
					}
				if(obGame.count==4) {
                                    obGame.score=40*5;
					obGame.totalBricks=45;
					obA=new AreaGenerator(5,9);//// Passing arguments AreaGenerator Constructor.......
					}
				if(obGame.count==5) {
                                    obGame.score=45*5;
					obGame.totalBricks=50;
					obA=new AreaGenerator(5,10);//// Passing arguments AreaGenerator Constructor.......
					}
				obGame.repaint();///// Here  Again Call the paint method........*/
        }
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        btn_newgame = new javax.swing.JButton();
        btn_highscore = new javax.swing.JButton();
        btn_continue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 600, 700));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 700));

        lbl_title.setBackground(new java.awt.Color(0, 0, 0));
        lbl_title.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setText("  WEL COME TO BRICKS BREAKERS GAME");
        lbl_title.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lbl_titlePropertyChange(evt);
            }
        });

        btn_newgame.setBackground(new java.awt.Color(0, 0, 0));
        btn_newgame.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btn_newgame.setForeground(new java.awt.Color(255, 255, 255));
        btn_newgame.setText("NEW GAME");
        btn_newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newgameActionPerformed(evt);
            }
        });
        btn_newgame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_newgameKeyPressed(evt);
            }
        });

        btn_highscore.setBackground(new java.awt.Color(0, 0, 0));
        btn_highscore.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btn_highscore.setForeground(new java.awt.Color(255, 255, 255));
        btn_highscore.setText("High Scores");
        btn_highscore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_highscoreActionPerformed(evt);
            }
        });

        btn_continue.setBackground(new java.awt.Color(0, 0, 0));
        btn_continue.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btn_continue.setForeground(new java.awt.Color(255, 255, 255));
        btn_continue.setText("Continue");
        btn_continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_continueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_continue, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_newgame, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_highscore, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btn_newgame, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btn_continue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_highscore, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_newgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newgameActionPerformed
        setVisible(false);
        frame1(); 
    }//GEN-LAST:event_btn_newgameActionPerformed

    private void btn_highscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_highscoreActionPerformed

    }//GEN-LAST:event_btn_highscoreActionPerformed

    private void btn_continueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continueActionPerformed
        frame2();
    }//GEN-LAST:event_btn_continueActionPerformed

    private void lbl_titlePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lbl_titlePropertyChange
        lbl_title.setForeground(Color.green);
    }//GEN-LAST:event_lbl_titlePropertyChange

    private void btn_newgameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_newgameKeyPressed
      
    }//GEN-LAST:event_btn_newgameKeyPressed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_continue;
    private javax.swing.JButton btn_highscore;
    private javax.swing.JButton btn_newgame;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_title;
    // End of variables declaration//GEN-END:variables
    
}
