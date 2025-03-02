
import com.mycompany.numberguesser.NumberGuesser;
import java.util.Random;
import java.awt.Color;

public class MyFrame extends javax.swing.JFrame {

    private int targetNumber;
    private int numGuessesLeft;
    private int allowedNumGuesses;
    private Random random = new Random();
    
    public MyFrame() {
        initComponents();
        targetNumber = random.nextInt(1000) + 1;
        numGuessesLeft = 10;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        guessesLeft = new javax.swing.JLabel();
        guessField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        useless1 = new javax.swing.JLabel();
        response = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(0, 51, 51));

        guessesLeft.setFont(new java.awt.Font("Cantarell Extra Bold", 1, 14)); // NOI18N
        guessesLeft.setForeground(new java.awt.Color(255, 255, 255));
        guessesLeft.setText("10");

        guessField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cantarell Extra Bold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("I'm thinking of a number betweeen 1 & 1,000... Guess it!");

        useless1.setFont(new java.awt.Font("Cantarell Extra Bold", 1, 14)); // NOI18N
        useless1.setForeground(new java.awt.Color(255, 255, 255));
        useless1.setText("Guesses left: ");

        response.setFont(new java.awt.Font("sansserif", 3, 13)); // NOI18N
        response.setForeground(new java.awt.Color(255, 255, 255));
        response.setText("RESPONSE");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(guessField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(useless1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guessesLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(response)))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(guessField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useless1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guessesLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(response))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(213, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guessFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessFieldActionPerformed
        if (numGuessesLeft == 0){
            response.setText("ALL YOUR GUESSES HAVE BEEN USED");
            response.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16)); 
            response.setForeground(Color.red);
            guessesLeft.setForeground(Color.red);
        }
        else {
            int guess = Integer.parseInt(guessField.getText().trim());
            if (guess > 1_000 || guess < 1){
                response.setText("INVALID INPUT");
                response.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16)); 
                response.setForeground(Color.red); 
            }

            else { // evaluate the acceptable guess.
                numGuessesLeft--;
                guessesLeft.setText(Integer.toString(numGuessesLeft)); // increment the guesses taken
                
                if (guess == targetNumber){
                    response.setText("CORRECT!!");
                    response.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16)); 
                    response.setForeground(Color.green); 
                }
                else if (guess < targetNumber){
                    response.setText("Too LOW!");
                    response.setForeground(Color.red);
                }
                else if (guess > targetNumber){
                    response.setText("Too High!");
                    response.setForeground(Color.red);
                }
            }
        System.out.println("guess");
        System.out.println(this.targetNumber);
        System.out.println(this.numGuessesLeft);
//        System.out.println(this.numGuesses);
        }
    }//GEN-LAST:event_guessFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTextField guessField;
    private javax.swing.JLabel guessesLeft;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel response;
    private javax.swing.JLabel useless1;
    // End of variables declaration//GEN-END:variables
}
