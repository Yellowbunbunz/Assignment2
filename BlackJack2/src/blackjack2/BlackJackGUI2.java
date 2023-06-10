
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blackjack2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gibbon
 */
public class BlackJackGUI2 extends javax.swing.JFrame {

    private Game game;

    public BlackJackGUI2() {
        initComponents();
        gamePanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userPanel = new javax.swing.JPanel();
        usernameBox = new javax.swing.JTextField();
        playButton = new javax.swing.JButton();
        gamePanel = new javax.swing.JPanel();
        hitButton = new javax.swing.JButton();
        standButton = new javax.swing.JButton();
        playerHand = new javax.swing.JLabel();
        playerBalance = new javax.swing.JLabel();
        dealerHand = new javax.swing.JLabel();
        gameStatus = new javax.swing.JLabel();
        logoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameBox.setText("Username");
        usernameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameBoxActionPerformed(evt);
            }
        });

        playButton.setText("Play!");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(usernameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(playButton)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addComponent(usernameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playButton)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        hitButton.setText("Hit!");
        hitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitButtonActionPerformed(evt);
            }
        });

        standButton.setText("Stand!");
        standButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standButtonActionPerformed(evt);
            }
        });

        playerHand.setText("Players Hand:");
        playerHand.setMaximumSize(new java.awt.Dimension(300, 300));

        playerBalance.setText("Player Balance");

        dealerHand.setText("Dealers Hand:");

        gameStatus.setText("Game Result: ");

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(playerHand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dealerHand, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameStatus))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(hitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(standButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                .addComponent(playerHand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dealerHand)
                .addGap(18, 18, 18)
                .addComponent(playerBalance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gameStatus)
                .addGap(18, 18, 18)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hitButton)
                    .addComponent(standButton))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("BLACKJACK!");

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoPanelLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(422, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        String name = usernameBox.getText();
        try {
            game = new Game(name, this);
            playGame(name);
        } catch (IOException ex) {
            Logger.getLogger(BlackJackGUI2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_playButtonActionPerformed

    private void usernameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameBoxActionPerformed

    private void standButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standButtonActionPerformed
        game.player.stand = true;
        updateUI();
        endGame();
    }//GEN-LAST:event_standButtonActionPerformed

    private void hitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitButtonActionPerformed
        /*   game.player.hit = true;
        if (game.player.wantsToHit() == true) {
            game.player.getHand().addCard(game.deck.removeCard());
            updateUI();
            game.player.hit = false;
            if (game.player.getHand().getValue() >= 21) {
                endGame();
            }
        }*/

        game.player.hit = true;
        if (game.player.wantsToHit() && game.player.getHand().getValue() < 21) {
            game.player.getHand().addCard(game.deck.removeCard());
            updateUI();
            if (game.player.getHand().getValue() >= 21 || game.player.wantsToStand()) {
                endGame();
            }
        }
    }//GEN-LAST:event_hitButtonActionPerformed
    //CHAT GPT GENERATED
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BlackJackGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlackJackGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlackJackGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlackJackGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlackJackGUI2().setVisible(true);
            }
        });
    }

    public void updateUI() {
        playerHand.setText("Player's Cards:" + game.player.getHand() + "\n Hand Value:" + game.player.getHand().getValue());
        dealerHand.setText("Dealer's Cards:" + game.dealer.getHand().getFirstCard() + "\n Hand Value: ?");
        playerBalance.setText("Player Balance:" + game.player.getBalance());
    }

    public void updatePlayerCards(String par) {
        // Update the player's cards in the GUI
        // Use the 'cards' parameter to display the player's cards
        playerHand.setText("Player's Cards:" + par);

    }

    public void updatePlayerHandValue(String par) {
        // Update the player's hand value in the GUI
        // Use the 'value' parameter to display the hand value
        playerHand.setText("Players Cards:" + par);
    }

    public void updatePlayerBalance(String par) {
        // Update the player's balance in the GUI
        // Use the 'balance' parameter to display the balance
        playerBalance.setText("Player Balance:" + par);
    }

    public void updateDealerCards(String par) {
        // Update the dealer's cards in the GUI
        dealerHand.setText("Dealer's Cards:" + par);
    }

    public void updateDealerHandValue(String par) {
        // Update the dealer's hand value in the GUI
        // Use the 'value' parameter to display the hand value
        dealerHand.setText("Hand Value:" + par);
    }

    public void updateGameStatus(String status) {
        // Update the game status in the GUI
        // Use the 'status' parameter to display the current game status
        gameStatus.setText("Result of Game: " + status);
    }

    public void endGame() {
        hitButton.setEnabled(false);
        standButton.setEnabled(false);
        dealerHand.setText("Dealers Cards: " + game.dealer.getHand() + " Hand Value: " + game.dealer.getHand().getValue());

        if (game.player.getHand().getValue() > 21 && game.dealer.getHand().getValue() <= 21) {
            gameStatus.setText("Player Busts, Dealer Wins!");
            game.player.updateBalance(-100);
        } else if (game.dealer.getHand().getValue() > 21 && game.player.getHand().getValue() <= 21) {
            gameStatus.setText("Dealer Busts, Player Wins!");
            game.player.updateBalance(100);
        } else if (game.player.getHand().getValue() > 21 && game.dealer.getHand().getValue() > 21) {
            gameStatus.setText("All Players Bust No Winner!");
        } else if (game.dealer.getHand().getValue() > game.player.getHand().getValue() && game.dealer.getHand().getValue() < 21) {
            gameStatus.setText("Dealer Wins!");
            game.player.updateBalance(-100);
        } else if (game.player.getHand().getValue() > game.dealer.getHand().getValue() && game.dealer.getHand().getValue() < 21) {
            gameStatus.setText("Player wins!");
            game.player.updateBalance(100);
        } else if (game.player.getHand().getValue() == game.dealer.getHand().getValue()) {
            gameStatus.setText("You tied with the dealer!");
        }
    }

    public void playGame(String name) 
    {
        game.Start();
    }

    //hello
    public void showGamePanel() {
        userPanel.setVisible(false);
        gamePanel.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel dealerHand;
    private javax.swing.JPanel gamePanel;
    public javax.swing.JLabel gameStatus;
    private javax.swing.JButton hitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JButton playButton;
    public javax.swing.JLabel playerBalance;
    public javax.swing.JLabel playerHand;
    private javax.swing.JButton standButton;
    private javax.swing.JPanel userPanel;
    private javax.swing.JTextField usernameBox;
    // End of variables declaration//GEN-END:variables
}
