import java.util.*;
public class one{
    public static int Binary(String str){
        if(str == null) return -1;
        int result = str.charAt(0)- '0';

        for(int i =1; i<str.length(); ){
            char ch = str.charAt(i);
            i++;
            if(ch == 'A'){
                result = result & str.charAt(i) - '0';
            }else if(ch == 'B'){
                result = result | str.charAt(i) - '0';
            }else{
                result = result ^ str.charAt(i) - '0';
            }
            i++;
        }
        return result;

    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("this is the ouput");
        
    }
}