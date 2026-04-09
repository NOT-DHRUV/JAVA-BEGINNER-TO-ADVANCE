📊 Multidimensional Arrays — “Arrays Inside Arrays Like Russian Dolls”

Imagine a chessboard ♟️
8x8 squares, each can hold a piece.

That's a 2D array!

👉 Multidimensional arrays = arrays of arrays.
👉 2D for tables, matrices, games.
👉 3D for cubes, complex data.

🧠 Why Multidimensional?
Games 🎮
Matrices 📈
Images 🖼️
Spreadsheets 📊

🏗️ How to Create 2D Arrays

1️⃣ Declare + Allocate
int[][] matrix = new int[3][4];

👉 3 rows, 4 columns

2️⃣ Declare + Initialize
int[][] matrix = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
};

👉 Java counts rows/columns automatically

🔢 Accessing Elements
matrix[0][0] = 1  // first row, first column
matrix[1][2] = 7  // second row, third column

🔁 Looping Through 2D Arrays

// Using nested for loops
for (int i = 0; i < matrix.length; i++) {        // rows
    for (int j = 0; j < matrix[i].length; j++) { // columns
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}

💬 Real World Example: Tic-Tac-Toe
char[][] board = new char[3][3];

// Place X at center
board[1][1] = 'X';

🎯 Pro Tip: Watch for ArrayIndexOutOfBoundsException!
Rows and columns start from 0 😅

🚀 3D Arrays (Advanced)
int[][][] cube = new int[2][3][4];

👉 Like a Rubik's cube
👉 Access: cube[0][1][2]