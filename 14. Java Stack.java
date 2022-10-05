*** COPY PASTE THE LINK GIVEN BELOW ***

https://www.hackerrank.com/challenges/java-stack/problem

***************************************

ANSWER

import java.util.*; 
class Solution{

public static void main(String []argh)
{
    Scanner sc = new Scanner(System.in);

    String input="";
    while (sc.hasNext()) {
        input=sc.next();
        //Complete the code
        char[] charArr = input.toCharArray();
        int a=0,b=0,c=0,d=0,e=0,f=0;
        if(input.length()==0){
            System.out.println("true");
            break;
        }
        for(int i=0; i<charArr.length; i++){
            if(charArr[i]=='('){
                a+=1;
            }
            else if(charArr[i]==')'){
                b+=1;
            }
            else if(charArr[i]=='['){
                c+=1;
            }
            else if(charArr[i]==']'){
                d+=1;
            }
            else if(charArr[i]=='{'){
                e+=1;
            }
            else if(charArr[i]=='}'){
                if(e==0){
                    f-=1;
                    continue;
                }
                else{
                    f+=1;   
                }
            }
    }
    if(a==b && c==d && e==f){
        System.out.println("true");
    }
    else{
     System.out.println("false");   
    }    
    }

}
}
