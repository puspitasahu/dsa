package com.dsa.array_matrix;

public class TwoDMatrix{
    public static void main(String[] args){
        int [][] matrix={{1,2,3},{4,0,6},{7,8,9} };
        twoDMatrix(matrix);
    }

    private static void twoDMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
           // for(int j=0;j<matrix[0].length;j++){//Works for rectangular matrices
            for(int j=0;j<matrix[i].length;j++){//Works for jagged arrays
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
