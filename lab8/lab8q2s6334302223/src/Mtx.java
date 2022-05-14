
/**
 *
 * @author 6334302223 Kamolrut Sonti
 */
public class Mtx {

    private int row, column;
    private int[][] matrix;

 public Mtx(int[][] matrix) {
        row = matrix.length;
        column = matrix[0].length;
        this.matrix = new int[row][column];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                    this.matrix[i][j] = matrix[i][j];
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public boolean equalSize(Mtx B) {
        boolean isequals = false;
        if ((this.row == B.row) && (this.column == B.column)) {
            isequals = true;
        } else {
            isequals = false;
        }
        return isequals;
    }

    public boolean compatible(Mtx C) {
        boolean iscompatible = false;
        if (this.column == C.getRow()) 
            iscompatible = true;
        return iscompatible;
    }

    public int[][] add(Mtx D) {
        int c[][] = new int[row][column];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                c[i][j] = this.matrix[i][j] + D.matrix[i][j];
            }
        }
        return c;
    }

    public int[][] mulM(Mtx E) {
        int[][] MtxH = new int[this.row][E.column];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < E.column; j++) {
                for (int k = 0; k < E.column; k++) {
                    MtxH[i][j] += (this.matrix[i][k] * E.matrix[k][j]);
                }
            }
        }
        return MtxH;
    }

    public int[][] mulS(int n) {
        int[][] MtxC = new int[this.row][this.column];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                MtxC[i][j] = (this.matrix[i][j] * n);
            }
        }
        return MtxC;
    }

    public static void ShowMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

