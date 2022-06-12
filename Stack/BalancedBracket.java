import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        
        Scanner scn =new Scanner(System.in);
        String str=scn.nextLine();
        
        Stack<Character> st =new Stack<>();
        boolean ans=false;
        
        for(int i=0;i<str.length();i++){
            
            char ch =str.charAt(i);
            
            
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }else if(ch==')'||ch=='}'||ch==']'){
                
                if(ch==')'){
                    ans=balbracket(st,'(');
                }else if(ch=='}'){
                    ans=balbracket(st,'{');
                }else {
                    ans=balbracket(st,'[');
                }
            }
        }
        
        if(ans == true && st.size()==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    
    }
    public static boolean balbracket(Stack<Character> st, char a){
        
        if(st.size()==0){
            return false;
        }
        if(st.peek() == a){
            st.pop();
            return true;
        }else {
            return false;
        }
        
    }
    
}
