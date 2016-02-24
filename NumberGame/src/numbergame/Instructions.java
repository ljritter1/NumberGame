/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author laurenritter
 */
public class Instructions extends JPanel implements ActionListener{
    private JButton exitButton;
    private JButton backButton;
    private JButton startButton;
    private JLabel instructions;
    private JLabel whatToDo;
    
    public Instructions(){
        JPanel instruct = new JPanel();
        
        instructions = new JLabel("Instructions");
        whatToDo = new JLabel("On the top of the screen you will see a number along with 'apples' containing numbers. Click the apples with the correct numbers to reach the goal number.");
        exitButton = new JButton("Exit");
        backButton = new JButton("Back to Main Screen");
        startButton = new JButton("Start Game!");
        
        instruct.add(instructions, BorderLayout.NORTH);
        instruct.add(whatToDo, BorderLayout.CENTER);
        instruct.add(exitButton, BorderLayout.SOUTH);
        instruct.add(backButton, BorderLayout.SOUTH);
        instruct.add(startButton, BorderLayout.SOUTH);
        
        instruct.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
