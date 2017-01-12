package practice;

import java.util.Scanner;


public class LongestSubstringLink {
	
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  String input = sc.nextLine().trim();
		  String[] arr = input.split(" ");
		  maxCatenate(arr);
		  sc.close();
	 }
   
	 public static void maxCatenate(String[] text)
	 {
		  int[][] G = new int[text.length][text.length];
		  String[][] T = new String[text.length][text.length];
		  for(int i=0; i<G.length; i++)
		  {
			   String suffix = text[i].substring(1);
			   for(int j=i+1; j<G.length; j++) {
				    if(text[j].indexOf(suffix)==0) {
					     G[i][j] = 1;
					     T[i][j] = text[j].substring(text[j].length()-1);
				    }
			   }  
		  }
		  for(int k=0; k<G.length; k++){
			  for(int i=0; i<G.length; i++){
				  for(int j=0; j<G.length; j++)
				  {
					  if(G[i][k]!=0&&G[k][j]!=0) {
						  int dist = G[i][k] + G[k][j];
					      if(dist>G[i][j]) {
					    	  G[i][j] = dist; 
						      T[i][j] = T[i][k] + T[k][j];
					      }
					       
					   }
				  }					     
			  }			    
		  }
		   
		  int max = 0;
		  int start=0;
		  int end=0;
		  for(int i=0; i<G.length; i++) {
			   for(int j=0; j<G.length; j++) {
				    if(max<G[i][j] && i!=j){
					     max=G[i][j];
					     start=i;
					     end=j;
				    }    
			   }  
		  }
		  if(start!=end) {
		   System.out.println(text[start]+T[start][end]);
		  }
	 }
}