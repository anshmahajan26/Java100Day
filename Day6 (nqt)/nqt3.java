import java.util.*;
class nqt3{
    public static int [] strength(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i =0; i<arr.length; i++){
            if (arr[i]> max){
                max = arr[i];
            }
            if(arr[i]< min){
                min = arr[i];
            }
        }
        return new int []{min,max};
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];

        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int result[]= strength(arr);
        System.out.println("min"+ result[0]);
         System.out.println("max" result[1]);        
    }
}