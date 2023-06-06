package blackjack2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BlackJackGUI extends JFrame implements ActionListener {

    private JLabel playerLabel;
    private JButton hitButton;
    private JButton standButton;
    private JLabel status = new JLabel(" ", JLabel.CENTER);
    private Game game;
    private BlackJack2 blackjack;

    BlackJackGUI(BlackJack2 blackjack) {
        this.blackjack = blackjack;
        
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
        getContentPane().add(status, BorderLayout.SOUTH);
    }

    public void handleHit() {

    }

    public void handleStand() {

    }

    public void startGame() {
        //Start Game
        //Game game = new Game(name);
        //game.Start();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == hitButton) {
            handleHit();
        } else if (e.getSource() == standButton) {
            handleStand();
        }
    }

    public void updateUI() {
        playerLabel.setText("Players Hand: " + game.player.getHand().getValue());
    }

    public void endGame() {
        //Displays the result of the game and asks if the player wants to continue
        String result;

        if (game.player.getHand().getValue() > 21 && game.dealer.getHand().getValue() <= 21) {
            result = "Player Busts, Dealer Wins!";
        } else if (game.dealer.getHand().getValue() > 21 && game.player.getHand().getValue() <= 21) {
            result = "Dealer Busts, Player Wins!";
        } else if (game.dealer.getHand().getValue() > game.player.getHand().getValue()) {
            result = "Dealer Wins!";
        } else if (game.player.getHand().getValue() > game.dealer.getHand().getValue()) {
            result = "Player wins!";
        } else if (game.player.getHand().getValue() == game.dealer.getHand().getValue()) {
            result = "You tied with the dealer!";
        } else {
            result = "All Players Bust, No Winner!";
        }

        status.setText(result);
    }

    //Play BlackJack Game
    public void playGame() {
        String name = blackjack.getPlayerName();

        try {
            game = new Game(name);
            game.Start();

            hitButton.setEnabled(true);
            standButton.setEnabled(true);
            updateUI();
        } catch (IOException ex) {
            Logger.getLogger(BlackJackGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
