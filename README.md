# Prasunet_AD_04


# Tic Tac Toe Game

## Overview

This is a simple Tic Tac Toe game implemented in Java using Swing for the graphical user interface (GUI). The game allows two players to take turns placing their symbols (X or O) on a 3x3 grid. The objective is to form a horizontal, vertical, or diagonal line of three of their symbols to win the game. The app includes a reset option to start a new game.

## Features

- Two-player mode
- Easy-to-use graphical interface
- Automatic win/draw detection
- Game reset functionality

## Prerequisites

- Java Development Kit (JDK) 11 or later
- Visual Studio Code (VS Code)
- Java Extension Pack for VS Code

## Installation

1. **Clone the repository**:
   ```sh
   git clone https://github.com/yourusername/TicTacToe.git
   cd TicTacToe
   ```

2. **Open the project in VS Code**:
   ```sh
   code .
   ```

3. **Ensure you have the Java Extension Pack installed**:
   - Open the Extensions view in VS Code (`Ctrl+Shift+X`).
   - Search for "Java Extension Pack" and install it if it's not already installed.

4. **Play the game**:
   - The Tic Tac Toe game window should appear.
   - Click the buttons to place X and O on the grid.
   - The game will automatically check for a winner after each move and display a message if someone wins or if the game is a draw.
   - The game will reset for a new round after a win or a draw.

## Code Explanation

### GUI Setup

- A `JFrame` is created to act as the main window.
- A 3x3 `GridLayout` is used to arrange the buttons in a 3x3 grid.
- Nine `JButton` instances are created and added to the frame.

### Action Listener

- Each button is given an action listener to handle clicks. When a button is clicked, the text is set to "X" or "O" based on the current player.

### Check Winner

- The `checkWinner` method checks predefined patterns (rows, columns, diagonals) to determine if there is a winner.
- If a winning pattern is found, a message dialog is displayed, and the game is reset.
- If the board is full and there is no winner, a draw message is shown, and the game is reset.

### Reset Game

- The `resetGame` method clears the text of all buttons to start a new game.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.



---
This README file provides an overview of the project, installation instructions, usage details, a brief code explanation, and other relevant information.
