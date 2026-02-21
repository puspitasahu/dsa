package com.dsa.array_matrix;

public class RotateMatrix {
    public static void main(String[] args) {
        int [][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        rotateMatrix(matrix);
    }
    private static int[][] rotateMatrix(int [][] matrix){
        System.out.println("===============Initial Matrix=========");

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println(" ");
        }

        System.out.println("===============Transpose Matrix=========");
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println(" ");
        }

        System.out.println("===============Rotate Transpose Matrix=========");

        for(int i=0;i<row;i++){
            int left=0;
            int right=row-1;
            while(left<right){
                int temp=matrix[i][left];//00
                matrix[i][left]=matrix[i][right];//00-02
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }

        for(int i=0;i<row;i++){
                 for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println(" ");
        }

        return matrix;
    }
}
