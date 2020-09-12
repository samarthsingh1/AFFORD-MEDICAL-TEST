/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input
string is valid. An input string is valid if –
 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.
	*/


import java.util.*;
public class Practice {
	private HashMap<Character,Character> map;
	Practice(){
		this.map=new HashMap<Character,Character>();
		this.map.put(')', '(');
		this.map.put('}', '{');
		this.map.put(']','[');
	}
	
	public boolean checkValidity(String s) {
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			char d=s.charAt(i);
			if(this.map.containsKey(d)) {
				char tope=stack.empty( ) ? '@':stack.pop();
				
				if(tope!=this.map.get(d)) {
					return false;
				}
			}else {
				stack.push(d);
			}
		}
		return  stack.isEmpty();
       

	

		
		
		
		
			
		
		

	}
	public static void main(String[] args) {
		Practice p1=new Practice();
		p1.checkValidity("()[]{}");
	}

}
