import java.util.*;
class Solution{
	
	public static void main(String []args)	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(isbalanced(input));
		}
	}
    public static boolean isbalanced(String input){
        Stack<Character> st=new Stack <Character>();
        for(int i=0 ; i<input.length();i++){
            if(input.charAt(i)=='(' || input.charAt(i)=='[' || input.charAt(i)=='{'){
            st.push(input.charAt(i));
            }else if(st.empty()){
                return false;
            }else{
                char top=st.pop();
                if(top=='(' && input.charAt(i)!=')' || top=='[' && input.charAt(i)!=']' || top=='{' && input.charAt(i)!='}' )
                return false;
            }
        }
                    return st.empty();        
    }
    }
