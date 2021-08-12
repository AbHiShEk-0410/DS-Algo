import java.util.PriorityQueue;
import java.util.Scanner;

public class basics{
    public static Scanner sc = new Scanner(System.in);

    public static void Int_minPQ(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 10; i >= 1;i--)
            pq.add(i * 10);

        while(pq.size() != 0)
            System.out.println(pq.remove());
    }

    public static void Int_maxPQ(){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            return b - a;
        });

        for(int i = 10; i >= 1; i--)
            pq.add(i * 10);

        while(pq.size() != 0)
         System.out.println(pq.remove());
    }

    public static void matrixPQ(){
        int[][] arr = {{ 2, 6, 11, 3 }, { 8, 5, 16, 4 }, { 9, 7, 11, 13 }, { 8, 3, 12, 11 } };
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            return a[1] - b[1];
        });

        for(int[] a :arr)
            pq.add(a);

        while(pq.size() != 0){
            int[] a = pq.remove();
            for(int ele : a)
                System.out.println(ele + " ");
            System.out.println();
        }   
    }

    public static class mobilePhone {
        String Company = "";
        String Model = "";
        int Ram = 0;
        int Storage = 0;
        int BatteryBackup = 0;

        mobilePhone(String Company, String Model, int Ram, int Storage, int BatteryBackup) {
            this.Company = Company;
            this.Model = Model;
            this.Ram = Ram;
            this.Storage = Storage;
            this.BatteryBackup = BatteryBackup;
        }

        mobilePhone() {

        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();

            sb.append("Company: " + this.Company + "\n");
            sb.append("Model: " + this.Model + "\n");
            sb.append("Ram: " + this.Ram + "GB\n");
            sb.append("Storage: " + this.Storage + "GB\n");
            sb.append("BatteryBackup: " + this.BatteryBackup + "mAH\n");

            return sb.toString();
        }
    }
}