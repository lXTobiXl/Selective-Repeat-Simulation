/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;



import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
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
public class ACKNO {
    public int s;
     public  boolean run=false;
   Button bt;       
  public Timeline t=new Timeline();
    public synchronized void res()throws Exception 
    {
        if(run)
            t.stop();
        run=false;
         bt.setLayoutX(FXMLDocumentController.sd[s].getLayoutX());
            bt.setLayoutY(FXMLDocumentController.sd[s].getLayoutY());
             FXMLDocumentController.ackst[s-FXMLDocumentController.Packetnumber]=false;
              bt.setStyle("-fx-background-color: #009999");
            bt.setVisible(false);
    }
      public synchronized void ress()throws Exception 
    {
        if(run)
            t.stop();
        run=false;
         bt.setLayoutX(FXMLDocumentController.sd[s].getLayoutX());
            bt.setLayoutY(FXMLDocumentController.sd[s].getLayoutY());
              bt.setStyle("-fx-background-color: #009999");
            bt.setVisible(false);
            FXMLDocumentController.ackst[s-FXMLDocumentController.Packetnumber]=false;
            FXMLDocumentController.recst[s-FXMLDocumentController.Packetnumber]=false;
             FXMLDocumentController.ll[FXMLDocumentController.currentL].setTextFill(Paint.valueOf("#FF0000"));
                       FXMLDocumentController.ll[FXMLDocumentController.currentL].setFont(new Font(28));
                                 FXMLDocumentController.li[FXMLDocumentController.currentL].setStartX(423);
                
                    FXMLDocumentController.li[FXMLDocumentController.currentL].setEndX((80+422)/2);
                    FXMLDocumentController.li[FXMLDocumentController.currentL].setStartY(FXMLDocumentController.star);
                    FXMLDocumentController.li[FXMLDocumentController.currentL].setStrokeWidth(5);
                    FXMLDocumentController.ll[FXMLDocumentController.currentL].setLayoutY((2*FXMLDocumentController.star+20)/2-35);
                    FXMLDocumentController.star+=20; 
                        FXMLDocumentController.li[FXMLDocumentController.currentL].setEndY(FXMLDocumentController.star);
                           FXMLDocumentController.star+=30; 
                           FXMLDocumentController.ll[FXMLDocumentController.currentL].setText(Integer.toString((s-FXMLDocumentController.Packetnumber)%(int)Math.pow(2, (FXMLDocumentController.sqlimit)))/*+"<-"*/);
                           FXMLDocumentController.ll[FXMLDocumentController.currentL].setLayoutX((66+422)/2);
                           FXMLDocumentController.ll[FXMLDocumentController.currentL].setMinSize(40, 40);
                           FXMLDocumentController.ll[FXMLDocumentController.currentL].setStyle(" -fx-font-family: \"TOXIA\" ;");
                           FXMLDocumentController.li[FXMLDocumentController.currentL].setStroke(Paint.valueOf("#ff0000"));
                           ++FXMLDocumentController.currentL;
    }
    public  ACKNO(Button nice,int source) throws Exception 
    {
             t.stop();
        t.setCycleCount(Timeline.INDEFINITE);
        bt=nice;
    bt.setOnAction((event) -> {
            try {
                FXMLDocumentController.pp[s-FXMLDocumentController.Packetnumber].ress(true);  ress();
            } catch (Exception ex) {
                Logger.getLogger(ACKNO.class.getName()).log(Level.SEVERE, null, ex);
            }
                     
             
                    
         
        });
        s=source;
          bt.setText(Integer.toString((s-FXMLDocumentController.Packetnumber)%(int)Math.pow(2, FXMLDocumentController.sqlimit)));
          bt.setLayoutX(FXMLDocumentController.sd[s].getLayoutX());
            bt.setLayoutY(FXMLDocumentController.sd[s].getLayoutY());
        bt.setStyle("-fx-background-color: #009999");
           
       bt.setMinSize(10, 40);
          
            KeyFrame Frame=new KeyFrame(Duration.millis(100), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               run=true;
          
        if(bt.getLayoutY()<=FXMLDocumentController.sd[s-FXMLDocumentController.Packetnumber].getLayoutY())
                {
                      FXMLDocumentController.ll[FXMLDocumentController.currentL].setTextFill(Paint.valueOf("#00ff00"));
                       FXMLDocumentController.ll[FXMLDocumentController.currentL].setFont(new Font(28));
                                 FXMLDocumentController.li[FXMLDocumentController.currentL].setStartX(423);
                
                    FXMLDocumentController.li[FXMLDocumentController.currentL].setEndX(80);
                    FXMLDocumentController.li[FXMLDocumentController.currentL].setStartY(FXMLDocumentController.star);
                    FXMLDocumentController.li[FXMLDocumentController.currentL].setStrokeWidth(5);
                    FXMLDocumentController.ll[FXMLDocumentController.currentL].setLayoutY((2*FXMLDocumentController.star+20)/2-35);
                    FXMLDocumentController.star+=20; 
                        FXMLDocumentController.li[FXMLDocumentController.currentL].setEndY(FXMLDocumentController.star);
                           FXMLDocumentController.star+=30; 
                           FXMLDocumentController.ll[FXMLDocumentController.currentL].setText(Integer.toString((s-FXMLDocumentController.Packetnumber)%(int)Math.pow(2, (FXMLDocumentController.sqlimit)))/*+"<-"*/);
                           FXMLDocumentController.ll[FXMLDocumentController.currentL].setLayoutX((66+422)/2);
                           FXMLDocumentController.ll[FXMLDocumentController.currentL].setMinSize(40, 40);
                           FXMLDocumentController.ll[FXMLDocumentController.currentL].setStyle(" -fx-font-family: \"TOXIA\" ;");
                           FXMLDocumentController.li[FXMLDocumentController.currentL].setStroke(Paint.valueOf("#00ff00"));
                           ++FXMLDocumentController.currentL;
                    bt.setStyle("-fx-background-color: #6666ff  ");
                 
                        FXMLDocumentController.ackst[s-FXMLDocumentController.Packetnumber]=true;
                         
                    try {
                        FXMLDocumentController.Move_Window();
                    } catch (Exception ex) {
                        Logger.getLogger(ACKNO.class.getName()).log(Level.SEVERE, null, ex);
                    }
                      run=false;
                    t.stop();
                }
                else
       bt.setLayoutY(bt.getLayoutY()-20);
            }
        });
           t.getKeyFrames().add(Frame);
        
    }
   public synchronized Button getp()throws Exception 
    {
        return bt;
    }
    public synchronized void run()throws Exception  {
   
            run=true;
  
          
             t.playFromStart();
        }
    //}
    
}
