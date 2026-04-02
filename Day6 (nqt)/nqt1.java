import java.util.*;
public class nqt1{
    public static int Union(int arr1[], int arr2[]){
        HashSet <Integer> s = new HashSet <> ();

        for (int i =0; i<arr1.length; i++){
            s.add(arr1[i]);
        }

          for (int i =0; i<arr2.length; i++){
            s.add(arr2[i]);
        }
            return s.size();
    }


    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //taking input
        int arr1[]=new int [n];
        for(int i =0; i<n; i++){
            arr1[i]= sc.nextInt();
        }
        //printing
    //    for(int i =0; i<arr1.length; i++){
    //     System.out.println(arr1[i]);
    //    }

        //second array input taking
        int n1 = sc.nextInt();
        int arr2[]= new int [n1];
        for(int i =0; i<n1; i++){
            arr2[i]= sc.nextInt();
        }

        System.out.print("your ouptu is" + Union(arr1,arr2));


    }
}