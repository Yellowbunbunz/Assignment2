/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blackjack2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
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
        dealerHand = new javax.swing.JLabel();
        playerHand = new javax.swing.JLabel();
        playerBalance = new javax.swing.JLabel();
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
                        .addGap(30, 30, 30)
                        .addComponent(usernameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
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

        dealerHand.setText("Dealers Hand:");

        playerHand.setText("Players Hand:");

        playerBalance.setText("Player Balance");

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePanelLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(hitButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(standButton))
                            .addGroup(gamePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(playerHand, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(dealerHand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playerHand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dealerHand)
                .addGap(48, 48, 48)
                .addComponent(playerBalance)
                .addGap(45, 45, 45)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hitButton)
                    .addComponent(standButton))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("BLACKJACK!");

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(482, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        String name = usernameBox.getText();
        try {
            game = new Game(name);
        } catch (IOException ex) {
            Logger.getLogger(BlackJackGUI2.class.getName()).log(Level.SEVERE, null, ex);
        }
        playGame(name);
    }//GEN-LAST:event_playButtonActionPerformed

    private void usernameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameBoxActionPerformed

    private void standButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standButtonActionPerformed
        if (game != null) {
            if (!game.player.wantsToHit()) {
                updateUI();
                endGame();
            }
        }
    }//GEN-LAST:event_standButtonActionPerformed

    private void hitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitButtonActionPerformed
        if (game != null && game.player.getHand().getValue() < 21) {
            game.player.getHand().addCard(game.deck.removeCard());
            updateUI();
            if (game.player.getHand().getValue() >= 21) {
                endGame();
            }
        }
    }//GEN-LAST:event_hitButtonActionPerformed

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
        dealerHand.setText("Dealer's Cards:" + game.player.getHand() + "\n Hand Value:" + game.dealer.getHand().getValue());
        playerBalance.setText("Player Balance:" + game.player.getBalance());
    }
    
    public void updatePlayerCards(String cards) {
        // Update the player's cards in the GUI
        // Use the 'cards' parameter to display the player's cards
        
    }
    
    public void updatePlayerHandValue(int value) {
        // Update the player's hand value in the GUI
        // Use the 'value' parameter to display the hand value
        playerHand.setText("Players Cards:" + game.player.getHand());
    }
    
    public void updatePlayerBalance(double balance) {
        // Update the player's balance in the GUI
        // Use the 'balance' parameter to display the balance
        playerBalance.setText("Player Balance:" + game.player.getBalance());
    }
    
    public void updateDealerCards(String cards) {
        // Update the dealer's cards in the GUI
       dealerHand.setText("Dealer's Cards:" + game.player.getHand());
    }
    
    public void updateDealerHandValue(int value) {
        // Update the dealer's hand value in the GUI
        // Use the 'value' parameter to display the hand value
        dealerHand.setText("Hand Value:" + game.dealer.getHand().getValue());
    }
    
    public void updateGameStatus(String status) {
        // Update the game status in the GUI
        // Use the 'status' parameter to display the current game status
    }

    public void endGame() {
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

        // jTextArea1.setText(result);
        if (result.equals("Player Busts, Dealer Wins!")
                || result.equals("Dealer Busts, Player Wins!")
                || result.equals("Dealer Wins!")
                || result.equals("Player wins!")
                || result.equals("You tied with the dealer!")
                || result.equals("All Players Bust, No Winner!")) {
            hitButton.setEnabled(false);
            standButton.setEnabled(false);
        }
    }

    public void playGame(String name) {
        try {
            game = new Game(name);
            game.Start();
            updateUI();
            userPanel.setVisible(false);
            gamePanel.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(BlackJackGUI2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dealerHand;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JButton hitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel playerBalance;
    private javax.swing.JLabel playerHand;
    private javax.swing.JButton standButton;
    private javax.swing.JPanel userPanel;
    private javax.swing.JTextField usernameBox;
    // End of variables declaration//GEN-END:variables
}
