/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.util.Duration;
import selective.repeat.FXMLDocumentController;

/**
 *
 * @author Uchiha Tobi
 */
public class Packet{
   
    public int s;public boolean newpa=true;
    public boolean run=false;
  public  Timeline t=new Timeline();
    Button bt;
   public synchronized void res() throws Exception 
    {
     
            t.pause();
        run=false;
          bt.setLayoutX(FXMLDocumentController.sd[s].getLayoutX());
            bt.setLayoutY(FXMLDocumentController.sd[s].getLayoutY());
             FXMLDocumentController.recst[s]=false;
             bt.setStyle("-fx-background-color: #990099");
              bt.setVisible(false);
    }
    public synchronized void ress(boolean f) throws Exception 
    {
      
            t.pause();
        run=false;
            bt.setLayoutY(FXMLDocumentController.sd[s].getLayoutY());
            bt.setStyle("-fx-background-color: #990099");
              bt.setVisible(false);
              if(!f)
              {
                                   FXMLDocumentController.ll[FXMLDocumentController.currentL].setTextFill(Paint.valueOf("#ff0000"));
                    FXMLDocumentController.ll[FXMLDocumentController.currentL].setFont(new Font(28));
                 FXMLDocumentController.li[FXMLDocumentController.currentL].setStartX(80);
                    FXMLDocumentController.li[FXMLDocumentController.currentL].setStartY(FXMLDocumentController.star);
                    FXMLDocumentController.li[FXMLDocumentController.currentL].setEndX((423+80)/2);
                      FXMLDocumentController.ll[FXMLDocumentController.currentL].setLayoutY((2*FXMLDocumentController.star+20)/2-60);
                    FXMLDocumentController.star+=20;
                    FXMLDocumentController.li[FXMLDocumentController.currentL].setEndY(FXMLDocumentController.star);
                      FXMLDocumentController.li[FXMLDocumentController.currentL].setStrokeWidth(5);
                      FXMLDocumentController.li[FXMLDocumentController.currentL].setStroke(Paint.valueOf("#ff0000"));
                    FXMLDocumentController.star+=30; 
                    FXMLDocumentController.ll[FXMLDocumentController.currentL].setText(Integer.toString(s%(int)Math.pow(2, (FXMLDocumentController.sqlimit)))/*+"->"*/);
                           FXMLDocumentController.ll[FXMLDocumentController.currentL].setLayoutX((66+422)/2);
                           FXMLDocumentController.ll[FXMLDocumentController.currentL].setMinSize(100, 100);
                           FXMLDocumentController.ll[FXMLDocumentController.currentL].setStyle(" -fx-font-family: \"TOXIA\" ;");
                        ++FXMLDocumentController.currentL;
              }
    }
    public Packet (int source) throws Exception 
    {
          t.stop();
        t.setCycleCount(Timeline.INDEFINITE);
        bt=new Button();
    
        bt.setOnAction((event) -> {
             bt.setVisible(false);
          
            try {
                ress(false);
            } catch (Exception ex) {
                Logger.getLogger(Packet.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
                
        s=source;
            bt.setText(Integer.toString(s%(int)Math.pow(2, (FXMLDocumentController.sqlimit))));
        bt.setStyle("-fx-background-color: #990099");
       bt.setMinSize(10, 40);
          bt.setLayoutX(FXMLDocumentController.sd[s].getLayoutX());
            bt.setLayoutY(FXMLDocumentController.sd[s].getLayoutY());
         KeyFrame Frame=new KeyFrame(Duration.millis(100), new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
            if(bt.getLayoutY()>=FXMLDocumentController.sd[s+FXMLDocumentController.Packetnumber].getLayoutY())
                {
                     FXMLDocumentController.ll[FXMLDocumentController.currentL].setTextFill(Paint.valueOf("#00ff00"));
                    FXMLDocumentController.ll[FXMLDocumentController.currentL].setFont(new Font(28));
                 FXMLDocumentController.li[FXMLDocumentController.currentL].setStartX(80);
                    FXMLDocumentController.li[FXMLDocumentController.currentL].setStartY(FXMLDocumentController.star);
                    FXMLDocumentController.li[FXMLDocumentController.currentL].setEndX(423);
                      FXMLDocumentController.ll[FXMLDocumentController.currentL].setLayoutY((2*FXMLDocumentController.star+20)/2-60);
                    FXMLDocumentController.star+=20;
                    FXMLDocumentController.li[FXMLDocumentController.currentL].setEndY(FXMLDocumentController.star);
                      FXMLDocumentController.li[FXMLDocumentController.currentL].setStrokeWidth(5);
                      FXMLDocumentController.li[FXMLDocumentController.currentL].setStroke(Paint.valueOf("#00ff00"));
                    FXMLDocumentController.star+=30; 
                    FXMLDocumentController.ll[FXMLDocumentController.currentL].setText(Integer.toString(s%(int)Math.pow(2, (FXMLDocumentController.sqlimit)))/*+"->"*/);
                           FXMLDocumentController.ll[FXMLDocumentController.currentL].setLayoutX((66+422)/2);
                           FXMLDocumentController.ll[FXMLDocumentController.currentL].setMinSize(100, 100);
                           FXMLDocumentController.ll[FXMLDocumentController.currentL].setStyle(" -fx-font-family: \"TOXIA\" ;");
                        ++FXMLDocumentController.currentL;
                    FXMLDocumentController.sd[s+FXMLDocumentController.Packetnumber].setStyle("-fx-background-color: #33ff33");
                                              
                      bt.setStyle("-fx-background-color: #33ff33");
                         
                    try {
                        FXMLDocumentController.move_move(s+FXMLDocumentController.Packetnumber);
                        FXMLDocumentController.recst[s]=true;
                   FXMLDocumentController.Move_Window();
                    } catch (Exception ex) {
                        Logger.getLogger(Packet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                   run=false;
                    t.stop();
                }
                else
       bt.setLayoutY(bt.getLayoutY()+20);
    }
        });
           t.getKeyFrames().add(Frame);
           
        
    }
public synchronized Button getp  () throws Exception 
{
    return bt;
}
    public synchronized void run() throws Exception {
         run=true;
        bt.setVisible(true);
     
            
   
           
             
           if(newpa==true)
            t.playFromStart();
           else
               t.play();
            newpa=true;
        }
   
    
}
