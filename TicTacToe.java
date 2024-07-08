import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TicTacToe implements ActionListener {
    private JFrame frame;
    private JButton[] buttons = new JButton[9];
    private boolean playerX = true;

    public TicTacToe() {
        frame = new JFrame("Tic Tac Toe");
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(3, 3));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 60));
            buttons[i].setFocusPainted(false);
            buttons[i].addActionListener(this);
            frame.add(buttons[i]);
        }

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton) e.getSource();
        if (buttonClicked.getText().equals("")) {
            buttonClicked.setText(playerX ? "X" : "O");
            playerX = !playerX;
            checkWinner();
        }
    }

    private void checkWinner() {
        String[] patterns = {
            "012", "345", "678", // rows
            "036", "147", "258", // columns
            "048", "246"         // diagonals
        };

        for (String pattern : patterns) {
            if (buttons[pattern.charAt(0) - '0'].getText().equals(buttons[pattern.charAt(1) - '0'].getText()) &&
                buttons[pattern.charAt(1) - '0'].getText().equals(buttons[pattern.charAt(2) - '0'].getText()) &&
                !buttons[pattern.charAt(0) - '0'].getText().equals("")) {

                JOptionPane.showMessageDialog(frame, "Player " + buttons[pattern.charAt(0) - '0'].getText() + " wins!");
                resetGame();
                return;
            }
        }

        boolean full = true;
        for (JButton button : buttons) {
            if (button.getText().equals("")) {
                full = false;
                break;
            }
        }

        if (full) {
            JOptionPane.showMessageDialog(frame, "Draw!");
            resetGame();
        }
    }

    private void resetGame() {
        for (JButton button : buttons) {
            button.setText("");
        }
        playerX = true;
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
