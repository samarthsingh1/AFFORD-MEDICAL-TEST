/*
Given a 2D board and a word, find if the word exists within the grid. The word can be constructed
from letters of sequentially adjacent cells, where "adjacent" cells are those horizontally or vertically
neighbouring. The same letter cell may not be used more than once.
*/
import java.util.*;
public class Practice {
	public boolean checkValidity(char[][] board,String str) {
		if(board==null||str==null) {
			return true;
		}
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;i++) {
				if(board[i][j]==str.charAt(0)&& dfs(board,i,j,0,str)) {
					return true;
				}
			}
		}
		return false;
	}
	public boolean dfs(char[][] board,int i1,int i2,int i3,String str) {
		if(i3==str.length()) {
			return true;
		}
		if(i1<0||i1>=board.length||i2<0||i2>board[i1].length||board[i1][i2]!=str.charAt(i3)) {
			return false;
		}
		char temp=board[i1][i2];
		board[i1][i2]=' ';
		boolean located=dfs(board,i1+1,i2,i3+1,str)||dfs(board,i1-1,i2,i3+1,str)||dfs(board,i1,i2+1,i3+1,str)||dfs(board,i1,i2-1,i3+1,str);
		board[i1][i2]=temp;
		return located;
	}
	
	

}
