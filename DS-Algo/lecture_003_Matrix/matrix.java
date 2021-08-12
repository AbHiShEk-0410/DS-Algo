import java.util.*;
public class matrix{
    public static Scanner sc = new Scanner (System.in);

    public static void input(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0 ;i < n;i++){
            for(int j = 0;j < m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void display(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0 ;i < n;i++){
            for(int j = 0;j < m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void maximum(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int maxEle = -(int)1e9;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                maxEle = Math.max(arr[i][j],maxEle);
            }
        }
        System.out.println(maxEle);
    }

    public static void minimum(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int maxEle = (int)1e9;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                maxEle = Math.min(arr[i][j],maxEle);
            }
        }
        System.out.println(maxEle);
    }

    public static boolean find(int[][] arr,int data){
        boolean ans = false;
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0 ;i < n ;i++){
            for(int j = 0 ;j < m;j++){
                ans = arr[i][j] == data;
                if(ans)
                    return ans;
            }
        }
        return ans;
    }

    public static void display2(int[][] arr){
        for(int[] a :arr){
            for(int e : a){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

    public static void stateOfWakanda(int[][] arr){
        int n =  arr.length;
        int m = arr[0].length;
        for(int j = 0 ;j < m;j++){
            if(j % 2 == 0){
                for(int i = 0;i < n;i++){
                System.out.println(arr[i][j]);
                }
            }else{
                for(int i = n - 1;i >= 0;i++){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
    public static void main(String[] args){
        int[][] arr = new int[sc.nextInt()][sc.nextInt()];
        input(arr);
        display2(arr);
        maximum(arr);
    }
}