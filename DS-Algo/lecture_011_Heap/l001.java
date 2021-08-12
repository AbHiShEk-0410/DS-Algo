import java.util.PriorityQueue;

public class l001{
    public static void test1(){
        PriorityQueue<Integer>  pq = new PriorityQueue<>();
        for(int i = 10; i >= 1;i--) {
            pq.add(i * 10);
        }

        while(pq.size() != 0)
            System.out.println(pq.remove());
    }

    public static void Int_maxPQ(){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            return b - a;
        });

        for(int i = 10; i >= 1;i--)
            pq.add(i * 10);

        while(pq.size() != 0)
            System.out.println(pq.remove());
    }

    public static void matrixPQ(int[][] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>(())

    }

    public static class mobilePhone{
        String Company = "";
        String Model = "";
        int Ram = 0;
        int Storage = 0;
        int BatteryBackup = 0;

        mobilePhone(String Company,String Model,int Ram,int Storage,int BatteryBackup){
            this.Company = Company;
            this.Model = Model;
            this.Ram = Ram;
            this.Storage = Storage;
            this.BatteryBackup = BatteryBackup;
        }

        mobilePhone(){

        }

        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();

            sb.append("Company: " + this.Company + "\n");
            sb.append("Model: " + this.Model + "\n");
            sb.append("Ram: " + this.Ram + "GB\n");
            sb.append("Storage: " + this.Storage + "GB\n");
            sb.append("BatteryBackup: " + this.BatteryBackup + "mAH\n");
            
            return sb.toString();
        }
    }


    public static void main(String[] args){
        mobilePhone ph = new mobilePhone();
        System.out.println(ph);
    }
}