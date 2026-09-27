public class Rubik {
    int[][][] rubik = {
        {
            {1 , 2 , 3},
            {4 , 5 , 6},
            {7 , 8 , 9},
        },
        {
            {10 , 11 , 12},
            {13 , 14 , 15},
            {16 , 17 , 18},            
        },
        {
            {19 , 20 , 21},
            {22 , 23 , 24},
            {25 , 26 , 27},
        }
    };

    public void up(int num) {
        int size = rubik.length;
        int temp[][] = new int[size][size];

        for(int layer = 0; layer < size; layer++) {
            for(int row = 0; row < size; row++) {
                temp[layer][row] = rubik[row][size - 1 - layer][num];
            }
        }

        for(int layer = 0; layer < size; layer++) {
            for(int row = 0; row < size; row++) {
                rubik[layer][row][num] = temp[layer][row];
            }
        }

    }

    public void down(int num) {
        int size = rubik.length;
        int temp[][] = new int[size][size];

        for(int layer = 0; layer < size; layer++) {
            for(int row = 0; row < size; row++) {
                temp[layer][row] = rubik[size - 1 - row][layer][num];
            }
        }

        for(int layer = 0; layer < size; layer++) {
            for(int row = 0; row < size; row++) {
                rubik[layer][row][num] = temp[layer][row];
            }
        }

    }

    public void right(int num) {
        int size = rubik.length;
        int temp[][] = new int[size][size];

        for(int layer = 0; layer < size; layer++) {
            for(int column = 0; column < size; column++) {
                temp[layer][column] = rubik[size - 1 - column][num][layer];
            }
        }

        for(int layer = 0; layer < size; layer++) {
            for(int column = 0; column < size; column++) {
                rubik[layer][num][column] = temp[layer][column];
            }
        }

    }

    public void left(int num) {
        int size = rubik.length;
        int temp[][] = new int[size][size];

        for(int layer = 0; layer < size; layer++) {
            for(int column = 0; column < size; column++) {
                temp[layer][column] = rubik[column][num][size - 1 - layer];
            }
        }

        for(int layer = 0; layer < size; layer++) {
            for(int column = 0; column < size; column++) {
                rubik[layer][num][column] = temp[layer][column];
            }
        }

    }

    public void rotation(String rotate , int num) {
        switch (rotate) {
            case "up" -> {
                up(num);
            }
            case "down" -> {
                down(num);
            }
            case "right" -> {
                right(num);
            } 
            case "left" -> {
                left(num);
            }
        }
    }

    public void result() {
        for(int i = 0; i < rubik.length; i++) {
            for(int j = 0; j < rubik[i].length; j++) {
                    System.out.print(rubik[0][i][j] + " ");
            }
            System.out.println();
        }
    }
}