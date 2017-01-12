package practice;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			int k=in.nextInt();
			int m=in.nextInt();
			int[][] matrix1=new int[n][k];
			int [][] matrix2=new int[k][m];
			for(int i=0;i<n;i++){
				for(int j=0;j<k;j++){
					matrix1[i][j]=in.nextInt();
				}
			}
			for(int i=0;i<k;i++){
				for(int j=0;j<m;j++){
					matrix2[i][j]=in.nextInt();
				}
			}
			int[][] outMatrix=processing(matrix1,matrix2,n,k,m);
			for(int i=0;i<n;i++){
				for(int j=0;j<m-1;j++){
					System.out.print(outMatrix[i][j]);
					System.out.print(" ");
				}
				System.out.println(outMatrix[i][m-1]);
			}
		}
		in.close();
	}

	private static int[][] processing(int[][] matrix1, int[][] matrix2, int n, int k, int m) {
		int [][] mat=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				int sum=0;
				for(int r=0;r<k;r++){
					sum=sum+matrix1[i][r]*matrix2[r][j];
				}
				mat[i][j]=sum;
			}
		}
		return mat;
	}

}
