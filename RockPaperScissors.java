/*
   Practice working with the Options Dialog, random number generator, and also 
   formatting the text on a JOption Pane 
   Kamsiyochukwu Uwah & Osedinso Richard Ikeadish
   02-26-2022
 */

import java.util.*;
import javax.swing.*;


public class RockPaperScissors {
    
  public static void main(String[] args) {
     
    ImageIcon introIcon = new ImageIcon("intro.png");
    JOptionPane.showMessageDialog(null,"This is a simple rock, paper, scissors \n"
            + "game that allows the user to play against\n"
            + "the computer for three rounds,and then\n"
            + "display the results of the three rounds\n",
            "Introduction                        Kamsi Uwah & Osedinso RI",0,introIcon);
       
    ImageIcon icon = new ImageIcon("RPS.png");
    ImageIcon resultIcon = new ImageIcon("RPS2.png");
    ImageIcon score_board_icon = new ImageIcon("rockpaperscissors.jpg");
    
    int counter = 0;
    int player_win = 0;
    int computer_win = 0;
    int tie = 0;
            
    while (counter<3)
    {
       String prompt = "Please click on one of \n"+
                    "the following buttons, \n"+
                    "corresponding to your play \n";
       String[] choices = {"Rock","Paper","Scissors"};
       int choice = JOptionPane.showOptionDialog(null,prompt,
            "Play \"Rock, Paper, Scissors\"        Kamsi Uwah & Osedinso RI",
            0, 0, icon, choices, choices[0]);
       String player_choice = "";
       String computer_choice = "";
    
       switch(choice)
       {
          case 0:
            player_choice = "\"Rock\"";
            break;
          case 1:
            player_choice = "\"Paper\"";
            break;
          case 2:
            player_choice = "\"Scissors\"";
        }
    
        String resultsAccumulator = "You played "+ player_choice+"\n";
    
        Random randGen = new Random();
        int second_choice = randGen.nextInt(3);
    
      switch(second_choice)
      {
          case 0:
            computer_choice = "\"Rock\"";
            break;
          case 1:
            computer_choice = "\"Paper\"";
            break;
          case 2:
            computer_choice = "\"Scissors\"";
       }
    
       resultsAccumulator += "The computer chose "+ computer_choice+"\n";
    
      if(computer_choice.equals(player_choice))
      {
         resultIcon = new ImageIcon("RPS2.png");
         resultsAccumulator += "<html><h2>It's a tie!</h2>";
         tie++;
      }
      else if(computer_choice.equals("\"Rock\"") && player_choice.equals("\"Paper\""))
      {
          resultIcon = new ImageIcon("paperWrapsRock.png");
          resultsAccumulator += "<html><h2>Paper wraps rock!<br></h2>"+
                              "<html><h3>You win!</h3>";
          player_win++;
      }
      else if(computer_choice.equals("\"Paper\"") && player_choice.equals("\"Scissors\""))
      {
         resultIcon = new ImageIcon("scissorCutPaper.png");
         resultsAccumulator += "<html><h2>Scissors cuts paper!<br></h2>"+
                              "<html><h3>Computer wins!</h3>"; 
         computer_win++;
      }
      else if(computer_choice.equals("\"Rock\"") && player_choice.equals("\"Scissors\""))
      {
          resultIcon= new ImageIcon("rockCrushScissor.png");
          resultsAccumulator += "<html><h2>Rock crushes scissors!<br></h2>"+
                              "<html><h3>Computer wins!</h3>";
          computer_win++;   
      }
      else if(computer_choice.equals("\"Paper\"") && player_choice.equals("\"Rock\""))
      {
         resultIcon = new ImageIcon("paperWrapsRock.png");
         resultsAccumulator += "<html><h2>Paper wraps rock!<br></h2>"+
                              "<html><h3>Computer wins!</h3>";  
         computer_win++;       
      }
      else if(computer_choice.equals("\"Scissors\"") && player_choice.equals("\"Rock\""))
      {
         resultIcon = new ImageIcon("rockCrushScissor.png");
         resultsAccumulator += "<html><h2>Rock crushes scissors!<br></h2>"+
                              "<html><h3>You win!</h3>";  
         player_win++;     
      }
      else if(computer_choice.equals("\"Scissors\"") && player_choice.equals("\"Paper\""))
      {
         resultIcon = new ImageIcon("scissorCutPaper.png");
         resultsAccumulator += "<html><h2>Scissors cuts paper!<br></h2>"+
                              "<html><h3>You win!</h3>";  
         player_win++;       
      }
      JOptionPane.showMessageDialog(null, resultsAccumulator,
            "End of round results           Kamsi Uwah & Osedinso RI",
            0, resultIcon);
      counter++;
    }
    JOptionPane.showMessageDialog(null,"Final score board for 3 games\n"+
            "<html><h2>Wins : "+player_win+"<br>"+"Losses : "+computer_win+"<br>"+"Ties : "+
            tie+"</h2>","Final Score Board                           Kamsi Uwah & Osedinso RI",
            0,score_board_icon);
    
    
    }
    
   
    
}
