package blackjack2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BlackJackGUI extends JFrame implements ActionListener 
{
    private JLabel playerLabel;
    private JButton hitButton;
    private JButton standButton;
    private JLabel status = new JLabel(" ",JLabel.CENTER);
    private Game game;
    
    BlackJackGUI()
    {
        setTitle("BlackJack");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //GUI Componenets
        playerLabel = new JLabel("Players Hand: ");
        hitButton = new JButton("Hit!");
        standButton = new JButton("Stand!");
        
        //Create Panel and add Components to Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(playerLabel);
        buttonPanel.add(hitButton);
        buttonPanel.add(standButton);
        
        hitButton.addActionListener(this);
        hitButton.setEnabled(false);
        
        standButton.addActionListener(this);
        standButton.setEnabled(false);
        
        //Add Buttons, Status Bar.
        getContentPane().add(buttonPanel);

    }
    
    public void handleHit()
    {
        
    }   
    
    public void handleStand()
    {
        
    }
    
    
    public void startGame()
    {          
        //Start Game
        //Game game = new Game(name);
        //game.Start();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == hitButton)
        {
            handleHit();
        }
        else if (e.getSource() == standButton)
        {
            handleStand();
        }
    }
    
    public void updateUI()
    {
        playerLabel.setText("Players Hand: "+player.getHand().getValue());
    }
    
    public void endGame()
    {
        //Displays the result of the game and asks if the player wants to continue
        
    }
    
    //Play BlackJack Game
     public void playGame
    {
        BlackJack2 blackjack = new BlackJack2();
        String name = player.getPlayerName();
        
        Game game = null;
       
        try {
            game = new Game(name);
        } catch (IOException ex) {
            Logger.getLogger(BlackJackGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        game.Start();
    }
}