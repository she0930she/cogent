package com.cogent.codingChallenge.set22_matrix;

import java.util.Arrays;

public class Flip {
	
	// 1. WAP to Print a 2D Array
	public static void  print2D(int[][] matrix){
		for (int i=0; i< matrix.length; i++) {
			for (int j=0; j< matrix[0].length; j++) {
				System.out.println(matrix[i][j]);
			}
		}
		
	}
	
	public static int[][] createMatrix(int rows, int cols, int value){
		
		int[][] matrix = new int[rows][cols];
		
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value;
                value++;
            }
        }
		
		return matrix;
	}
	
	
	// 2.WAP to Add Two Matrices
	public static int[][] add2Matrices(int[][]max1, int[][]max2){
		
		int[][] res = new int[max1.length][max1[0].length];
		
        for (int i = 0; i < max1.length; i++) {
            for (int j = 0; j < max1[0].length; j++) {
                res[i][j] = max1[i][j] + max2[i][j];
            }
        }
		
		return res;
	}
	
	// 3.WAP to Sort the 2D Array Across Columns
	public static int[][] sortInCol(int[][] matrix){
		
		for (int j = 0; j < matrix[0].length; j++) {
			
			int[] tmp =new int[matrix.length]; //column length
			
			// loop column
			for (int i = 0; i< matrix.length; i++) {
				tmp[i] = matrix[i][j];
			}
			
			Arrays.sort(tmp);
			
			for (int i = 0; i< matrix.length; i++) {
				matrix[i][j] =tmp[i];
				System.out.println(matrix[i][j]);
			}

		}
		
		return matrix;
	}
	
	
	// 4.WAP to Check Whether Two Matrices Are Equal or Not
	public static boolean isTheSameMatrix(int[][] max1, int[][] max2) {
		if(max1.length != max2.length) {
			return false;
		}
		if(max1[0].length != max2[0].length) {
			return false;
		}
		
		for (int i = 0; i < max1.length; i++) {
            for (int j = 0; j < max1[0].length; j++) {
                
            	if (max1[i][j] != max2[i][j]) {
            		return false;
            	}
            	
            }
        }
		
		return true;
	}

	
	// 5.WAP to Find the Transpose
	public static int[][] transposeMatrix(int[][] matrix){
		int[][] res = new int[matrix[0].length][matrix.length];
		
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                res[j][i] = matrix[i][j];
            }
            
        }
        print2D(res);
        return res;
        
	}
	
	
	
	// 6.WAP to Find the Determinant
	public static int findDeterminant(int[][] mat) {
		
		return 1;
	}
	
	public static int determinant(int[][] mat) {
		
		return 1;
	}
	
	
	
	
	// 7.WAP to Find the Normal and Trace, 7-1
	public static int findTrace (int[][] mat) {
		int res = 0;
		
        for (int i = 0; i < mat.length; i++) {
        	res += mat[i][i];
            
        }
		
		return res;
	}
	
	
	
	// 7-2 to Find the Normal
	public static int findNormal (int[][] mat) {
		int res = 0;
		
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                res += mat[i][j]* mat[i][j];
            }
            
        }
		
		return res;
	}	
	
	
	// 8.WAP to Print Boundary Elements of a Matrix
	public static void printBoundary(int[][] mat) {
		int lastIdx = mat[0].length-1;
		
		for (int j = 0; j< lastIdx; j++) {  // not print last one
			System.out.println(mat[0][j]);
		}
		
		for (int i = 0; i< mat.length-1; i++) {    // not print last one
			System.out.println(mat[i][lastIdx]);
		}
		
		for (int j = lastIdx; j>0; j--) {  // not print last one
			System.out.println(mat[lastIdx][j]);
		}
		
		for (int i = mat.length-1; i> 0; i--) {    // not print last one
			System.out.println(mat[i][0]);
		}
		
	}

	
	
	
	// 9.WAP to Rotate Matrix Elements
	
	
	
	
	
   // 10.WAP to Compute the Sum of Diagonals of a Matrix
	
	
	
	
   // 11.WAP to Interchange Elements of First and Last in a Matrix Across Rows
	
	
	
	
	
	
    //12.WAP to Interchange Elements of First and Last in a Matrix Across Columns

	

	public static void main(String[] args) {
		
		int[][] matrix =createMatrix(4,4, 1);
		int[][] matrix2 =createMatrix(4,4, 2);
		
		print2D(matrix);
		
		int[][] tmp = add2Matrices(matrix, matrix2);
		System.out.println("==== Q2:  ===== ");
		print2D( tmp);
		
		System.out.println("==== Q3:  ===== ");
		 int[][] firstMatrix = { 
				 { 7, 2, 0, 5, 1 },
                 { 3, 8, 2, 9, 14 },
                 { 5, 1, 0, 5, 2 },
                 { 4, 2, 6, 0, 1 }  
		 		};
		sortInCol(firstMatrix);
		System.out.println("==== Q5:  ===== ");
		transposeMatrix(new int[][] {{1,2,3},{4,5,6}});
		
		System.out.println("==== Q7-1:  ===== ");
		int[][] matOne = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(findTrace(matOne));
		System.out.println("==== Q7-2:  ===== ");
		System.out.println(findNormal(matOne));
		
		System.out.println("==== Q8:  ===== ");
		printBoundary(matOne);
		
		

		
	}

}
