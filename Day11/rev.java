import java.util.*;
class rev{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int res =0;
    while(n!=0){
        res = res*10+n%10;
        n/=10;
    }
    System.out.print(res);
}
}
